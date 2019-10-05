package typings.winjs.winjsMod.UI

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a menu flyout for displaying commands.
  **/
@JSImport("winjs", "UI.Menu")
@js.native
//#region Constructors
/**
  * Creates a new Menu object.
  * @constructor
  * @param element The DOM element that will host the control.
  * @param options The set of properties and values to apply to the new Menu.
  **/
class Menu ()
  extends typings.winjs.WinJS.UI.Menu {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: js.Any) = this()
}

/* static members */
@JSImport("winjs", "UI.Menu")
@js.native
object Menu extends js.Object {
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: Boolean = js.native
}

