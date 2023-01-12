package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Faces extends StObject {
  
  var faces: Double
  
  var vertices: Double
}
object Faces {
  
  inline def apply(faces: Double, vertices: Double): Faces = {
    val __obj = js.Dynamic.literal(faces = faces.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Faces]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Faces] (val x: Self) extends AnyVal {
    
    inline def setFaces(value: Double): Self = StObject.set(x, "faces", value.asInstanceOf[js.Any])
    
    inline def setVertices(value: Double): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
  }
}
