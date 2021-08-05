package typings.wxServerSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Geo extends StObject {
  
  def LineString(points: js.Array[Point]): typings.wxServerSdk.mod.LineString
  @JSName("LineString")
  var LineString_Original: LineString
  
  def Point(longitude: Double, latitude: Double): typings.wxServerSdk.mod.Point
  @JSName("Point")
  var Point_Original: Point
  
  def Polygon(lineStrings: js.Array[LineString]): typings.wxServerSdk.mod.Polygon
  @JSName("Polygon")
  var Polygon_Original: Polygon
}
object Geo {
  
  inline def apply(LineString: LineString, Point: Point, Polygon: Polygon): Geo = {
    val __obj = js.Dynamic.literal(LineString = LineString.asInstanceOf[js.Any], Point = Point.asInstanceOf[js.Any], Polygon = Polygon.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geo]
  }
  
  extension [Self <: Geo](x: Self) {
    
    inline def setLineString(value: LineString): Self = StObject.set(x, "LineString", value.asInstanceOf[js.Any])
    
    inline def setPoint(value: Point): Self = StObject.set(x, "Point", value.asInstanceOf[js.Any])
    
    inline def setPolygon(value: Polygon): Self = StObject.set(x, "Polygon", value.asInstanceOf[js.Any])
  }
}
