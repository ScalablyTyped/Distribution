package typings.w3cGenericSensor

import typings.std.Event
import typings.std.EventTarget
import typings.w3cGenericSensor.w3cGenericSensorStrings.activate
import typings.w3cGenericSensor.w3cGenericSensorStrings.error
import typings.w3cGenericSensor.w3cGenericSensorStrings.reading
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sensor
  extends StObject
     with EventTarget {
  
  val activated: Boolean = js.native
  
  def addEventListener(`type`: reading | activate, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  def addEventListener(
    `type`: reading | activate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* ev */ SensorErrorEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SensorErrorEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  
  def onactivate(ev: Event): Any = js.native
  
  def onerror(ev: SensorErrorEvent): Any = js.native
  
  def onreading(ev: Event): Any = js.native
  
  // Should be DOMHighResTimeStamp.
  def start(): Unit = js.native
  
  def stop(): Unit = js.native
  
  val timestamp: js.UndefOr[Double] = js.native
}
