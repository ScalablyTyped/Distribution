package typings.uirouterAngularjs

import typings.std.RegExp
import typings.uirouterCore.commonCommonMod.IInjectable
import typings.uirouterCore.coreservicesMod.InjectorLike
import typings.uirouterCore.coreservicesMod.LocationServices
import typings.uirouterCore.mod.UIRouter
import typings.uirouterCore.mod.UrlMatcher
import typings.uirouterCore.mod.UrlRouter
import typings.uirouterCore.urlInterfaceMod.UrlRuleHandlerFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/angularjs/lib/urlRouterProvider", JSImport.Namespace)
@js.native
object urlRouterProviderMod extends js.Object {
  @js.native
  class UrlRouterProvider protected () extends js.Object {
    /** @hidden */
    def this(/** @hidden */ router: UIRouter) = this()
    var router: js.Any = js.native
    /** @hidden */
    @JSName("$get")
    def $get(): UrlRouter = js.native
    /**
      * Disables monitoring of the URL.
      *
      * Call this method before UI-Router has bootstrapped.
      * It will stop UI-Router from performing the initial url sync.
      *
      * This can be useful to perform some asynchronous initialization before the router starts.
      * Once the initialization is complete, call [[listen]] to tell UI-Router to start watching and synchronizing the URL.
      *
      * #### Example:
      * ```js
      * var app = angular.module('app', ['ui.router']);
      *
      * app.config(function ($urlRouterProvider) {
      *   // Prevent $urlRouter from automatically intercepting URL changes;
      *   $urlRouterProvider.deferIntercept();
      * })
      *
      * app.run(function (MyService, $urlRouter, $http) {
      *   $http.get("/stuff").then(function(resp) {
      *     MyService.doStuff(resp.data);
      *     $urlRouter.listen();
      *     $urlRouter.sync();
      *   });
      * });
      * ```
      *
      * @param defer Indicates whether to defer location change interception.
      *        Passing no parameter is equivalent to `true`.
      */
    def deferIntercept(): Unit = js.native
    def deferIntercept(defer: Boolean): Unit = js.native
    /**
      * Defines the path or behavior to use when no url can be matched.
      *
      * #### Example:
      * ```js
      * var app = angular.module('app', ['ui.router.router']);
      *
      * app.config(function ($urlRouterProvider) {
      *   // if the path doesn't match any of the urls you configured
      *   // otherwise will take care of routing the user to the
      *   // specified url
      *   $urlRouterProvider.otherwise('/index');
      *
      *   // Example of using function rule as param
      *   $urlRouterProvider.otherwise(function ($injector, $location) {
      *     return '/a/valid/url';
      *   });
      * });
      * ```
      *
      * @param rule
      * The url path you want to redirect to or a function rule that returns the url path or performs a `$state.go()`.
      * The function version is passed two params: `$injector` and `$location` services, and should return a url string.
      *
      * @return {object} `$urlRouterProvider` - `$urlRouterProvider` instance
      */
    def otherwise(rule: String): UrlRouterProvider = js.native
    def otherwise(rule: RawNg1RuleFunction): UrlRouterProvider = js.native
    /**
      * Registers a url handler function.
      *
      * Registers a low level url handler (a `rule`).
      * A rule detects specific URL patterns and returns a redirect, or performs some action.
      *
      * If a rule returns a string, the URL is replaced with the string, and all rules are fired again.
      *
      * #### Example:
      * ```js
      * var app = angular.module('app', ['ui.router.router']);
      *
      * app.config(function ($urlRouterProvider) {
      *   // Here's an example of how you might allow case insensitive urls
      *   $urlRouterProvider.rule(function ($injector, $location) {
      *     var path = $location.path(),
      *         normalized = path.toLowerCase();
      *
      *     if (path !== normalized) {
      *       return normalized;
      *     }
      *   });
      * });
      * ```
      *
      * @param ruleFn
      * Handler function that takes `$injector` and `$location` services as arguments.
      * You can use them to detect a url and return a different url as a string.
      *
      * @return [[UrlRouterProvider]] (`this`)
      */
    def rule(ruleFn: RawNg1RuleFunction): UrlRouterProvider = js.native
    def when(what: String, handler: String): this.type = js.native
    def when(what: String, handler: IInjectable): this.type = js.native
    /**
      * Registers a handler for a given url matching.
      *
      * If the handler is a string, it is
      * treated as a redirect, and is interpolated according to the syntax of match
      * (i.e. like `String.replace()` for `RegExp`, or like a `UrlMatcher` pattern otherwise).
      *
      * If the handler is a function, it is injectable.
      * It gets invoked if `$location` matches.
      * You have the option of inject the match object as `$match`.
      *
      * The handler can return
      *
      * - **falsy** to indicate that the rule didn't match after all, then `$urlRouter`
      *   will continue trying to find another one that matches.
      * - **string** which is treated as a redirect and passed to `$location.url()`
      * - **void** or any **truthy** value tells `$urlRouter` that the url was handled.
      *
      * #### Example:
      * ```js
      * var app = angular.module('app', ['ui.router.router']);
      *
      * app.config(function ($urlRouterProvider) {
      *   $urlRouterProvider.when($state.url, function ($match, $stateParams) {
      *     if ($state.$current.navigable !== state ||
      *         !equalForKeys($match, $stateParams) {
      *      $state.transitionTo(state, $match, false);
      *     }
      *   });
      * });
      * ```
      *
      * @param what A pattern string to match, compiled as a [[UrlMatcher]].
      * @param handler The path (or function that returns a path) that you want to redirect your user to.
      * @param ruleCallback [optional] A callback that receives the `rule` registered with [[UrlMatcher.rule]]
      *
      * Note: the handler may also invoke arbitrary code, such as `$state.go()`
      */
    def when(what: RegExp, handler: String): this.type = js.native
    def when(what: RegExp, handler: IInjectable): this.type = js.native
    def when(what: UrlMatcher, handler: String): this.type = js.native
    def when(what: UrlMatcher, handler: IInjectable): this.type = js.native
  }
  
  /* static members */
  @js.native
  object UrlRouterProvider extends js.Object {
    def injectableHandler(router: UIRouter, handler: js.Any): UrlRuleHandlerFn = js.native
  }
  
  type RawNg1RuleFunction = js.Function2[/* $injector */ InjectorLike, /* $location */ LocationServices, String | Unit]
}

