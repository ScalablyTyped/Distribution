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
  
  inline def apply(points: js.Array[GeoPoint], toJSON: () => IGeoJSONMultiPoint): GeoMultiPoint = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[GeoMultiPoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeoMultiPoint] (val x: Self) extends AnyVal {
    
    inline def setPoints(value: js.Array[GeoPoint]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsVarargs(value: GeoPoint*): Self = StObject.set(x, "points", js.Array(value*))
    
    inline def setToJSON(value: () => IGeoJSONMultiPoint): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}
