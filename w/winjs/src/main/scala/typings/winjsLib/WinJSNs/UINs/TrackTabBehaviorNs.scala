package typings
package winjsLib.WinJSNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides methods for detecting when the user tabs to or from DOM elements.
**/
@JSGlobal("WinJS.UI.TrackTabBehavior")
@js.native
object TrackTabBehaviorNs extends js.Object {
  //#region Functions
  /**
    * Sets the tab order for the specified element within its container.
    * @param element The element to update.
    * @param tabIndex The index value of the element within its container.
    **/
  def attach(element: stdLib.HTMLElement, tabIndex: scala.Double): scala.Unit = js.native
  /**
    * Removes the tab order information from the specified element.
    * @param element The element to remove tab information from.
    **/
  def detach(element: stdLib.HTMLElement): scala.Unit = js.native
}

