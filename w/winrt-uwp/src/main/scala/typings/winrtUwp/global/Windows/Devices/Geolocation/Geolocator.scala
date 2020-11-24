package typings.winrtUwp.global.Windows.Devices.Geolocation

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to the current geographic location. */
@JSGlobal("Windows.Devices.Geolocation.Geolocator")
@js.native
/** Initializes a new Geolocator object. */
class Geolocator ()
  extends typings.winrtUwp.Windows.Devices.Geolocation.Geolocator
/* static members */
@JSGlobal("Windows.Devices.Geolocation.Geolocator")
@js.native
object Geolocator extends js.Object {
  
  /**
    * Starts an asynchronous operation to retrieve the location history of the device.
    * @param startTime Represents the beginning of the time span for which positions are to be returned.
    * @return Positions (of type Geoposition ) that were collected during the specified time span.
    */
  def getGeopositionHistoryAsync(startTime: Date): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Starts an asynchronous operation to retrieve the location history of the device.
    * @param startTime Represents the beginning of the time span for which positions are to be returned.
    * @param duration Represents the length of time after startTime for which positions are to be returned.
    * @return Positions (of type Geoposition ) that were collected during the specified time span.
    */
  def getGeopositionHistoryAsync(startTime: Date, duration: Double): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  
  /**
    * Requests permission to access location data.
    * @return A GeolocationAccessStatus that indicates if permission to location data has been granted.
    */
  def requestAccessAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Geolocation.GeolocationAccessStatus] = js.native
}
