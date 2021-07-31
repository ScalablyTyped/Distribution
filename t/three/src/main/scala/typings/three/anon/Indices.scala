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
  
  @scala.inline
  def apply(detail: Double, indices: js.Array[Double], radius: Double, vertices: js.Array[Double]): Indices = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Indices]
  }
  
  @scala.inline
  implicit class IndicesMutableBuilder[Self <: Indices] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetail(value: Double): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndices(value: js.Array[Double]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicesVarargs(value: Double*): Self = StObject.set(x, "indices", js.Array(value :_*))
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertices(value: js.Array[Double]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticesVarargs(value: Double*): Self = StObject.set(x, "vertices", js.Array(value :_*))
  }
}
