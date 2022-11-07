package typings.three

import typings.three.anon.AlphaMap
import typings.three.anon.CurrentProjectionViewMatrix
import typings.three.anon.DisplacementBias
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmShadersVelocityShaderMod {
  
  object VelocityShader {
    
    @JSImport("three/examples/jsm/shaders/VelocityShader", "VelocityShader")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("three/examples/jsm/shaders/VelocityShader", "VelocityShader.fragmentShader")
    @js.native
    def fragmentShader: String = js.native
    inline def fragmentShader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fragmentShader")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/shaders/VelocityShader", "VelocityShader.uniforms")
    @js.native
    def uniforms: AlphaMap & DisplacementBias & CurrentProjectionViewMatrix = js.native
    inline def uniforms_=(x: AlphaMap & DisplacementBias & CurrentProjectionViewMatrix): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uniforms")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/shaders/VelocityShader", "VelocityShader.vertexShader")
    @js.native
    def vertexShader: String = js.native
    inline def vertexShader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vertexShader")(x.asInstanceOf[js.Any])
  }
}
