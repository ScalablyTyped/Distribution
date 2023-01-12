package typings.uirouterAngularjs

import org.scalablytyped.runtime.StringDictionary
import typings.uirouterAngularjs.anon.Instantiable
import typings.uirouterCore.libCommonCommonMod.IInjectable
import typings.uirouterCore.libStateInterfaceMod.StateDeclaration
import typings.uirouterCore.libStateInterfaceMod.ViewDeclaration
import typings.uirouterCore.libTransitionInterfaceMod.HookResult
import typings.uirouterCore.mod.Transition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInterfaceMod {
  
  trait Ng1Controller extends StObject {
    
    /** @hidden */
    @JSName("$onInit")
    def $onInit(): Unit
    
    /**
      * This callback is called when the view's state is about to be exited.
      *
      * This callback is used to inform a view that it is about to be exited, due to a new [[Transition]].
      * The callback can ask for user confirmation, and cancel or alter the new Transition.  The callback should
      * return a value, or a promise for a value.  If a promise is returned, the new Transition waits until the
      * promise settles.
      *
      *
      * Called when:
      * - The view is still active
      * - A new Transition is about to run
      * - The new Transition will exit the view's state
      *
      * Called with:
      * - The new Transition
      *
      * Relevant return Values:
      * - `false`: The transition is cancelled.
      * - A rejected promise: The transition is cancelled.
      * - [[TargetState]]: The transition is redirected to the new target state.
      * - Anything else: the transition will continue normally (the state and view will be deactivated)
      *
      * #### Example:
      * ```js
      * app.component('myComponent', {
      *   template: '<input ng-model="$ctrl.data" type="text">',
      *   bindings: { 'data': '<' },
      *   controller: function() {
      *
      *     this.originalData = angular.copy(this.data);
      *
      *     this.uiCanExit = function() {
      *       if (!angular.equals(this.data, this.originalData)) {
      *         // Note: This could also return a Promise and request async
      *         // confirmation using something like ui-bootstrap $modal
      *         return window.confirm("Data has changed.  Exit anyway and lose changes?");
      *       }
      *     }
      *   }
      * }
      * ```
      *
      * @param transition the new Transition that is about to exit the component's state
      * @return a HookResult, or a promise for a HookResult
      */
    def uiCanExit(transition: Transition): HookResult
    
    /**
      * This callback is called when parameter values have changed.
      *
      * This callback can be used to respond to changing parameter values in the current state, or in parent/child states.
      * This callback is especially handy when using dynamic parameters ([[ParamDeclaration.dynamic]])
      *
      * Called when:
      * - The view is still active
      * - A new transition has completed successfully
      * - The state for the view (controller) was not reloaded
      * - At least one parameter value was changed
      *
      * Called with:
      * @param newValues an object containing the changed parameter values
      * @param $transition$ the new Transition which triggered this callback
      *
      * #### Example:
      * ```js
      * angular.module('foo').controller('FancyCtrl', function() {
      *   this.uiOnParamsChanged = function(newParams) {
      *     console.log("new params: ", newParams);
      *   }
      * });
      * ```
      */
    def uiOnParamsChanged(newValues: Any, DollartransitionDollar: Transition): Unit
  }
  object Ng1Controller {
    
    inline def apply(
      $onInit: () => Unit,
      uiCanExit: Transition => HookResult,
      uiOnParamsChanged: (Any, Transition) => Unit
    ): Ng1Controller = {
      val __obj = js.Dynamic.literal($onInit = js.Any.fromFunction0($onInit), uiCanExit = js.Any.fromFunction1(uiCanExit), uiOnParamsChanged = js.Any.fromFunction2(uiOnParamsChanged))
      __obj.asInstanceOf[Ng1Controller]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Ng1Controller] (val x: Self) extends AnyVal {
      
      inline def set$onInit(value: () => Unit): Self = StObject.set(x, "$onInit", js.Any.fromFunction0(value))
      
      inline def setUiCanExit(value: Transition => HookResult): Self = StObject.set(x, "uiCanExit", js.Any.fromFunction1(value))
      
      inline def setUiOnParamsChanged(value: (Any, Transition) => Unit): Self = StObject.set(x, "uiOnParamsChanged", js.Any.fromFunction2(value))
    }
  }
  
  trait Ng1StateDeclaration
    extends StObject
       with _Ng1StateDeclaration
       with Ng1ViewDeclaration {
    
    /**
      * A state hook invoked when a state is being entered.
      *
      * The hook can inject global services.
      * It can also inject `$transition$` or `$state$` (from the current transition).
      *
      * ### Example:
      * ```js
      * $stateProvider.state({
      *   name: 'mystate',
      *   onEnter: (MyService, $transition$, $state$) => {
      *     return MyService.doSomething($state$.name, $transition$.params());
      *   }
      * });
      * ```
      *
      * #### Example:`
      * ```js
      * $stateProvider.state({
      *   name: 'mystate',
      *   onEnter: [ 'MyService', '$transition$', '$state$', function (MyService, $transition$, $state$) {
      *     return MyService.doSomething($state$.name, $transition$.params());
      *   } ]
      * });
      * ```
      */
    @JSName("onEnter")
    var onEnter_Ng1StateDeclaration: js.UndefOr[Ng1StateTransitionHook | IInjectable] = js.undefined
    
    /**
      * A state hook invoked when a state is being exited.
      *
      * The hook can inject global services.
      * It can also inject `$transition$` or `$state$` (from the current transition).
      *
      * ### Example:
      * ```js
      * $stateProvider.state({
      *   name: 'mystate',
      *   onExit: (MyService, $transition$, $state$) => {
      *     return MyService.doSomething($state$.name, $transition$.params());
      *   }
      * });
      * ```
      *
      * #### Example:`
      * ```js
      * $stateProvider.state({
      *   name: 'mystate',
      *   onExit: [ 'MyService', '$transition$', '$state$', function (MyService, $transition$, $state$) {
      *     return MyService.doSomething($state$.name, $transition$.params());
      *   } ]
      * });
      * ```
      */
    @JSName("onExit")
    var onExit_Ng1StateDeclaration: js.UndefOr[Ng1StateTransitionHook | IInjectable] = js.undefined
    
    /**
      * A state hook invoked when a state is being retained.
      *
      * The hook can inject global services.
      * It can also inject `$transition$` or `$state$` (from the current transition).
      *
      * #### Example:
      * ```js
      * $stateProvider.state({
      *   name: 'mystate',
      *   onRetain: (MyService, $transition$, $state$) => {
      *     return MyService.doSomething($state$.name, $transition$.params());
      *   }
      * });
      * ```
      *
      * #### Example:`
      * ```js
      * $stateProvider.state({
      *   name: 'mystate',
      *   onRetain: [ 'MyService', '$transition$', '$state$', function (MyService, $transition$, $state$) {
      *     return MyService.doSomething($state$.name, $transition$.params());
      *   } ]
      * });
      * ```
      */
    @JSName("onRetain")
    var onRetain_Ng1StateDeclaration: js.UndefOr[Ng1StateTransitionHook | IInjectable] = js.undefined
    
    /**
      * An optional object which defines multiple named views.
      *
      * Each key is the name of a view, and each value is a [[Ng1ViewDeclaration]].
      * Unnamed views are internally renamed to `$default`.
      *
      * A view's name is used to match an active `<ui-view>` directive in the DOM.  When the state
      * is entered, the state's views are activated and matched with active `<ui-view>` directives:
      *
      * - The view's name is processed into a ui-view target:
      *   - ui-view address: an address to a ui-view
      *   - state anchor: the state to anchor the address to
      *
      *  Examples:
      *
      *  Targets three named ui-views in the parent state's template
      *
      * #### Example:
      * ```js
      * views: {
      *   header: {
      *     controller: "headerCtrl",
      *     templateUrl: "header.html"
      *   },
      *   body: {
      *     controller: "bodyCtrl",
      *     templateUrl: "body.html"
      *   },
      *   footer: "footerComponent"
      * }
      * ```
      *
      * #### Example:
      * ```js
      * // Targets named ui-view="header" in the template of the ancestor state 'top'
      * // and the named `ui-view="body" from the parent state's template.
      * views: {
      *   'header@top': {
      *     controller: "msgHeaderCtrl",
      *     templateUrl: "msgHeader.html"
      *   },
      *   'body': {
      *     controller: "messagesCtrl",
      *     templateUrl: "messages.html"
      *   }
      * }
      * ```
      *
      * ## View targeting details
      *
      * There are a few styles of view addressing/targeting.
      * The most common is a simple `ui-view` name
      *
      * #### Simple ui-view name
      *
      * Addresses without an `@` are anchored to the parent state.
      *
      * #### Example:
      * ```js
      * // target the `<div ui-view='foo'></div>` created in the parent state's view
      * views: {
      *   foo: {...}
      * }
      * ```
      *
      * #### View name anchored to a state
      *
      * You can anchor the `ui-view` name to a specific state by including an `@`
      *
      * #### Example:
      * targets the `<div ui-view='foo'></div>` which was created in a view owned by the state `bar.baz`
      * ```js
      * views: {
      *   'foo@bar.baz': {...}
      * }
      * ```
      *
      * #### Absolute addressing
      *
      * You can address a `ui-view` absolutely, using dotted notation, by prefixing the address with a `!`.
      * Dotted addresses traverse the hierarchy of `ui-view`s active in the DOM:
      *
      * #### Example:
      * absolutely targets the `<div ui-view='nested'></div>`
      * ... which was created in the unnamed/$default root `<ui-view></ui-view>`
      * ```js
      * views: {
      *   '!$default.nested': {...}
      * }
      * ```
      *
      * #### Relative addressing
      *
      * Absolute addressing is actually relative addressing, anchored to the unnamed root state (`""`).
      * You can also use relative addressing anchored to *any state*, in order to target a target deeply nested `ui-views`:
      * The `ui-view` is targeted relative to the anchored state by traversing the nested `ui-view` names.
      *
      * #### Example:
      * targets the `<div ui-view='bar'></div>`
      * ... which was created inside the
      * `<div ui-view='foo'></div>`
      * ... which was created inside the parent state's template.
      * ```js
      * views: {
      *   'foo.bar': {...}
      * }
      * ```
      *
      * #### Example:
      * targets the `<div ui-view='bar'></div>`
      * ... which was created in `<div ui-view='foo'></div>`
      * ... which was created in a template from the state `baz.qux`
      * ```js
      * views: {
      *   'foo.bar@baz.qux': {...}
      * }
      * ```
      *
      * #### Example:
      * a view can relatively target a named `ui-view` defined on an ancestor using `^` (meaning "parent")
      * ```js
      * views: {
      *   'foo@^': {...}, // foo@(parent state) (same as simply 'foo')
      *   'bar@^.^': {...}, // bar@(grandparent state)
      *   'baz@^.^.^': {...}, // baz@(great-grandparent state)
      * }
      * ```
      *
      * For additional in-depth details about how `ui-view` addressing works, see the internal api [[ViewService.match]].
      *
      * ---
      *
      * ## State template+controller and `views:` incompatiblity
      *
      * If a state has a `views` object, any state-level view properties ([[Ng1ViewDeclaration]]) are ignored.  Therefore,
      * if _any view_ for a state is declared in the `views` object, then _all of the state's views_ must be defined in
      * the `views` object.  The state declaration must not have any of the following fields:
      * - component
      * - bindings
      * - resolveAs
      * - template
      * - templateUrl
      * - templateProvider
      * - controller
      * - controllerAs
      * - controllerProvider
      */
    @JSName("views")
    var views_Ng1StateDeclaration: js.UndefOr[StringDictionary[String | Ng1ViewDeclaration]] = js.undefined
  }
  object Ng1StateDeclaration {
    
    inline def apply(): Ng1StateDeclaration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Ng1StateDeclaration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Ng1StateDeclaration] (val x: Self) extends AnyVal {
      
      inline def setOnEnter(value: Ng1StateTransitionHook | IInjectable): Self = StObject.set(x, "onEnter", value.asInstanceOf[js.Any])
      
      inline def setOnEnterFunction1(value: /* repeated */ Any => HookResult): Self = StObject.set(x, "onEnter", js.Any.fromFunction1(value))
      
      inline def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
      
      inline def setOnEnterVarargs(value: Any*): Self = StObject.set(x, "onEnter", js.Array(value*))
      
      inline def setOnExit(value: Ng1StateTransitionHook | IInjectable): Self = StObject.set(x, "onExit", value.asInstanceOf[js.Any])
      
      inline def setOnExitFunction1(value: /* repeated */ Any => HookResult): Self = StObject.set(x, "onExit", js.Any.fromFunction1(value))
      
      inline def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
      
      inline def setOnExitVarargs(value: Any*): Self = StObject.set(x, "onExit", js.Array(value*))
      
      inline def setOnRetain(value: Ng1StateTransitionHook | IInjectable): Self = StObject.set(x, "onRetain", value.asInstanceOf[js.Any])
      
      inline def setOnRetainFunction1(value: /* repeated */ Any => HookResult): Self = StObject.set(x, "onRetain", js.Any.fromFunction1(value))
      
      inline def setOnRetainUndefined: Self = StObject.set(x, "onRetain", js.undefined)
      
      inline def setOnRetainVarargs(value: Any*): Self = StObject.set(x, "onRetain", js.Array(value*))
      
      inline def setViews(value: StringDictionary[String | Ng1ViewDeclaration]): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
      
      inline def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
    }
  }
  
  type Ng1StateTransitionHook = js.Function1[/* repeated */ Any, HookResult]
  
  trait Ng1ViewDeclaration
    extends StObject
       with ViewDeclaration {
    
    /**
      * An object which maps `resolve`s to [[component]] `bindings`.
      *
      * A property of [[Ng1StateDeclaration]] or [[Ng1ViewDeclaration]]:
      *
      * When using a [[component]] declaration (`component: 'myComponent'`), each input binding for the component is supplied
      * data from a resolve of the same name, by default.  You may supply data from a different resolve name by mapping it here.
      *
      * Each key in this object is the name of one of the component's input bindings.
      * Each value is the name of the resolve that should be provided to that binding.
      *
      * Any component bindings that are omitted from this map get the default behavior of mapping to a resolve of the
      * same name.
      *
      * #### Example:
      * ```js
      * $stateProvider.state('foo', {
      *   resolve: {
      *     foo: function(FooService) { return FooService.get(); },
      *     bar: function(BarService) { return BarService.get(); }
      *   },
      *   component: 'Baz',
      *   // The component's `baz` binding gets data from the `bar` resolve
      *   // The component's `foo` binding gets data from the `foo` resolve (default behavior)
      *   bindings: {
      *     baz: 'bar'
      *   }
      * });
      *
      * app.component('Baz', {
      *   templateUrl: 'baz.html',
      *   controller: 'BazController',
      *   bindings: {
      *     foo: '<', // foo binding
      *     baz: '<'  // baz binding
      *   }
      * });
      * ```
      *
      */
    var bindings: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * The name of the component to use for this view.
      *
      * A property of [[Ng1StateDeclaration]] or [[Ng1ViewDeclaration]]:
      *
      * The name of an [angular 1.5+ `.component()`](https://docs.angularjs.org/guide/component) (or directive with
      * bindToController and/or scope declaration) which will be used for this view.
      *
      * Resolve data can be provided to the component via the component's `bindings` object (for 1.3+ directives, the
      * `bindToController` is used; for other directives, the `scope` declaration is used).  For each binding declared
      * on the component, any resolve with the same name is set on the component's controller instance.  The binding
      * is provided to the component as a one-time-binding.  In general, components should likewise declare their
      * input bindings as [one-way ("&lt;")](https://docs.angularjs.org/api/ng/service/$compile#-scope-).
      *
      * Note: inside a "views:" block, a bare string `"foo"` is shorthand for `{ component: "foo" }`
      *
      * Note: Mapping from resolve names to component inputs may be specified using [[bindings]].
      *
      * #### Example:
      * ```js
      * .state('profile', {
      *   // Use the <my-profile></my-profile> component for the Unnamed view
      *   component: 'MyProfile',
      * }
      *
      * .state('messages', {
      *   // use the <nav-bar></nav-bar> component for the view named 'header'
      *   // use the <message-list></message-list> component for the view named 'content'
      *   views: {
      *     header: { component: 'NavBar' },
      *     content: { component: 'MessageList' }
      *   }
      * }
      *
      * .state('contacts', {
      *   // Inside a "views:" block, a bare string "NavBar" is shorthand for { component: "NavBar" }
      *   // use the <nav-bar></nav-bar> component for the view named 'header'
      *   // use the <contact-list></contact-list> component for the view named 'content'
      *   views: {
      *     header: 'NavBar',
      *     content: 'ContactList'
      *   }
      * }
      * ```
      *
      *
      * Note: When using `component` to define a view, you may _not_ use any of: `template`, `templateUrl`,
      * `templateProvider`, `controller`, `controllerProvider`, `controllerAs`.
      *
      *
      * See also: Todd Motto's angular 1.3 and 1.4 [backport of .component()](https://github.com/toddmotto/angular-component)
      */
    var component: js.UndefOr[String] = js.undefined
    
    /**
      * Dynamic component provider function.
      *
      * A property of [[Ng1StateDeclaration]] or [[Ng1ViewDeclaration]]:
      *
      * This is an injectable provider function which returns the name of the component to use.
      * The provider will invoked during a Transition in which the view's state is entered.
      * The provider is called after the resolve data is fetched.
      *
      * #### Example:
      * ```js
      * componentProvider: function(MyResolveData, $transition$) {
      *   if (MyResolveData.foo) {
      *     return "fooComponent"
      *   } else if ($transition$.to().name === 'bar') {
      *     return "barComponent";
      *   }
      * }
      * ```
      */
    var componentProvider: js.UndefOr[IInjectable] = js.undefined
    
    /**
      * The view's controller function or name
      *
      * A property of [[Ng1StateDeclaration]] or [[Ng1ViewDeclaration]]:
      *
      * The controller function, or the name of a registered controller.  The controller function will be used
      * to control the contents of the [[directives.uiView]] directive.
      *
      * If specified as a string, controllerAs can be declared here, i.e., "FooController as foo" instead of in
      * a separate [[controllerAs]] property.
      *
      * See: [[Ng1Controller]] for information about component-level router hooks.
      */
    var controller: js.UndefOr[IInjectable | String] = js.undefined
    
    /**
      * A controller alias name.
      *
      * A property of [[Ng1StateDeclaration]] or [[Ng1ViewDeclaration]]:
      *
      * If present, the controller will be published to scope under the `controllerAs` name.
      * See: https://docs.angularjs.org/api/ng/directive/ngController
      */
    var controllerAs: js.UndefOr[String] = js.undefined
    
    /**
      * Dynamic controller provider function.
      *
      * A property of [[Ng1StateDeclaration]] or [[Ng1ViewDeclaration]]:
      *
      * This is an injectable provider function which returns the actual controller function, or the name
      * of a registered controller.  The provider will invoked during a Transition in which the view's state is
      * entered.  The provider is called after the resolve data is fetched.
      *
      * #### Example:
      * ```js
      * controllerProvider: function(MyResolveData, $transition$) {
      *   if (MyResolveData.foo) {
      *     return "FooCtrl"
      *   } else if ($transition$.to().name === 'bar') {
      *     return "BarCtrl";
      *   } else {
      *     return function($scope) {
      *       $scope.baz = "Qux";
      *     }
      *   }
      * }
      * ```
      */
    var controllerProvider: js.UndefOr[IInjectable] = js.undefined
    
    /**
      * The scope variable name to use for resolve data.
      *
      * A property of [[Ng1StateDeclaration]] or [[Ng1ViewDeclaration]]:
      *
      * When a view is activated, the resolved data for the state which the view belongs to is put on the scope.
      * This property sets the name of the scope variable to use for the resolved data.
      *
      * Defaults to `$resolve`.
      */
    var resolveAs: js.UndefOr[String] = js.undefined
    
    /**
      * The HTML template for the view.
      *
      * A property of [[Ng1StateDeclaration]] or [[Ng1ViewDeclaration]]:
      *
      * HTML template as a string, or a function which returns an html template as a string.
      * This template will be used to render the corresponding [[directives.uiView]] directive.
      *
      * This property takes precedence over templateUrl.
      *
      * If `template` is a function, it will be called with the Transition parameters as the first argument.
      *
      * #### Example:
      * ```js
      * template: "<h1>inline template definition</h1><div ui-view></div>"
      * ```
      *
      * #### Example:
      * ```js
      * template: function(params) {
      *   return "<h1>generated template</h1>";
      * }
      * ```
      */
    var template: js.UndefOr[js.Function | String] = js.undefined
    
    /**
      * Injected function which returns the HTML template.
      *
      * A property of [[Ng1StateDeclaration]] or [[Ng1ViewDeclaration]]:
      *
      * Injected function which returns the HTML template.
      * The template will be used to render the corresponding [[directives.uiView]] directive.
      *
      * #### Example:
      * ```js
      * templateProvider: function(MyTemplateService, $transition$) {
      *   return MyTemplateService.getTemplate($transition$.params().pageId);
      * }
      * ```
      */
    var templateProvider: js.UndefOr[IInjectable] = js.undefined
    
    /**
      * The URL for the HTML template for the view.
      *
      * A property of [[Ng1StateDeclaration]] or [[Ng1ViewDeclaration]]:
      *
      * A path or a function that returns a path to an html template.
      * The template will be fetched and used to render the corresponding [[directives.uiView]] directive.
      *
      * If `templateUrl` is a function, it will be called with the Transition parameters as the first argument.
      *
      * #### Example:
      * ```js
      * templateUrl: "/templates/home.html"
      * ```
      *
      * #### Example:
      * ```js
      * templateUrl: function(params) {
      *   return myTemplates[params.pageId];
      * }
      * ```
      */
    var templateUrl: js.UndefOr[String | js.Function] = js.undefined
  }
  object Ng1ViewDeclaration {
    
    inline def apply(): Ng1ViewDeclaration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Ng1ViewDeclaration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Ng1ViewDeclaration] (val x: Self) extends AnyVal {
      
      inline def setBindings(value: StringDictionary[String]): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
      
      inline def setBindingsUndefined: Self = StObject.set(x, "bindings", js.undefined)
      
      inline def setComponent(value: String): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentProvider(value: IInjectable): Self = StObject.set(x, "componentProvider", value.asInstanceOf[js.Any])
      
      inline def setComponentProviderUndefined: Self = StObject.set(x, "componentProvider", js.undefined)
      
      inline def setComponentProviderVarargs(value: Any*): Self = StObject.set(x, "componentProvider", js.Array(value*))
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setController(value: IInjectable | String): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
      
      inline def setControllerAs(value: String): Self = StObject.set(x, "controllerAs", value.asInstanceOf[js.Any])
      
      inline def setControllerAsUndefined: Self = StObject.set(x, "controllerAs", js.undefined)
      
      inline def setControllerProvider(value: IInjectable): Self = StObject.set(x, "controllerProvider", value.asInstanceOf[js.Any])
      
      inline def setControllerProviderUndefined: Self = StObject.set(x, "controllerProvider", js.undefined)
      
      inline def setControllerProviderVarargs(value: Any*): Self = StObject.set(x, "controllerProvider", js.Array(value*))
      
      inline def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
      
      inline def setControllerVarargs(value: Any*): Self = StObject.set(x, "controller", js.Array(value*))
      
      inline def setResolveAs(value: String): Self = StObject.set(x, "resolveAs", value.asInstanceOf[js.Any])
      
      inline def setResolveAsUndefined: Self = StObject.set(x, "resolveAs", js.undefined)
      
      inline def setTemplate(value: js.Function | String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateProvider(value: IInjectable): Self = StObject.set(x, "templateProvider", value.asInstanceOf[js.Any])
      
      inline def setTemplateProviderUndefined: Self = StObject.set(x, "templateProvider", js.undefined)
      
      inline def setTemplateProviderVarargs(value: Any*): Self = StObject.set(x, "templateProvider", js.Array(value*))
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setTemplateUrl(value: String | js.Function): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
      
      inline def setTemplateUrlUndefined: Self = StObject.set(x, "templateUrl", js.undefined)
    }
  }
  
  trait TemplateFactoryProvider extends StObject {
    
    /**
      * Forces $templateFactory to use $http instead of $templateRequest.
      *
      * UI-Router uses `$templateRequest` by default on angular 1.3+.
      * Use this method to choose to use `$http` instead.
      *
      * ---
      *
      * ## Security warning
      *
      * This might cause XSS, as $http doesn't enforce the regular security checks for
      * templates that have been introduced in Angular 1.3.
      *
      * See the $sce documentation, section
      * <a href="https://docs.angularjs.org/api/ng/service/$sce#impact-on-loading-templates">
      * Impact on loading templates</a> for more details about this mechanism.
      *
      * *Note: forcing this to `false` on Angular 1.2.x will crash, because `$templateRequest` is not implemented.*
      *
      * @param useUnsafeHttpService `true` to use `$http` to fetch templates
      */
    def useHttpService(useUnsafeHttpService: Boolean): Any
  }
  object TemplateFactoryProvider {
    
    inline def apply(useHttpService: Boolean => Any): TemplateFactoryProvider = {
      val __obj = js.Dynamic.literal(useHttpService = js.Any.fromFunction1(useHttpService))
      __obj.asInstanceOf[TemplateFactoryProvider]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TemplateFactoryProvider] (val x: Self) extends AnyVal {
      
      inline def setUseHttpService(value: Boolean => Any): Self = StObject.set(x, "useHttpService", js.Any.fromFunction1(value))
    }
  }
  
  trait _Ng1StateDeclaration
    extends StObject
       with StateDeclaration {
    
    @JSName("onEnter")
    var onEnter__Ng1StateDeclaration: js.UndefOr[Any] = js.undefined
    
    @JSName("onExit")
    var onExit__Ng1StateDeclaration: js.UndefOr[Any] = js.undefined
    
    @JSName("onRetain")
    var onRetain__Ng1StateDeclaration: js.UndefOr[Any] = js.undefined
    
    @JSName("views")
    var views__Ng1StateDeclaration: js.UndefOr[Any] = js.undefined
  }
  object _Ng1StateDeclaration {
    
    inline def apply(): _Ng1StateDeclaration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[_Ng1StateDeclaration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: _Ng1StateDeclaration] (val x: Self) extends AnyVal {
      
      inline def setOnEnter(value: Any): Self = StObject.set(x, "onEnter", value.asInstanceOf[js.Any])
      
      inline def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
      
      inline def setOnExit(value: Any): Self = StObject.set(x, "onExit", value.asInstanceOf[js.Any])
      
      inline def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
      
      inline def setOnRetain(value: Any): Self = StObject.set(x, "onRetain", value.asInstanceOf[js.Any])
      
      inline def setOnRetainUndefined: Self = StObject.set(x, "onRetain", js.undefined)
      
      inline def setViews(value: Any): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
      
      inline def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
    }
  }
  
  /* augmented module */
  object uirouterCoreLibStateStateRegistryAugmentingMod {
    
    @js.native
    trait StateRegistry extends StObject {
      
      def register(state: Instantiable): Any = js.native
      def register(state: Ng1StateDeclaration): Any = js.native
    }
  }
}
