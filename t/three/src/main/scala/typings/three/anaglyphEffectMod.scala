package typings.three

import typings.three.threeMod.Camera
import typings.three.threeMod.Matrix3
import typings.three.threeMod.Scene
import typings.three.threeMod.WebGLRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anaglyphEffectMod {
  
  @JSImport("three/examples/jsm/effects/AnaglyphEffect", "AnaglyphEffect")
  @js.native
  open class AnaglyphEffect protected () extends StObject {
    def this(renderer: WebGLRenderer) = this()
    def this(renderer: WebGLRenderer, width: Double) = this()
    def this(renderer: WebGLRenderer, width: Double, height: Double) = this()
    def this(renderer: WebGLRenderer, width: Unit, height: Double) = this()
    
    var colorMatrixLeft: Matrix3 = js.native
    
    var colorMatrixRight: Matrix3 = js.native
    
    def dispose(): Unit = js.native
    
    def render(scene: Scene, camera: Camera): Unit = js.native
    
    def setSize(width: Double, height: Double): Unit = js.native
  }
}
