package typings.three

import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.materialMod.Material
import typings.three.threeMod.Mesh
import typings.three.threeMod.Plane
import typings.three.threeMod.Vector4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shadowMeshMod {
  
  @JSImport("three/examples/jsm/objects/ShadowMesh", "ShadowMesh")
  @js.native
  open class ShadowMesh ()
    extends Mesh[BufferGeometry, Material | js.Array[Material]] {
    
    def update(plane: Plane, lightPosition4D: Vector4): Unit = js.native
  }
}
