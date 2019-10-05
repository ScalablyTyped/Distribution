package typings.winjs.winjsMod.UI

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Displays a tooltip that can contain images and formatting.
  **/
@JSImport("winjs", "UI.Tooltip")
@js.native
//#region Constructors
/**
  * Creates a new Tooltip.
  * @constructor
  * @param element The DOM element associated that hosts the Tooltip.
  * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events. Event names must begin with "on". For example, to provide a handler for the opened event, add a property named "onopened" to the options object and set its value to the event handler.
  **/
class Tooltip ()
  extends typings.winjs.WinJS.UI.Tooltip {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: js.Any) = this()
}

/* static members */
@JSImport("winjs", "UI.Tooltip")
@js.native
object Tooltip extends js.Object {
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: Boolean = js.native
}

