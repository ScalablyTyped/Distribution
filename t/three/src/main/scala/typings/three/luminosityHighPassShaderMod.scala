package typings.three

import typings.three.anon.DefaultColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object luminosityHighPassShaderMod {
  
  object LuminosityHighPassShader {
    
    @JSImport("three/examples/jsm/shaders/LuminosityHighPassShader", "LuminosityHighPassShader")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("three/examples/jsm/shaders/LuminosityHighPassShader", "LuminosityHighPassShader.fragmentShader")
    @js.native
    def fragmentShader: String = js.native
    inline def fragmentShader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fragmentShader")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/shaders/LuminosityHighPassShader", "LuminosityHighPassShader.shaderID")
    @js.native
    def shaderID: String = js.native
    inline def shaderID_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shaderID")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/shaders/LuminosityHighPassShader", "LuminosityHighPassShader.uniforms")
    @js.native
    def uniforms: DefaultColor = js.native
    inline def uniforms_=(x: DefaultColor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uniforms")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/shaders/LuminosityHighPassShader", "LuminosityHighPassShader.vertexShader")
    @js.native
    def vertexShader: String = js.native
    inline def vertexShader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vertexShader")(x.asInstanceOf[js.Any])
  }
}
