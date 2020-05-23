package typings.winrtUwp.Windows.Devices.Geolocation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GeolocationAccessStatus extends js.Object

/** Indicates if your app has permission to access location data. */
@JSGlobal("Windows.Devices.Geolocation.GeolocationAccessStatus")
@js.native
object GeolocationAccessStatus extends js.Object {
  /** Permission to access location was granted. */
  @js.native
  sealed trait allowed extends GeolocationAccessStatus
  
  /** Permission to access location was denied. */
  @js.native
  sealed trait denied extends GeolocationAccessStatus
  
  /** Permission to access location was not specified. */
  @js.native
  sealed trait unspecified extends GeolocationAccessStatus
  
}

