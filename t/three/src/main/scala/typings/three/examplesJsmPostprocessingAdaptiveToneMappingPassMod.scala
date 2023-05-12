package typings.three

import typings.three.examplesJsmPostprocessingPassMod.FullScreenQuad
import typings.three.examplesJsmPostprocessingPassMod.Pass
import typings.three.srcThreeMod.ShaderMaterial
import typings.three.srcThreeMod.WebGLRenderTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmPostprocessingAdaptiveToneMappingPassMod {
  
  @JSImport("three/examples/jsm/postprocessing/AdaptiveToneMappingPass", "AdaptiveToneMappingPass")
  @js.native
  open class AdaptiveToneMappingPass () extends Pass {
    def this(adaptive: Boolean) = this()
    def this(adaptive: Boolean, resolution: Double) = this()
    def this(adaptive: Unit, resolution: Double) = this()
    
    var adaptLuminanceShader: js.Object = js.native
    
    var adaptive: Boolean = js.native
    
    var copyUniforms: js.Object = js.native
    
    var currentLuminanceRT: WebGLRenderTarget = js.native
    
    var fsQuad: FullScreenQuad = js.native
    
    var luminanceRT: WebGLRenderTarget = js.native
    
    var materialAdaptiveLum: ShaderMaterial = js.native
    
    var materialCopy: ShaderMaterial = js.native
    
    var materialLuminance: ShaderMaterial = js.native
    
    var materialToneMap: ShaderMaterial = js.native
    
    var needsInit: Double = js.native
    
    var previousLuminanceRT: WebGLRenderTarget = js.native
    
    def reset(): Unit = js.native
    
    var resolution: Double = js.native
    
    def setAdaptionRate(rate: Double): Unit = js.native
    
    def setAdaptive(adaptive: Boolean): Unit = js.native
    
    def setAverageLuminance(avgLum: Double): Unit = js.native
    
    def setMaxLuminance(maxLum: Double): Unit = js.native
    
    def setMiddleGrey(middleGrey: Double): Unit = js.native
    
    def setMinLuminance(minLum: Double): Unit = js.native
  }
}
