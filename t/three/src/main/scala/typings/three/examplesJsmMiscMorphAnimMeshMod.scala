package typings.three

import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcThreeMod.AnimationAction
import typings.three.srcThreeMod.AnimationMixer
import typings.three.srcThreeMod.Mesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmMiscMorphAnimMeshMod {
  
  @JSImport("three/examples/jsm/misc/MorphAnimMesh", "MorphAnimMesh")
  @js.native
  open class MorphAnimMesh protected ()
    extends Mesh[BufferGeometry, Material | js.Array[Material]] {
    def this(geometry: typings.three.srcThreeMod.BufferGeometry, material: typings.three.srcThreeMod.Material) = this()
    
    var activeAction: AnimationAction | Null = js.native
    
    var mixer: AnimationMixer = js.native
    
    def playAnimation(label: String, fps: Double): Unit = js.native
    
    def setDirectionBackward(): Unit = js.native
    
    def setDirectionForward(): Unit = js.native
    
    def updateAnimation(delta: Double): Unit = js.native
  }
}
