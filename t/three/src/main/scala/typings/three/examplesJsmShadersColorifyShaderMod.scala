package typings.three

import typings.three.anon.TDiffuse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmShadersColorifyShaderMod {
  
  object ColorifyShader {
    
    @JSImport("three/examples/jsm/shaders/ColorifyShader", "ColorifyShader")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("three/examples/jsm/shaders/ColorifyShader", "ColorifyShader.fragmentShader")
    @js.native
    def fragmentShader: String = js.native
    inline def fragmentShader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fragmentShader")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/shaders/ColorifyShader", "ColorifyShader.uniforms")
    @js.native
    def uniforms: TDiffuse = js.native
    inline def uniforms_=(x: TDiffuse): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uniforms")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/shaders/ColorifyShader", "ColorifyShader.vertexShader")
    @js.native
    def vertexShader: String = js.native
    inline def vertexShader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vertexShader")(x.asInstanceOf[js.Any])
  }
}
