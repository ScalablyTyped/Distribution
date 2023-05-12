package typings.three

import typings.three.examplesJsmPostprocessingPassMod.FullScreenQuad
import typings.three.examplesJsmPostprocessingPassMod.Pass
import typings.three.srcThreeMod.ShaderMaterial
import typings.three.srcThreeMod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmPostprocessingTexturePassMod {
  
  @JSImport("three/examples/jsm/postprocessing/TexturePass", "TexturePass")
  @js.native
  open class TexturePass protected () extends Pass {
    def this(map: Texture) = this()
    def this(map: Texture, opacity: Double) = this()
    
    var fsQuad: FullScreenQuad = js.native
    
    var map: Texture = js.native
    
    var material: ShaderMaterial = js.native
    
    var opacity: Double = js.native
    
    var uniforms: js.Object = js.native
  }
}
