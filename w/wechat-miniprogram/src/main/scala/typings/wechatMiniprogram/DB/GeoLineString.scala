package typings.wechatMiniprogram.DB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoLineString
  extends StObject
     with GeoInstance {
  
  var points: js.Array[GeoPoint]
  
  def toJSON(): IGeoJSONLineString
}
object GeoLineString {
  
  @scala.inline
  def apply(points: js.Array[GeoPoint], toJSON: () => IGeoJSONLineString): GeoLineString = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[GeoLineString]
  }
  
  @scala.inline
  implicit class GeoLineStringMutableBuilder[Self <: GeoLineString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPoints(value: js.Array[GeoPoint]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsVarargs(value: GeoPoint*): Self = StObject.set(x, "points", js.Array(value :_*))
    
    @scala.inline
    def setToJSON(value: () => IGeoJSONLineString): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}
