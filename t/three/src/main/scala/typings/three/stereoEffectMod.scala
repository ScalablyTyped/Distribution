package typings.three

import typings.three.threeMod.Camera
import typings.three.threeMod.Scene
import typings.three.threeMod.WebGLRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stereoEffectMod {
  
  @JSImport("three/examples/jsm/effects/StereoEffect", "StereoEffect")
  @js.native
  open class StereoEffect protected () extends StObject {
    def this(renderer: WebGLRenderer) = this()
    
    def render(scene: Scene, camera: Camera): Unit = js.native
    
    def setEyeSeparation(eyeSep: Double): Unit = js.native
    
    def setSize(width: Double, height: Double): Unit = js.native
  }
}
