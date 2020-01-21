package typings.winjs.mod.UI

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines an item that can be pressed, swiped, and dragged.
  **/
@JSImport("winjs", "UI.ItemContainer")
@js.native
//#region Constructors
/**
  * Creates a new ItemContainer.
  * @constructor
  * @param element The DOM element hosts the new ItemContainer. For the ItemContainer to be accessible, this element must have its role attribute set to "list" or "listbox". If tapBehavior is set to none and selectionDisabled is true, then use the "list" role; otherwise, use the "listbox" role.
  * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events.
  **/
class ItemContainer ()
  extends typings.winjs.WinJS.UI.ItemContainer {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: js.Any) = this()
}

/* static members */
@JSImport("winjs", "UI.ItemContainer")
@js.native
object ItemContainer extends js.Object {
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: Boolean = js.native
}

