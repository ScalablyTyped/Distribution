package typings.winjs.mod.UI

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides methods for detecting when the user tabs to or from DOM elements.
**/
object TrackTabBehavior {
  
  //#region Functions
  /**
    * Sets the tab order for the specified element within its container.
    * @param element The element to update.
    * @param tabIndex The index value of the element within its container.
    **/
  @JSImport("winjs", "UI.TrackTabBehavior.attach")
  @js.native
  def attach(element: HTMLElement, tabIndex: Double): Unit = js.native
  
  /**
    * Removes the tab order information from the specified element.
    * @param element The element to remove tab information from.
    **/
  @JSImport("winjs", "UI.TrackTabBehavior.detach")
  @js.native
  def detach(element: HTMLElement): Unit = js.native
}
