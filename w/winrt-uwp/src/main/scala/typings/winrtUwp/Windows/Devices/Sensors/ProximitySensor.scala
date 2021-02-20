package typings.winrtUwp.Windows.Devices.Sensors

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.readingchanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides an interface for a proximity sensor to determine whether or not an object is detected. */
@js.native
trait ProximitySensor extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readingchanged(
    `type`: readingchanged,
    listener: TypedEventHandler[ProximitySensor, ProximitySensorReadingChangedEventArgs]
  ): Unit = js.native
  
  /**
    * Creates a controller responsible for turning the display on or off based on the ProximitySensorReading .
    * @return The controller for the phone display.
    */
  def createDisplayOnOffController(): ProximitySensorDisplayOnOffController = js.native
  
  /** Gets the device identifier. */
  var deviceId: String = js.native
  
  /**
    * Gets the current reading for the proximity sensor.
    * @return Indicates whether or not the proximity sensor detects an object, and if so, the distance to that object.
    */
  def getCurrentReading(): ProximitySensorReading = js.native
  
  /** The largest distance where the proximity sensor can detect an object. */
  var maxDistanceInMillimeters: Double = js.native
  
  /** The shortest distance where the proximity sensor can detect an object. */
  var minDistanceInMillimeters: Double = js.native
  
  /** Occurs each time the proximity sensor reports a new value. */
  def onreadingchanged(ev: ProximitySensorReadingChangedEventArgs with WinRTEvent[ProximitySensor]): Unit = js.native
  /** Occurs each time the proximity sensor reports a new value. */
  @JSName("onreadingchanged")
  var onreadingchanged_Original: TypedEventHandler[ProximitySensor, ProximitySensorReadingChangedEventArgs] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readingchanged(
    `type`: readingchanged,
    listener: TypedEventHandler[ProximitySensor, ProximitySensorReadingChangedEventArgs]
  ): Unit = js.native
}
