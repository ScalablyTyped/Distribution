package typings.three.anon

import typings.std.Set
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcThreeMod.Mesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ids extends StObject {
  
  var ids: Set[Double]
  
  var mesh: Mesh[BufferGeometry, Material | js.Array[Material]]
}
object Ids {
  
  inline def apply(ids: Set[Double], mesh: Mesh[BufferGeometry, Material | js.Array[Material]]): Ids = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any], mesh = mesh.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ids]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ids] (val x: Self) extends AnyVal {
    
    inline def setIds(value: Set[Double]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setMesh(value: Mesh[BufferGeometry, Material | js.Array[Material]]): Self = StObject.set(x, "mesh", value.asInstanceOf[js.Any])
  }
}
