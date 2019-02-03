package typings
package winjsLib.WinJSNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An item within a Pivot control.
  **/
@JSGlobal("WinJS.UI.PivotItem")
@js.native
//#region Constructors
/**
  * Creates a new PivotItem.
  * @constructor
  * @param element The DOM element hosts the new PivotItem.
  * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events. Event names must begin with "on". For example, to provide a handler for the cancel event, add a property named "oncancel" to the options object and set its value to the event handler.
  **/
class PivotItem () extends js.Object {
  def this(element: stdLib.HTMLElement) = this()
  def this(element: stdLib.HTMLElement, options: js.Any) = this()
  //#endregion Methods
  //#region Properties
  /**
    * Gets the DOM element that hosts the PivotItem control's content.
    **/
  var contentElement: stdLib.HTMLElement = js.native
  /**
    * Gets the DOM element that hosts the PivotItem control.
    **/
  var element: stdLib.HTMLElement = js.native
  /**
    * Gets or sets the header for this PivotItem.
    **/
  var header: java.lang.String = js.native
  //#endregion Constructors
  //#region Methods
  /**
    * Releases resources held by this PivotItem. Call this method when the PivotItem is no longer needed. After calling this method, the PivotItem becomes unusable.
    **/
  def dispose(): scala.Unit = js.native
}

/* static members */
@JSGlobal("WinJS.UI.PivotItem")
@js.native
object PivotItem extends js.Object {
  /**
    * This object supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  var isDeclarativeControlContainer: js.Any = js.native
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: scala.Boolean = js.native
}

