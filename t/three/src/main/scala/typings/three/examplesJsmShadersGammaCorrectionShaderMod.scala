package typings.three

import typings.three.anon.TDiffuseIUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmShadersGammaCorrectionShaderMod {
  
  object GammaCorrectionShader {
    
    @JSImport("three/examples/jsm/shaders/GammaCorrectionShader", "GammaCorrectionShader")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("three/examples/jsm/shaders/GammaCorrectionShader", "GammaCorrectionShader.fragmentShader")
    @js.native
    def fragmentShader: String = js.native
    inline def fragmentShader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fragmentShader")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/shaders/GammaCorrectionShader", "GammaCorrectionShader.uniforms")
    @js.native
    def uniforms: TDiffuseIUniform = js.native
    inline def uniforms_=(x: TDiffuseIUniform): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uniforms")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/shaders/GammaCorrectionShader", "GammaCorrectionShader.vertexShader")
    @js.native
    def vertexShader: String = js.native
    inline def vertexShader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vertexShader")(x.asInstanceOf[js.Any])
  }
}
