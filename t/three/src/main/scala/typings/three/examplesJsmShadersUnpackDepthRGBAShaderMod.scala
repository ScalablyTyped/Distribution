package typings.three

import typings.three.anon.Opacity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmShadersUnpackDepthRGBAShaderMod {
  
  object UnpackDepthRGBAShader {
    
    @JSImport("three/examples/jsm/shaders/UnpackDepthRGBAShader", "UnpackDepthRGBAShader")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("three/examples/jsm/shaders/UnpackDepthRGBAShader", "UnpackDepthRGBAShader.fragmentShader")
    @js.native
    def fragmentShader: String = js.native
    inline def fragmentShader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fragmentShader")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/shaders/UnpackDepthRGBAShader", "UnpackDepthRGBAShader.uniforms")
    @js.native
    def uniforms: Opacity = js.native
    inline def uniforms_=(x: Opacity): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uniforms")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/shaders/UnpackDepthRGBAShader", "UnpackDepthRGBAShader.vertexShader")
    @js.native
    def vertexShader: String = js.native
    inline def vertexShader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vertexShader")(x.asInstanceOf[js.Any])
  }
}
