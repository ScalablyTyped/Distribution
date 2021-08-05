package typings.wheel

import typings.std.GlobalEventHandlers
import typings.std.WheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(element: GlobalEventHandlers, callback: js.Function1[/* event */ WheelEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(element.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(
    element: GlobalEventHandlers,
    callback: js.Function1[/* event */ WheelEvent, Unit],
    useCapture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(element.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("wheel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Adds a callback to receive mouse wheel events from the given element.
    */
  inline def addWheelListener(element: GlobalEventHandlers, callback: js.Function1[/* event */ WheelEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addWheelListener")(element.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addWheelListener(
    element: GlobalEventHandlers,
    callback: js.Function1[/* event */ WheelEvent, Unit],
    useCapture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addWheelListener")(element.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    *  Removes a previously added wheel listener callback.
    */
  inline def removeWheelListener(element: GlobalEventHandlers, callback: js.Function1[/* event */ WheelEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeWheelListener")(element.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeWheelListener(
    element: GlobalEventHandlers,
    callback: js.Function1[/* event */ WheelEvent, Unit],
    useCapture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeWheelListener")(element.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
