package typings.three

import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcThreeMod.BufferGeometry
import typings.three.srcThreeMod.Matrix4
import typings.three.srcThreeMod.Mesh
import typings.three.srcThreeMod.MeshBasicMaterial
import typings.three.srcThreeMod.Plane
import typings.three.srcThreeMod.Vector4
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmObjectsShadowMeshMod {
  
  @JSImport("three/examples/jsm/objects/ShadowMesh", "ShadowMesh")
  @js.native
  open class ShadowMesh protected () extends Mesh[BufferGeometry[NormalBufferAttributes], MeshBasicMaterial] {
    def this(mesh: Mesh[
            typings.three.srcCoreBufferGeometryMod.BufferGeometry[NormalBufferAttributes], 
            Material | js.Array[Material]
          ]) = this()
    
    val isShadowMesh: `true` = js.native
    
    var meshMatrix: Matrix4 = js.native
    
    def update(plane: Plane, lightPosition4D: Vector4): Unit = js.native
  }
}
