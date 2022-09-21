package typings.three

import typings.three.anon.Brightness
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object brightnessContrastShaderMod {
  
  object BrightnessContrastShader {
    
    @JSImport("three/examples/jsm/shaders/BrightnessContrastShader", "BrightnessContrastShader")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("three/examples/jsm/shaders/BrightnessContrastShader", "BrightnessContrastShader.fragmentShader")
    @js.native
    def fragmentShader: String = js.native
    inline def fragmentShader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fragmentShader")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/shaders/BrightnessContrastShader", "BrightnessContrastShader.uniforms")
    @js.native
    def uniforms: Brightness = js.native
    inline def uniforms_=(x: Brightness): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uniforms")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/shaders/BrightnessContrastShader", "BrightnessContrastShader.vertexShader")
    @js.native
    def vertexShader: String = js.native
    inline def vertexShader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vertexShader")(x.asInstanceOf[js.Any])
  }
}
