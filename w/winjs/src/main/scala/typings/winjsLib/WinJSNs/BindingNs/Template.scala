package typings
package winjsLib.WinJSNs.BindingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides a reusable declarative binding element.
  **/
@JSGlobal("WinJS.Binding.Template")
@js.native
class Template protected () extends js.Object {
  //#region Constructors
  /**
    * Creates a template that provides a reusable declarative binding element.
    * @constructor
    * @param element The DOM element to convert to a template.
    * @param options If this parameter is supplied, the template is loaded from the URI and the content of the element parameter is ignored. You can add the following options: href.
    **/
  def this(element: stdLib.HTMLElement) = this()
  def this(element: stdLib.HTMLElement, options: js.Any) = this()
  //#endregion Methods
  //#region Properties
  /**
    * Gets or sets the default binding initializer for the template.
    **/
  var bindingInitializer: js.Any = js.native
  /**
    * Gets or sets a value that specifies whether a debug break is inserted into the first rendering of each template. This property only has an effect when the app is in debug mode.
    **/
  var debugBreakOnRender: scala.Boolean = js.native
  /**
    * This property is deprecated and might not be available in future versions of the WinJS. Gets or sets a value that specifies whether optimized template processing has been disabled.
    **/
  var disableOptimizedProcessing: scala.Boolean = js.native
  /**
    * Gets the DOM element that is used as the template.
    **/
  var element: stdLib.HTMLElement = js.native
  /**
    * Gets a value that specifies whether templates should be instantiated without the creation of an additional child element.
    **/
  var extractChild: scala.Boolean = js.native
  /**
    * Gets or sets the Number of milliseconds to delay instantiating declarative controls. Zero (0) will result in no delay, any negative number
    * will result in a setImmediate delay, any positive number will be treated as the number of milliseconds.
    **/
  var processTimeout: scala.Double = js.native
  //#endregion Constructors
  //#region Methods
  /**
    * Binds values from the specified data context to elements that are descendants of the specified root element that have the declarative binding attributes specified (data-win-bind).
    * @param dataContext The object to use for default data binding.
    * @param container The element to which to add this rendered template. If this parameter is omitted, a new DIV is created.
    * @returns A Promise that will be completed after binding has finished. The value is either container or the created DIV. promise that is completed after binding has finished.
    **/
  def render(dataContext: js.Any): winjsLib.WinJSNs.Promise[stdLib.HTMLElement] = js.native
  def render(dataContext: js.Any, container: stdLib.HTMLElement): winjsLib.WinJSNs.Promise[stdLib.HTMLElement] = js.native
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code. Use render instead.
    **/
  def renderItem[T](item: winjsLib.WinJSNs.Promise[T], recyled: stdLib.HTMLElement): winjsLib.Anon_RenderComplete = js.native
}

/**
  * Provides a reusable declarative binding element.
  **/
@JSGlobal("WinJS.Binding.Template")
@js.native
object Template extends js.Object {
  /**
    * Determines whether the Template contains declarative controls that must be processed separately. This property is always true. The controls that belong to a Template object's children are instantiated when a Template instance is rendered.
    **/
  var isDeclarativeControlContainer: scala.Boolean = js.native
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: scala.Boolean = js.native
  /**
    * Renders a template based on the specified URI (static method).
    * @param href The URI from which to load the template.
    * @param dataContext The object to use for default data binding.
    * @param container The element to which to add this rendered template. If this parameter is omitted, a new DIV is created.
    * @returns A promise that is completed after binding has finished. The value is either the object in the container parameter or the created DIV.
    **/
  def render(href: java.lang.String, dataContext: js.Any): winjsLib.WinJSNs.Promise[stdLib.HTMLElement] = js.native
  def render(href: java.lang.String, dataContext: js.Any, container: stdLib.HTMLElement): winjsLib.WinJSNs.Promise[stdLib.HTMLElement] = js.native
}

