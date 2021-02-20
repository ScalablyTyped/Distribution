package typings.winrtUwp.Windows.Devices.Geolocation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GeoshapeType extends StObject
/** Indicates the shape of a geographic region. */
@JSGlobal("Windows.Devices.Geolocation.GeoshapeType")
@js.native
object GeoshapeType extends StObject {
  
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
}
