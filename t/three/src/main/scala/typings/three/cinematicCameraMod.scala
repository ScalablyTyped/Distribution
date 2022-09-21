package typings.three

import typings.three.anon.Bokehuniforms
import typings.three.anon.Rings
import typings.three.threeMod.PerspectiveCamera
import typings.three.threeMod.Scene
import typings.three.threeMod.ShaderMaterial
import typings.three.threeMod.WebGLRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cinematicCameraMod {
  
  @JSImport("three/examples/jsm/cameras/CinematicCamera", "CinematicCamera")
  @js.native
  open class CinematicCamera protected () extends PerspectiveCamera {
    def this(fov: Double, aspect: Double, near: Double, far: Double) = this()
    
    var aperture: Double = js.native
    
    var coc: Double = js.native
    
    var fNumber: Double = js.native
    
    def focusAt(focusDistance: Double): Unit = js.native
    
    var hyperFocal: Double = js.native
    
    def initPostProcessing(): Unit = js.native
    
    def linearize(depth: Double): Double = js.native
    
    var materialDepth: ShaderMaterial = js.native
    
    var postprocessing: Bokehuniforms = js.native
    
    def renderCinematic(scene: Scene, renderer: WebGLRenderer): Unit = js.native
    
    def saturate(x: Double): Double = js.native
    
    def setLens(focalLength: Double, frameHeight: Double, fNumber: Double): Unit = js.native
    def setLens(focalLength: Double, frameHeight: Double, fNumber: Double, coc: Double): Unit = js.native
    def setLens(focalLength: Double, frameHeight: Double, fNumber: Unit, coc: Double): Unit = js.native
    def setLens(focalLength: Double, frameHeight: Unit, fNumber: Double): Unit = js.native
    def setLens(focalLength: Double, frameHeight: Unit, fNumber: Double, coc: Double): Unit = js.native
    def setLens(focalLength: Double, frameHeight: Unit, fNumber: Unit, coc: Double): Unit = js.native
    
    var shaderSettings: Rings = js.native
    
    def smoothstep(near: Double, far: Double, depth: Double): Double = js.native
  }
}
