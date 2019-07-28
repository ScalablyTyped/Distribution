package typings.atUirouterAngularjs.libTemplateFactoryMod

import typings.angular.angularMod.IAugmentedJQuery
import typings.atUirouterAngularjs.Anon_Component
import typings.atUirouterAngularjs.libInterfaceMod.Ng1ViewDeclaration
import typings.atUirouterAngularjs.libInterfaceMod.TemplateFactoryProvider
import typings.atUirouterCore.atUirouterCoreMod.ResolveContext
import typings.atUirouterCore.libCommonCommonMod.IInjectable
import typings.atUirouterCore.libParamsInterfaceMod.RawParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/angularjs/lib/templateFactory", "TemplateFactory")
@js.native
class TemplateFactory () extends TemplateFactoryProvider {
  /** @hidden */ @JSName("$get")
  var $get: js.Array[
    String | (js.Function3[/* $http */ _, /* $templateCache */ _, /* $injector */ _, this.type])
  ] = js.native
  /** @hidden */ @JSName("$http")
  var $http: js.Any = js.native
  /** @hidden */ @JSName("$templateCache")
  var $templateCache: js.Any = js.native
  /** @hidden */ @JSName("$templateRequest")
  var $templateRequest: js.Any = js.native
  /** @hidden */ var _useHttp: js.Any = js.native
  /**
    * Creates a component's template by invoking an injectable provider function.
    *
    * @param provider Function to invoke via `locals`
    * @param {Function} injectFn a function used to invoke the template provider
    * @return {string} The template html as a string: "<component-name input1='::$resolve.foo'></component-name>".
    */
  def fromComponentProvider(provider: IInjectable, params: js.Any, context: ResolveContext): js.Promise[_] = js.native
  /**
    * Creates a template from a configuration object.
    *
    * @param config Configuration object for which to load a template.
    * The following properties are search in the specified order, and the first one
    * that is defined is used to create the template:
    *
    * @param params  Parameters to pass to the template function.
    * @param context The resolve context associated with the template's view
    *
    * @return {string|object}  The template html as a string, or a promise for
    * that string,or `null` if no template is configured.
    */
  def fromConfig(config: Ng1ViewDeclaration, params: js.Any, context: ResolveContext): js.Promise[Anon_Component] = js.native
  /**
    * Creates a template by invoking an injectable provider function.
    *
    * @param provider Function to invoke via `locals`
    * @param {Function} injectFn a function used to invoke the template provider
    * @return {string|Promise.<string>} The template html as a string, or a promise
    * for that string.
    */
  def fromProvider(provider: IInjectable, params: js.Any, context: ResolveContext): js.Promise[_] = js.native
  /**
    * Creates a template from a string or a function returning a string.
    *
    * @param template html template as a string or function that returns an html template as a string.
    * @param params Parameters to pass to the template function.
    *
    * @return {string|object} The template html as a string, or a promise for that
    * string.
    */
  def fromString(template: String): js.Any = js.native
  def fromString(template: String, params: RawParams): js.Any = js.native
  def fromString(template: js.Function): js.Any = js.native
  def fromString(template: js.Function, params: RawParams): js.Any = js.native
  /**
    * Loads a template from the a URL via `$http` and `$templateCache`.
    *
    * @param {string|Function} url url of the template to load, or a function
    * that returns a url.
    * @param {Object} params Parameters to pass to the url function.
    * @return {string|Promise.<string>} The template html as a string, or a promise
    * for that string.
    */
  def fromUrl(url: String, params: js.Any): js.Any = js.native
  def fromUrl(url: js.Function, params: js.Any): js.Any = js.native
  /**
    * Creates a template from a component's name
    *
    * This implements route-to-component.
    * It works by retrieving the component (directive) metadata from the injector.
    * It analyses the component's bindings, then constructs a template that instantiates the component.
    * The template wires input and output bindings to resolves or from the parent component.
    *
    * @param uiView {object} The parent ui-view (for binding outputs to callbacks)
    * @param context The ResolveContext (for binding outputs to callbacks returned from resolves)
    * @param component {string} Component's name in camel case.
    * @param bindings An object defining the component's bindings: {foo: '<'}
    * @return {string} The template as a string: "<component-name input1='::$resolve.foo'></component-name>".
    */
  def makeComponentTemplate(uiView: IAugmentedJQuery, context: ResolveContext, component: String): String = js.native
  def makeComponentTemplate(uiView: IAugmentedJQuery, context: ResolveContext, component: String, bindings: js.Any): String = js.native
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
  /* CompleteClass */
  override def useHttpService(useUnsafeHttpService: Boolean): js.Any = js.native
}

