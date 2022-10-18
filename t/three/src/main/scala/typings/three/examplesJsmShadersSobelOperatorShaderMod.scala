package typings.three

import typings.three.anon.Resolution
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmShadersSobelOperatorShaderMod {
  
  object SobelOperatorShader {
    
    @JSImport("three/examples/jsm/shaders/SobelOperatorShader", "SobelOperatorShader")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("three/examples/jsm/shaders/SobelOperatorShader", "SobelOperatorShader.fragmentShader")
    @js.native
    def fragmentShader: String = js.native
    inline def fragmentShader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fragmentShader")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/shaders/SobelOperatorShader", "SobelOperatorShader.uniforms")
    @js.native
    def uniforms: Resolution = js.native
    inline def uniforms_=(x: Resolution): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uniforms")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/shaders/SobelOperatorShader", "SobelOperatorShader.vertexShader")
    @js.native
    def vertexShader: String = js.native
    inline def vertexShader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vertexShader")(x.asInstanceOf[js.Any])
  }
}
