package typings.three

import typings.three.examplesJsmPostprocessingPassMod.FullScreenQuad
import typings.three.examplesJsmPostprocessingPassMod.Pass
import typings.three.srcThreeMod.ShaderMaterial
import typings.three.srcThreeMod.WebGLRenderTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmPostprocessingAfterimagePassMod {
  
  @JSImport("three/examples/jsm/postprocessing/AfterimagePass", "AfterimagePass")
  @js.native
  open class AfterimagePass () extends Pass {
    def this(damp: Double) = this()
    
    var compFsQuad: FullScreenQuad = js.native
    
    var copyFsQuad: FullScreenQuad = js.native
    
    var shader: js.Object = js.native
    
    var shaderMaterial: ShaderMaterial = js.native
    
    var textureComp: WebGLRenderTarget = js.native
    
    var textureOld: WebGLRenderTarget = js.native
    
    var uniforms: js.Object = js.native
  }
}
