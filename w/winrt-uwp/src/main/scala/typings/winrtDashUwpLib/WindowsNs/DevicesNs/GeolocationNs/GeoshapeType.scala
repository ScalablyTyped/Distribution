package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GeoshapeType extends js.Object

/** Indicates the shape of a geographic region. */
@JSGlobal("Windows.Devices.Geolocation.GeoshapeType")
@js.native
object GeoshapeType extends js.Object {
  /** The geographic region is a rectangular region. */
  @js.native
  sealed trait geoboundingBox
    extends winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.GeoshapeType
  
  /** The geographic region is a circle with a center point and a radius. */
  @js.native
  sealed trait geocircle
    extends winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.GeoshapeType
  
  /** The geographic region is an order series of points. */
  @js.native
  sealed trait geopath
    extends winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.GeoshapeType
  
  /** The geographic region is a point. */
  @js.native
  sealed trait geopoint
    extends winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.GeoshapeType
  
  /* 3 */ val geoboundingBox: geoboundingBox with scala.Double = js.native
  /* 1 */ val geocircle: geocircle with scala.Double = js.native
  /* 2 */ val geopath: geopath with scala.Double = js.native
  /* 0 */ val geopoint: geopoint with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.GeoshapeType with scala.Double] = js.native
}

