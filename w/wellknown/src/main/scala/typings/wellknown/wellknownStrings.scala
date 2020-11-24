package typings.wellknown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wellknownStrings {
  
  @scala.inline
  def LineString: LineString = "LineString".asInstanceOf[LineString]
  
  @scala.inline
  def MultiLineString: MultiLineString = "MultiLineString".asInstanceOf[MultiLineString]
  
  @scala.inline
  def MultiPoint: MultiPoint = "MultiPoint".asInstanceOf[MultiPoint]
  
  @scala.inline
  def MultiPolygon: MultiPolygon = "MultiPolygon".asInstanceOf[MultiPolygon]
  
  @scala.inline
  def Point: Point = "Point".asInstanceOf[Point]
  
  @scala.inline
  def Polygon: Polygon = "Polygon".asInstanceOf[Polygon]
  
  @js.native
  sealed trait LineString extends js.Object
  
  @js.native
  sealed trait MultiLineString extends js.Object
  
  @js.native
  sealed trait MultiPoint extends js.Object
  
  @js.native
  sealed trait MultiPolygon extends js.Object
  
  @js.native
  sealed trait Point extends js.Object
  
  @js.native
  sealed trait Polygon extends js.Object
}
