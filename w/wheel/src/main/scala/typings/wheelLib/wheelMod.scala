package typings
package wheelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wheel", JSImport.Namespace)
@js.native
object wheelMod extends js.Object {
  def apply(
    element: stdLib.GlobalEventHandlers,
    callback: js.Function1[/* event */ stdLib.WheelEvent, scala.Unit]
  ): scala.Unit = js.native
  def apply(
    element: stdLib.GlobalEventHandlers,
    callback: js.Function1[/* event */ stdLib.WheelEvent, scala.Unit],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  /**
       * Adds a callback to receive mouse wheel events from the given element.
       */
  def addWheelListener(
    element: stdLib.GlobalEventHandlers,
    callback: js.Function1[/* event */ stdLib.WheelEvent, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Adds a callback to receive mouse wheel events from the given element.
       */
  def addWheelListener(
    element: stdLib.GlobalEventHandlers,
    callback: js.Function1[/* event */ stdLib.WheelEvent, scala.Unit],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  /**
       *  Removes a previously added wheel listener callback.
       */
  def removeWheelListener(
    element: stdLib.GlobalEventHandlers,
    callback: js.Function1[/* event */ stdLib.WheelEvent, scala.Unit]
  ): scala.Unit = js.native
  /**
       *  Removes a previously added wheel listener callback.
       */
  def removeWheelListener(
    element: stdLib.GlobalEventHandlers,
    callback: js.Function1[/* event */ stdLib.WheelEvent, scala.Unit],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
}

