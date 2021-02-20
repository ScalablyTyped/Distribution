package typings.wheel

import typings.std.GlobalEventHandlers
import typings.std.WheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("wheel", JSImport.Namespace)
  @js.native
  def apply(element: GlobalEventHandlers, callback: js.Function1[/* event */ WheelEvent, Unit]): Unit = js.native
  @JSImport("wheel", JSImport.Namespace)
  @js.native
  def apply(
    element: GlobalEventHandlers,
    callback: js.Function1[/* event */ WheelEvent, Unit],
    useCapture: Boolean
  ): Unit = js.native
  
  /**
    * Adds a callback to receive mouse wheel events from the given element.
    */
  @JSImport("wheel", "addWheelListener")
  @js.native
  def addWheelListener(element: GlobalEventHandlers, callback: js.Function1[/* event */ WheelEvent, Unit]): Unit = js.native
  @JSImport("wheel", "addWheelListener")
  @js.native
  def addWheelListener(
    element: GlobalEventHandlers,
    callback: js.Function1[/* event */ WheelEvent, Unit],
    useCapture: Boolean
  ): Unit = js.native
  
  /**
    *  Removes a previously added wheel listener callback.
    */
  @JSImport("wheel", "removeWheelListener")
  @js.native
  def removeWheelListener(element: GlobalEventHandlers, callback: js.Function1[/* event */ WheelEvent, Unit]): Unit = js.native
  @JSImport("wheel", "removeWheelListener")
  @js.native
  def removeWheelListener(
    element: GlobalEventHandlers,
    callback: js.Function1[/* event */ WheelEvent, Unit],
    useCapture: Boolean
  ): Unit = js.native
}
