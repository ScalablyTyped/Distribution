package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AltitudeReferenceSystem extends js.Object

/** Indicates the altitude reference system to be used in defining a geographic shape. */
@JSGlobal("Windows.Devices.Geolocation.AltitudeReferenceSystem")
@js.native
object AltitudeReferenceSystem extends js.Object {
  /** The altitude reference system is based on an ellipsoid which is a mathematical approximation of the shape of the Earth. */
  @js.native
  sealed trait ellipsoid
    extends winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.AltitudeReferenceSystem
  
  /** The altitude reference system is based on the distance above sea level. */
  @js.native
  sealed trait geoid
    extends winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.AltitudeReferenceSystem
  
  /** The altitude reference system is based on the distance above the tallest surface structures, such as buildings, trees, roads, etc., above terrain or ground level. */
  @js.native
  sealed trait surface
    extends winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.AltitudeReferenceSystem
  
  /** The altitude reference system is based on distance above terrain or ground level. */
  @js.native
  sealed trait terrain
    extends winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.AltitudeReferenceSystem
  
  /** The altitude reference system was not specified. */
  @js.native
  sealed trait unspecified
    extends winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.AltitudeReferenceSystem
  
  /* 2 */ val ellipsoid: ellipsoid with scala.Double = js.native
  /* 3 */ val geoid: geoid with scala.Double = js.native
  /* 4 */ val surface: surface with scala.Double = js.native
  /* 1 */ val terrain: terrain with scala.Double = js.native
  /* 0 */ val unspecified: unspecified with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.AltitudeReferenceSystem with scala.Double
  ] = js.native
}

