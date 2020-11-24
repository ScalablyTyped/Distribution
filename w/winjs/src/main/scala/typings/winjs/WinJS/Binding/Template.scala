package typings.winjs.WinJS.Binding

import typings.std.HTMLElement
import typings.winjs.WinJS.Promise
import typings.winjs.anon.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides a reusable declarative binding element.
  **/
@js.native
trait Template extends js.Object {
  
  //#endregion Methods
  //#region Properties
  /**
    * Gets or sets the default binding initializer for the template.
    **/
  var bindingInitializer: js.Any = js.native
  
  /**
    * Gets or sets a value that specifies whether a debug break is inserted into the first rendering of each template. This property only has an effect when the app is in debug mode.
    **/
  var debugBreakOnRender: Boolean = js.native
  
  /**
    * This property is deprecated and might not be available in future versions of the WinJS. Gets or sets a value that specifies whether optimized template processing has been disabled.
    **/
  var disableOptimizedProcessing: Boolean = js.native
  
  /**
    * Gets the DOM element that is used as the template.
    **/
  var element: HTMLElement = js.native
  
  /**
    * Gets a value that specifies whether templates should be instantiated without the creation of an additional child element.
    **/
  var extractChild: Boolean = js.native
  
  /**
    * Gets or sets the Number of milliseconds to delay instantiating declarative controls. Zero (0) will result in no delay, any negative number
    * will result in a setImmediate delay, any positive number will be treated as the number of milliseconds.
    **/
  var processTimeout: Double = js.native
  
  //#endregion Constructors
  //#region Methods
  /**
    * Binds values from the specified data context to elements that are descendants of the specified root element that have the declarative binding attributes specified (data-win-bind).
    * @param dataContext The object to use for default data binding.
    * @param container The element to which to add this rendered template. If this parameter is omitted, a new DIV is created.
    * @returns A Promise that will be completed after binding has finished. The value is either container or the created DIV. promise that is completed after binding has finished.
    **/
  def render(dataContext: js.Any): Promise[HTMLElement] = js.native
  def render(dataContext: js.Any, container: HTMLElement): Promise[HTMLElement] = js.native
  
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code. Use render instead.
    **/
  def renderItem[T](item: Promise[T], recyled: HTMLElement): Element = js.native
}
