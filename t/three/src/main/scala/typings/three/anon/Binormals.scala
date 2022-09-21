package typings.three.anon

import typings.three.vector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Binormals extends StObject {
  
  var binormals: js.Array[Vector3]
  
  var normals: js.Array[Vector3]
  
  var tangents: js.Array[Vector3]
}
object Binormals {
  
  inline def apply(binormals: js.Array[Vector3], normals: js.Array[Vector3], tangents: js.Array[Vector3]): Binormals = {
    val __obj = js.Dynamic.literal(binormals = binormals.asInstanceOf[js.Any], normals = normals.asInstanceOf[js.Any], tangents = tangents.asInstanceOf[js.Any])
    __obj.asInstanceOf[Binormals]
  }
  
  extension [Self <: Binormals](x: Self) {
    
    inline def setBinormals(value: js.Array[Vector3]): Self = StObject.set(x, "binormals", value.asInstanceOf[js.Any])
    
    inline def setBinormalsVarargs(value: Vector3*): Self = StObject.set(x, "binormals", js.Array(value*))
    
    inline def setNormals(value: js.Array[Vector3]): Self = StObject.set(x, "normals", value.asInstanceOf[js.Any])
    
    inline def setNormalsVarargs(value: Vector3*): Self = StObject.set(x, "normals", js.Array(value*))
    
    inline def setTangents(value: js.Array[Vector3]): Self = StObject.set(x, "tangents", value.asInstanceOf[js.Any])
    
    inline def setTangentsVarargs(value: Vector3*): Self = StObject.set(x, "tangents", js.Array(value*))
  }
}
