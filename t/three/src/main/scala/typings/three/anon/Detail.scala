package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Detail extends StObject {
  
  val detail: Double
  
  val indices: js.Array[Double]
  
  val radius: Double
  
  val vertices: js.Array[Double]
}
object Detail {
  
  inline def apply(detail: Double, indices: js.Array[Double], radius: Double, vertices: js.Array[Double]): Detail = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Detail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Detail] (val x: Self) extends AnyVal {
    
    inline def setDetail(value: Double): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setIndices(value: js.Array[Double]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesVarargs(value: Double*): Self = StObject.set(x, "indices", js.Array(value*))
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setVertices(value: js.Array[Double]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    inline def setVerticesVarargs(value: Double*): Self = StObject.set(x, "vertices", js.Array(value*))
  }
}
