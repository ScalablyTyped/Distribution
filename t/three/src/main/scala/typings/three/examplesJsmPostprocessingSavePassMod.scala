package typings.three

import typings.three.examplesJsmPostprocessingPassMod.Pass
import typings.three.srcThreeMod.ShaderMaterial
import typings.three.srcThreeMod.WebGLRenderTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmPostprocessingSavePassMod {
  
  @JSImport("three/examples/jsm/postprocessing/SavePass", "SavePass")
  @js.native
  open class SavePass () extends Pass {
    def this(renderTarget: WebGLRenderTarget) = this()
    
    var fsQuad: js.Object = js.native
    
    var material: ShaderMaterial = js.native
    
    var renderTarget: WebGLRenderTarget = js.native
    
    var textureID: String = js.native
    
    var uniforms: js.Object = js.native
  }
}
