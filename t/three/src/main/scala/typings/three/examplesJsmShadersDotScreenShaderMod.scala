package typings.three

import typings.three.anon.Angle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmShadersDotScreenShaderMod {
  
  object DotScreenShader {
    
    @JSImport("three/examples/jsm/shaders/DotScreenShader", "DotScreenShader")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("three/examples/jsm/shaders/DotScreenShader", "DotScreenShader.fragmentShader")
    @js.native
    def fragmentShader: String = js.native
    inline def fragmentShader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fragmentShader")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/shaders/DotScreenShader", "DotScreenShader.uniforms")
    @js.native
    def uniforms: Angle = js.native
    inline def uniforms_=(x: Angle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uniforms")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/shaders/DotScreenShader", "DotScreenShader.vertexShader")
    @js.native
    def vertexShader: String = js.native
    inline def vertexShader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vertexShader")(x.asInstanceOf[js.Any])
  }
}
