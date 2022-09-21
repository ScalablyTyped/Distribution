package typings.three

import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.materialMod.Material
import typings.three.threeMod.Mesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object morphBlendMeshMod {
  
  @JSImport("three/examples/jsm/misc/MorphBlendMesh", "MorphBlendMesh")
  @js.native
  open class MorphBlendMesh protected ()
    extends Mesh[BufferGeometry, Material | js.Array[Material]] {
    def this(geometry: typings.three.threeMod.BufferGeometry, material: typings.three.threeMod.Material) = this()
    
    var animationsList: js.Array[js.Object] = js.native
    
    var animationsMap: js.Object = js.native
    
    def autoCreateAnimations(fps: Double): Unit = js.native
    
    def createAnimation(name: String, start: Double, end: Double, fps: Double): Unit = js.native
    
    def getAnimationDuration(name: String): Double = js.native
    
    def getAnimationTime(name: String): Double = js.native
    
    def playAnimation(name: String): Unit = js.native
    
    def setAnimationDirectionBackward(name: String): Unit = js.native
    
    def setAnimationDirectionForward(name: String): Unit = js.native
    
    def setAnimationDuration(name: String, duration: Double): Unit = js.native
    
    def setAnimationFPS(name: String, fps: Double): Unit = js.native
    
    def setAnimationTime(name: String, time: Double): Unit = js.native
    
    def setAnimationWeight(name: String, weight: Double): Unit = js.native
    
    def stopAnimation(name: String): Unit = js.native
    
    def update(delta: Double): Unit = js.native
  }
}
