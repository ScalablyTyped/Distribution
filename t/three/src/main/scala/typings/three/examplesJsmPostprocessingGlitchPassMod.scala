package typings.three

import typings.three.examplesJsmPostprocessingPassMod.FullScreenQuad
import typings.three.examplesJsmPostprocessingPassMod.Pass
import typings.three.srcThreeMod.DataTexture
import typings.three.srcThreeMod.ShaderMaterial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmPostprocessingGlitchPassMod {
  
  @JSImport("three/examples/jsm/postprocessing/GlitchPass", "GlitchPass")
  @js.native
  open class GlitchPass () extends Pass {
    def this(dt_size: Double) = this()
    
    var curF: Double = js.native
    
    var fsQuad: FullScreenQuad = js.native
    
    def generateHeightmap(dt_size: Double): DataTexture = js.native
    
    def generateTrigger(): Unit = js.native
    
    var goWild: Boolean = js.native
    
    var material: ShaderMaterial = js.native
    
    var randX: Double = js.native
    
    var uniforms: js.Object = js.native
  }
}
