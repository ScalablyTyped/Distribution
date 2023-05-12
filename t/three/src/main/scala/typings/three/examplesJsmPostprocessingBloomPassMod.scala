package typings.three

import typings.three.examplesJsmPostprocessingPassMod.FullScreenQuad
import typings.three.examplesJsmPostprocessingPassMod.Pass
import typings.three.srcThreeMod.ShaderMaterial
import typings.three.srcThreeMod.WebGLRenderTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmPostprocessingBloomPassMod {
  
  @JSImport("three/examples/jsm/postprocessing/BloomPass", "BloomPass")
  @js.native
  open class BloomPass () extends Pass {
    def this(strength: Double) = this()
    def this(strength: Double, kernelSize: Double) = this()
    def this(strength: Unit, kernelSize: Double) = this()
    def this(strength: Double, kernelSize: Double, sigma: Double) = this()
    def this(strength: Double, kernelSize: Unit, sigma: Double) = this()
    def this(strength: Unit, kernelSize: Double, sigma: Double) = this()
    def this(strength: Unit, kernelSize: Unit, sigma: Double) = this()
    
    var convolutionUniforms: js.Object = js.native
    
    var copyUniforms: js.Object = js.native
    
    var fsQuad: FullScreenQuad = js.native
    
    var materialConvolution: ShaderMaterial = js.native
    
    var materialCopy: ShaderMaterial = js.native
    
    var renderTargetX: WebGLRenderTarget = js.native
    
    var renderTargetY: WebGLRenderTarget = js.native
  }
}
