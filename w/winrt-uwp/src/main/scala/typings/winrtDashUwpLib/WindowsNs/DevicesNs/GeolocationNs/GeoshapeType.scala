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
  
  val geoboundingBox: geoboundingBox with java.lang.String = js.native
  val geocircle: geocircle with java.lang.String = js.native
  val geopath: geopath with java.lang.String = js.native
  val geopoint: geopoint with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.GeoshapeType with java.lang.String
  ] = js.native
}

