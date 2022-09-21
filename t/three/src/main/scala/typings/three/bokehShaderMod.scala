package typings.three

import typings.three.anon.Aperture
import typings.three.anon.DEPTHPACKING
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bokehShaderMod {
  
  object BokehShader {
    
    @JSImport("three/examples/jsm/shaders/BokehShader", "BokehShader")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("three/examples/jsm/shaders/BokehShader", "BokehShader.defines")
    @js.native
    def defines: DEPTHPACKING = js.native
    inline def defines_=(x: DEPTHPACKING): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defines")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/shaders/BokehShader", "BokehShader.fragmentShader")
    @js.native
    def fragmentShader: String = js.native
    inline def fragmentShader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fragmentShader")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/shaders/BokehShader", "BokehShader.uniforms")
    @js.native
    def uniforms: Aperture = js.native
    inline def uniforms_=(x: Aperture): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uniforms")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/shaders/BokehShader", "BokehShader.vertexShader")
    @js.native
    def vertexShader: String = js.native
    inline def vertexShader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vertexShader")(x.asInstanceOf[js.Any])
  }
}
