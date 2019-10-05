package typings.winrtDashUwp.Windows.Devices.Geolocation

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
  sealed trait geoboundingBox extends GeoshapeType
  
  /** The geographic region is a circle with a center point and a radius. */
  @js.native
  sealed trait geocircle extends GeoshapeType
  
  /** The geographic region is an order series of points. */
  @js.native
  sealed trait geopath extends GeoshapeType
  
  /** The geographic region is a point. */
  @js.native
  sealed trait geopoint extends GeoshapeType
  
  /* 3 */ val geoboundingBox: typings.winrtDashUwp.Windows.Devices.Geolocation.GeoshapeType.geoboundingBox with Double = js.native
  /* 1 */ val geocircle: typings.winrtDashUwp.Windows.Devices.Geolocation.GeoshapeType.geocircle with Double = js.native
  /* 2 */ val geopath: typings.winrtDashUwp.Windows.Devices.Geolocation.GeoshapeType.geopath with Double = js.native
  /* 0 */ val geopoint: typings.winrtDashUwp.Windows.Devices.Geolocation.GeoshapeType.geopoint with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GeoshapeType with Double] = js.native
}

