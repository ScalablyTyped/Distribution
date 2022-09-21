package typings.three

import typings.three.anon.AddRGB
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorCorrectionShaderMod {
  
  object ColorCorrectionShader {
    
    @JSImport("three/examples/jsm/shaders/ColorCorrectionShader", "ColorCorrectionShader")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("three/examples/jsm/shaders/ColorCorrectionShader", "ColorCorrectionShader.fragmentShader")
    @js.native
    def fragmentShader: String = js.native
    inline def fragmentShader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fragmentShader")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/shaders/ColorCorrectionShader", "ColorCorrectionShader.uniforms")
    @js.native
    def uniforms: AddRGB = js.native
    inline def uniforms_=(x: AddRGB): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uniforms")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/shaders/ColorCorrectionShader", "ColorCorrectionShader.vertexShader")
    @js.native
    def vertexShader: String = js.native
    inline def vertexShader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vertexShader")(x.asInstanceOf[js.Any])
  }
}
