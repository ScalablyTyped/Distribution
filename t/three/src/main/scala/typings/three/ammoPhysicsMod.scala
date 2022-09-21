package typings.three

import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.materialMod.Material
import typings.three.threeMod.Mesh
import typings.three.threeMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ammoPhysicsMod {
  
  @JSImport("three/examples/jsm/physics/AmmoPhysics", "AmmoPhysics")
  @js.native
  open class AmmoPhysics () extends StObject {
    
    def addMesh(mesh: Mesh[BufferGeometry, Material | js.Array[Material]], mass: Double): Unit = js.native
    
    def setMeshPosition(mesh: Mesh[BufferGeometry, Material | js.Array[Material]], position: Vector3, index: Double): Unit = js.native
  }
}
