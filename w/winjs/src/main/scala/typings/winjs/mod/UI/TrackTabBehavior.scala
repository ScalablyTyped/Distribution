package typings.winjs.mod.UI

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides methods for detecting when the user tabs to or from DOM elements.
**/
object TrackTabBehavior {
  
  @JSImport("winjs", "UI.TrackTabBehavior")
  @js.native
  val ^ : js.Any = js.native
  
  //#region Functions
  /**
    * Sets the tab order for the specified element within its container.
    * @param element The element to update.
    * @param tabIndex The index value of the element within its container.
    **/
  inline def attach(element: HTMLElement, tabIndex: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attach")(element.asInstanceOf[js.Any], tabIndex.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Removes the tab order information from the specified element.
    * @param element The element to remove tab information from.
    **/
  inline def detach(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("detach")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
