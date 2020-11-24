package typings.uirouterAngularjs.interfaceMod

import org.scalablytyped.runtime.StringDictionary
import typings.uirouterCore.commonCommonMod.IInjectable
import typings.uirouterCore.stateInterfaceMod.ViewDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ng1ViewDeclaration extends ViewDeclaration {
  
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
  var bindings: js.UndefOr[StringDictionary[String]] = js.native
  
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
  var component: js.UndefOr[String] = js.native
  
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
  var componentProvider: js.UndefOr[IInjectable] = js.native
  
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
  var controller: js.UndefOr[IInjectable | String] = js.native
  
  /**
    * A controller alias name.
    *
    * A property of [[Ng1StateDeclaration]] or [[Ng1ViewDeclaration]]:
    *
    * If present, the controller will be published to scope under the `controllerAs` name.
    * See: https://docs.angularjs.org/api/ng/directive/ngController
    */
  var controllerAs: js.UndefOr[String] = js.native
  
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
  var controllerProvider: js.UndefOr[IInjectable] = js.native
  
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
  var resolveAs: js.UndefOr[String] = js.native
  
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
  var template: js.UndefOr[js.Function | String] = js.native
  
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
  var templateProvider: js.UndefOr[IInjectable] = js.native
  
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
  var templateUrl: js.UndefOr[String | js.Function] = js.native
}
object Ng1ViewDeclaration {
  
  @scala.inline
  def apply(): Ng1ViewDeclaration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ng1ViewDeclaration]
  }
  
  @scala.inline
  implicit class Ng1ViewDeclarationOps[Self <: Ng1ViewDeclaration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBindings(value: StringDictionary[String]): Self = this.set("bindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBindings: Self = this.set("bindings", js.undefined)
    
    @scala.inline
    def setComponent(value: String): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    
    @scala.inline
    def setComponentProviderVarargs(value: js.Any*): Self = this.set("componentProvider", js.Array(value :_*))
    
    @scala.inline
    def setComponentProvider(value: IInjectable): Self = this.set("componentProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentProvider: Self = this.set("componentProvider", js.undefined)
    
    @scala.inline
    def setControllerVarargs(value: js.Any*): Self = this.set("controller", js.Array(value :_*))
    
    @scala.inline
    def setController(value: IInjectable | String): Self = this.set("controller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteController: Self = this.set("controller", js.undefined)
    
    @scala.inline
    def setControllerAs(value: String): Self = this.set("controllerAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControllerAs: Self = this.set("controllerAs", js.undefined)
    
    @scala.inline
    def setControllerProviderVarargs(value: js.Any*): Self = this.set("controllerProvider", js.Array(value :_*))
    
    @scala.inline
    def setControllerProvider(value: IInjectable): Self = this.set("controllerProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControllerProvider: Self = this.set("controllerProvider", js.undefined)
    
    @scala.inline
    def setResolveAs(value: String): Self = this.set("resolveAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolveAs: Self = this.set("resolveAs", js.undefined)
    
    @scala.inline
    def setTemplate(value: js.Function | String): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setTemplateProviderVarargs(value: js.Any*): Self = this.set("templateProvider", js.Array(value :_*))
    
    @scala.inline
    def setTemplateProvider(value: IInjectable): Self = this.set("templateProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateProvider: Self = this.set("templateProvider", js.undefined)
    
    @scala.inline
    def setTemplateUrl(value: String | js.Function): Self = this.set("templateUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateUrl: Self = this.set("templateUrl", js.undefined)
  }
}
