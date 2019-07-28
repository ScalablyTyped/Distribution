package typings.winrtDashUwp.WindowsNs.DevicesNs.GeolocationNs

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
  sealed trait ellipsoid extends AltitudeReferenceSystem
  
  /** The altitude reference system is based on the distance above sea level. */
  @js.native
  sealed trait geoid extends AltitudeReferenceSystem
  
  /** The altitude reference system is based on the distance above the tallest surface structures, such as buildings, trees, roads, etc., above terrain or ground level. */
  @js.native
  sealed trait surface extends AltitudeReferenceSystem
  
  /** The altitude reference system is based on distance above terrain or ground level. */
  @js.native
  sealed trait terrain extends AltitudeReferenceSystem
  
  /** The altitude reference system was not specified. */
  @js.native
  sealed trait unspecified extends AltitudeReferenceSystem
  
  /* 2 */ val ellipsoid: typings.winrtDashUwp.WindowsNs.DevicesNs.GeolocationNs.AltitudeReferenceSystem.ellipsoid with Double = js.native
  /* 3 */ val geoid: typings.winrtDashUwp.WindowsNs.DevicesNs.GeolocationNs.AltitudeReferenceSystem.geoid with Double = js.native
  /* 4 */ val surface: typings.winrtDashUwp.WindowsNs.DevicesNs.GeolocationNs.AltitudeReferenceSystem.surface with Double = js.native
  /* 1 */ val terrain: typings.winrtDashUwp.WindowsNs.DevicesNs.GeolocationNs.AltitudeReferenceSystem.terrain with Double = js.native
  /* 0 */ val unspecified: typings.winrtDashUwp.WindowsNs.DevicesNs.GeolocationNs.AltitudeReferenceSystem.unspecified with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AltitudeReferenceSystem with Double] = js.native
}

