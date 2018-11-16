package typings
package w3cDashGenericDashSensorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Sensor")
@js.native
class Sensor ()
  extends stdLib.EventTarget {
  val activated: scala.Boolean = js.native
  val timestamp: js.UndefOr[scala.Double] = js.native
  @JSName("addEventListener")
  def addEventListener_activate(
    `type`: w3cDashGenericDashSensorLib.w3cDashGenericDashSensorLibStrings.activate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_activate(
    `type`: w3cDashGenericDashSensorLib.w3cDashGenericDashSensorLibStrings.activate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: w3cDashGenericDashSensorLib.w3cDashGenericDashSensorLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SensorErrorEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: w3cDashGenericDashSensorLib.w3cDashGenericDashSensorLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SensorErrorEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reading(
    `type`: w3cDashGenericDashSensorLib.w3cDashGenericDashSensorLibStrings.reading,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reading(
    `type`: w3cDashGenericDashSensorLib.w3cDashGenericDashSensorLibStrings.reading,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def onactivate(`this`: this.type, ev: stdLib.Event): js.Any = js.native
  def onerror(`this`: this.type, ev: SensorErrorEvent): js.Any = js.native
  def onreading(`this`: this.type, ev: stdLib.Event): js.Any = js.native
   // Should be DOMHighResTimeStamp.
  def start(): scala.Unit = js.native
  def stop(): scala.Unit = js.native
}

