package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Indices extends StObject {
  
  var detail: Double
  
  var indices: js.Array[Double]
  
  var radius: Double
  
  var vertices: js.Array[Double]
}
object Indices {
  
  inline def apply(detail: Double, indices: js.Array[Double], radius: Double, vertices: js.Array[Double]): Indices = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Indices]
  }
  
  extension [Self <: Indices](x: Self) {
    
    inline def setDetail(value: Double): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setIndices(value: js.Array[Double]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesVarargs(value: Double*): Self = StObject.set(x, "indices", js.Array(value :_*))
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setVertices(value: js.Array[Double]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    inline def setVerticesVarargs(value: Double*): Self = StObject.set(x, "vertices", js.Array(value :_*))
  }
}
