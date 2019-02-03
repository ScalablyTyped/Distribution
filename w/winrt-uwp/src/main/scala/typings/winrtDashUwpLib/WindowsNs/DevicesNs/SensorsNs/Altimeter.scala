package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides an interface for an altimetric sensor to measure the relative altitude. */
@JSGlobal("Windows.Devices.Sensors.Altimeter")
@js.native
abstract class Altimeter () extends js.Object {
  /** Gets the device identifier. */
  var deviceId: java.lang.String = js.native
  /** The smallest report interval that is supported by this altimeter sensor. */
  var minimumReportInterval: scala.Double = js.native
  /** Occurs each time the altimeter sensor reports a new value. */
  @JSName("onreadingchanged")
  var onreadingchanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[Altimeter, AltimeterReadingChangedEventArgs] = js.native
  /** Gets or sets the current report interval for the altimeter. */
  var reportInterval: scala.Double = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readingchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.readingchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[Altimeter, AltimeterReadingChangedEventArgs]
  ): scala.Unit = js.native
  /**
    * Gets the current reading for the altimeter.
    * @return The current alititude reading for this sensor.
    */
  def getCurrentReading(): AltimeterReading = js.native
  /** Occurs each time the altimeter sensor reports a new value. */
  def onreadingchanged(ev: AltimeterReadingChangedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[Altimeter]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readingchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.readingchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[Altimeter, AltimeterReadingChangedEventArgs]
  ): scala.Unit = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Sensors.Altimeter")
@js.native
object Altimeter extends js.Object {
  /**
    * Returns the default altimeter sensor.
    * @return The default altimeter.
    */
  def getDefault(): winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.Altimeter = js.native
}

