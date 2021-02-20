package typings.winrtUwp.Windows.Devices.Geolocation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GeolocationAccessStatus extends StObject
/** Indicates if your app has permission to access location data. */
@JSGlobal("Windows.Devices.Geolocation.GeolocationAccessStatus")
@js.native
object GeolocationAccessStatus extends StObject {
  
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
