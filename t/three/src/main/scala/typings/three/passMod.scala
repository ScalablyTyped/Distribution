package typings.three

import typings.three.threeMod.Material
import typings.three.threeMod.WebGLRenderTarget
import typings.three.threeMod.WebGLRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object passMod {
  
  @JSImport("three/examples/jsm/postprocessing/Pass", "FullScreenQuad")
  @js.native
  open class FullScreenQuad () extends StObject {
    def this(material: Material) = this()
    
    def dispose(): Unit = js.native
    
    var material: Material = js.native
    
    def render(renderer: WebGLRenderer): Unit = js.native
  }
  
  @JSImport("three/examples/jsm/postprocessing/Pass", "Pass")
  @js.native
  open class Pass () extends StObject {
    
    var clear: Boolean = js.native
    
    var enabled: Boolean = js.native
    
    var needsSwap: Boolean = js.native
    
    def render(
      renderer: WebGLRenderer,
      writeBuffer: WebGLRenderTarget,
      readBuffer: WebGLRenderTarget,
      deltaTime: Double,
      maskActive: Boolean
    ): Unit = js.native
    
    var renderToScreen: Boolean = js.native
    
    def setSize(width: Double, height: Double): Unit = js.native
  }
}
