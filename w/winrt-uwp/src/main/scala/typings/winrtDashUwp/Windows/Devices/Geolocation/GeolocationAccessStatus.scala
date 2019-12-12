package typings.winrtDashUwp.Windows.Devices.Geolocation

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Devices.Geolocation.GeolocationAccessStatus.allowed
import typings.winrtDashUwp.Windows.Devices.Geolocation.GeolocationAccessStatus.denied
import typings.winrtDashUwp.Windows.Devices.Geolocation.GeolocationAccessStatus.unspecified
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GeolocationAccessStatus with Double] = js.native
  /* 1 */ @js.native
  object allowed extends TopLevel[allowed with Double]
  
  /* 2 */ @js.native
  object denied extends TopLevel[denied with Double]
  
  /* 0 */ @js.native
  object unspecified extends TopLevel[unspecified with Double]
  
}

