package typings.three

import typings.three.examplesJsmPostprocessingPassMod.FullScreenQuad
import typings.three.examplesJsmPostprocessingPassMod.Pass
import typings.three.srcThreeMod.ShaderMaterial
import typings.three.srcThreeMod.Texture
import typings.three.srcThreeMod.WebGLRenderTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmPostprocessingSmaapassMod {
  
  @JSImport("three/examples/jsm/postprocessing/SMAAPass", "SMAAPass")
  @js.native
  open class SMAAPass protected () extends Pass {
    def this(width: Double, height: Double) = this()
    
    var areaTexture: Texture = js.native
    
    var edgesRT: WebGLRenderTarget = js.native
    
    var fsQuad: FullScreenQuad = js.native
    
    def getAreaTexture(): String = js.native
    
    def getSearchTexture(): String = js.native
    
    var materialBlend: ShaderMaterial = js.native
    
    var materialEdges: ShaderMaterial = js.native
    
    var materialWeights: ShaderMaterial = js.native
    
    var searchTexture: Texture = js.native
    
    var uniformsBlend: js.Object = js.native
    
    var uniformsEdges: js.Object = js.native
    
    var uniformsWeights: js.Object = js.native
    
    var weightsRT: WebGLRenderTarget = js.native
  }
}
