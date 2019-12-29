package typings.w3cDashGenericDashSensor

import typings.std.Event
import typings.std.EventTarget
import typings.w3cDashGenericDashSensor.w3cDashGenericDashSensorStrings.activate
import typings.w3cDashGenericDashSensor.w3cDashGenericDashSensorStrings.error
import typings.w3cDashGenericDashSensor.w3cDashGenericDashSensorStrings.reading
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Sensor")
@js.native
class Sensor () extends EventTarget {
  val activated: Boolean = js.native
  val timestamp: js.UndefOr[Double] = js.native
  @JSName("addEventListener")
  def addEventListener_activate(`type`: activate, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_activate(
    `type`: activate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* ev */ SensorErrorEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SensorErrorEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reading(`type`: reading, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reading(
    `type`: reading,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  def onactivate(ev: Event): js.Any = js.native
  def onerror(ev: SensorErrorEvent): js.Any = js.native
  def onreading(ev: Event): js.Any = js.native
   // Should be DOMHighResTimeStamp.
  def start(): Unit = js.native
  def stop(): Unit = js.native
}

