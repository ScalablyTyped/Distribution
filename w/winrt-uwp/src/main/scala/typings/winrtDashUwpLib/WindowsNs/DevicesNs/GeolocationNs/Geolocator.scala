package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to the current geographic location. */
@JSGlobal("Windows.Devices.Geolocation.Geolocator")
@js.native
/** Initializes a new Geolocator object. */
class Geolocator () extends js.Object {
  /** The accuracy level at which the Geolocator provides location updates. */
  var desiredAccuracy: PositionAccuracy = js.native
  /** Gets or sets the desired accuracy in meters for data returned from the location service. */
  var desiredAccuracyInMeters: scala.Double = js.native
  /** The status that indicates the ability of the Geolocator to provide location updates. */
  var locationStatus: PositionStatus = js.native
  /** Gets and sets the distance of movement, in meters, relative to the coordinate from the last PositionChanged event, that is required for the Geolocator to raise a PositionChanged event. */
  var movementThreshold: scala.Double = js.native
  /** Raised when the location is updated. */
  @JSName("onpositionchanged")
  var onpositionchanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[Geolocator, PositionChangedEventArgs] = js.native
  /** Raised when the ability of the Geolocator to provide updated location changes. */
  @JSName("onstatuschanged")
  var onstatuschanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[Geolocator, StatusChangedEventArgs] = js.native
  /** The requested minimum time interval between location updates, in milliseconds. If your application requires updates infrequently, set this value so that location services can conserve power by calculating location only when needed. */
  var reportInterval: scala.Double = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_positionchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.positionchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[Geolocator, PositionChangedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statuschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.statuschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[Geolocator, StatusChangedEventArgs]
  ): scala.Unit = js.native
  /**
    * Starts an asynchronous operation to retrieve the current location of the device.
    * @return Provides methods for starting the asynchronous request for location data and handling its completion.
    */
  def getGeopositionAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[Geoposition] = js.native
  /**
    * Starts an asynchronous operation to retrieve the current location of the device.
    * @param maximumAge The maximum acceptable age of cached location data. A TimeSpan is a time period expressed in 100-nanosecond units.
    * @param timeout The timeout. A TimeSpan is a time period expressed in 100-nanosecond units.
    * @return Provides methods for starting the asynchronous request for location data and handling its completion.
    */
  def getGeopositionAsync(maximumAge: scala.Double, timeout: scala.Double): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[Geoposition] = js.native
  /** Raised when the location is updated. */
  def onpositionchanged(ev: PositionChangedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[Geolocator]): scala.Unit = js.native
  /** Raised when the ability of the Geolocator to provide updated location changes. */
  def onstatuschanged(ev: StatusChangedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[Geolocator]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_positionchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.positionchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[Geolocator, PositionChangedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statuschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.statuschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[Geolocator, StatusChangedEventArgs]
  ): scala.Unit = js.native
}

/** Provides access to the current geographic location. */
@JSGlobal("Windows.Devices.Geolocation.Geolocator")
@js.native
object Geolocator extends js.Object {
  /**
    * Starts an asynchronous operation to retrieve the location history of the device.
    * @param startTime Represents the beginning of the time span for which positions are to be returned.
    * @return Positions (of type Geoposition ) that were collected during the specified time span.
    */
  def getGeopositionHistoryAsync(startTime: stdLib.Date): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /**
    * Starts an asynchronous operation to retrieve the location history of the device.
    * @param startTime Represents the beginning of the time span for which positions are to be returned.
    * @param duration Represents the length of time after startTime for which positions are to be returned.
    * @return Positions (of type Geoposition ) that were collected during the specified time span.
    */
  def getGeopositionHistoryAsync(startTime: stdLib.Date, duration: scala.Double): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /**
    * Requests permission to access location data.
    * @return A GeolocationAccessStatus that indicates if permission to location data has been granted.
    */
  def requestAccessAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.GeolocationAccessStatus] = js.native
}

