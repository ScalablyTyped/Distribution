package typings.three

import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.materialMod.Material
import typings.three.threeMod.AnimationAction
import typings.three.threeMod.AnimationMixer
import typings.three.threeMod.Mesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object morphAnimMeshMod {
  
  @JSImport("three/examples/jsm/misc/MorphAnimMesh", "MorphAnimMesh")
  @js.native
  open class MorphAnimMesh protected ()
    extends Mesh[BufferGeometry, Material | js.Array[Material]] {
    def this(geometry: typings.three.threeMod.BufferGeometry, material: typings.three.threeMod.Material) = this()
    
    var activeAction: AnimationAction | Null = js.native
    
    var mixer: AnimationMixer = js.native
    
    def playAnimation(label: String, fps: Double): Unit = js.native
    
    def setDirectionBackward(): Unit = js.native
    
    def setDirectionForward(): Unit = js.native
    
    def updateAnimation(delta: Double): Unit = js.native
  }
}
