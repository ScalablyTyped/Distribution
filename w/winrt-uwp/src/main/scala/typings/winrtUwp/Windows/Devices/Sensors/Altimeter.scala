package typings.winrtUwp.Windows.Devices.Sensors

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.readingchanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides an interface for an altimetric sensor to measure the relative altitude. */
@js.native
trait Altimeter extends js.Object {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readingchanged(`type`: readingchanged, listener: TypedEventHandler[Altimeter, AltimeterReadingChangedEventArgs]): Unit = js.native
  
  /** Gets the device identifier. */
  var deviceId: String = js.native
  
  /**
    * Gets the current reading for the altimeter.
    * @return The current alititude reading for this sensor.
    */
  def getCurrentReading(): AltimeterReading = js.native
  
  /** The smallest report interval that is supported by this altimeter sensor. */
  var minimumReportInterval: Double = js.native
  
  /** Occurs each time the altimeter sensor reports a new value. */
  def onreadingchanged(ev: AltimeterReadingChangedEventArgs with WinRTEvent[Altimeter]): Unit = js.native
  /** Occurs each time the altimeter sensor reports a new value. */
  @JSName("onreadingchanged")
  var onreadingchanged_Original: TypedEventHandler[Altimeter, AltimeterReadingChangedEventArgs] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readingchanged(`type`: readingchanged, listener: TypedEventHandler[Altimeter, AltimeterReadingChangedEventArgs]): Unit = js.native
  
  /** Gets or sets the current report interval for the altimeter. */
  var reportInterval: Double = js.native
}
