package typings.winjs.mod.UI

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides methods for detecting when the user tabs to or from DOM elements.
**/
@JSImport("winjs", "UI.TrackTabBehavior")
@js.native
object TrackTabBehavior extends js.Object {
  //#region Functions
  /**
    * Sets the tab order for the specified element within its container.
    * @param element The element to update.
    * @param tabIndex The index value of the element within its container.
    **/
  def attach(element: HTMLElement, tabIndex: Double): Unit = js.native
  /**
    * Removes the tab order information from the specified element.
    * @param element The element to remove tab information from.
    **/
  def detach(element: HTMLElement): Unit = js.native
}

