package typings.wechatMiniprogram.DB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoMultiPoint
  extends StObject
     with GeoInstance {
  
  var points: js.Array[GeoPoint]
  
  def toJSON(): IGeoJSONMultiPoint
}
object GeoMultiPoint {
  
  @scala.inline
  def apply(points: js.Array[GeoPoint], toJSON: () => IGeoJSONMultiPoint): GeoMultiPoint = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[GeoMultiPoint]
  }
  
  @scala.inline
  implicit class GeoMultiPointMutableBuilder[Self <: GeoMultiPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPoints(value: js.Array[GeoPoint]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsVarargs(value: GeoPoint*): Self = StObject.set(x, "points", js.Array(value :_*))
    
    @scala.inline
    def setToJSON(value: () => IGeoJSONMultiPoint): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}
