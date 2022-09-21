package typings.three

import typings.three.threeMod.Camera
import typings.three.threeMod.Scene
import typings.three.threeMod.WebGLRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object peppersGhostEffectMod {
  
  @JSImport("three/examples/jsm/effects/PeppersGhostEffect", "PeppersGhostEffect")
  @js.native
  open class PeppersGhostEffect protected () extends StObject {
    def this(renderer: WebGLRenderer) = this()
    
    var cameraDistance: Double = js.native
    
    var reflectFromAbove: Boolean = js.native
    
    def render(scene: Scene, camera: Camera): Unit = js.native
    
    def setSize(width: Double, height: Double): Unit = js.native
  }
}
