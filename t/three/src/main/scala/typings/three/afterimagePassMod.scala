package typings.three

import typings.three.passMod.Pass
import typings.three.threeMod.ShaderMaterial
import typings.three.threeMod.WebGLRenderTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object afterimagePassMod {
  
  @JSImport("three/examples/jsm/postprocessing/AfterimagePass", "AfterimagePass")
  @js.native
  open class AfterimagePass () extends Pass {
    def this(damp: Double) = this()
    
    var compFsQuad: js.Object = js.native
    
    var copyFsQuad: js.Object = js.native
    
    var shader: js.Object = js.native
    
    var shaderMaterial: ShaderMaterial = js.native
    
    var textureComp: WebGLRenderTarget = js.native
    
    var textureOld: WebGLRenderTarget = js.native
    
    var uniforms: js.Object = js.native
  }
}
