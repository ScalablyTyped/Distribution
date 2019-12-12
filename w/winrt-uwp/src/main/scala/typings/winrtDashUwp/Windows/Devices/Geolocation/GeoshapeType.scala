package typings.winrtDashUwp.Windows.Devices.Geolocation

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Devices.Geolocation.GeoshapeType.geoboundingBox
import typings.winrtDashUwp.Windows.Devices.Geolocation.GeoshapeType.geocircle
import typings.winrtDashUwp.Windows.Devices.Geolocation.GeoshapeType.geopath
import typings.winrtDashUwp.Windows.Devices.Geolocation.GeoshapeType.geopoint
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GeoshapeType with Double] = js.native
  /* 3 */ @js.native
  object geoboundingBox extends TopLevel[geoboundingBox with Double]
  
  /* 1 */ @js.native
  object geocircle extends TopLevel[geocircle with Double]
  
  /* 2 */ @js.native
  object geopath extends TopLevel[geopath with Double]
  
  /* 0 */ @js.native
  object geopoint extends TopLevel[geopoint with Double]
  
}

