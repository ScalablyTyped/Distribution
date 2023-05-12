package typings.three

import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcThreeMod.Mesh
import typings.three.srcThreeMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmPhysicsAmmoPhysicsMod {
  
  @JSImport("three/examples/jsm/physics/AmmoPhysics", "AmmoPhysics")
  @js.native
  open class AmmoPhysics () extends StObject {
    
    def addMesh(mesh: Mesh[BufferGeometry[NormalBufferAttributes], Material | js.Array[Material]], mass: Double): Unit = js.native
    
    def setMeshPosition(
      mesh: Mesh[BufferGeometry[NormalBufferAttributes], Material | js.Array[Material]],
      position: Vector3,
      index: Double
    ): Unit = js.native
  }
}
