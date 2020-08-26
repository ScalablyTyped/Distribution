package typings.winjs.mod.UI

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A tab control that displays multiple items.
  **/
@JSImport("winjs", "UI.Pivot")
@js.native
//#region Constructors
/**
  * Creates a new Pivot.
  * @constructor
  * @param element The DOM element hosts the new Pivot.
  * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events. Event names must begin with "on". For example, to provide a handler for the cancel event, add a property named "oncancel" to the options object and set its value to the event handler.
  **/
class Pivot ()
  extends typings.winjs.WinJS.UI.Pivot {
  def this(element: HTMLElement) = this()
  def this(element: js.UndefOr[scala.Nothing], options: js.Any) = this()
  def this(element: HTMLElement, options: js.Any) = this()
}

/* static members */
@JSImport("winjs", "UI.Pivot")
@js.native
object Pivot extends js.Object {
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: Boolean = js.native
}

