package typings.three

import typings.three.anon.Sides
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmShadersKaleidoShaderMod {
  
  object KaleidoShader {
    
    @JSImport("three/examples/jsm/shaders/KaleidoShader", "KaleidoShader")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("three/examples/jsm/shaders/KaleidoShader", "KaleidoShader.fragmentShader")
    @js.native
    def fragmentShader: String = js.native
    inline def fragmentShader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fragmentShader")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/shaders/KaleidoShader", "KaleidoShader.uniforms")
    @js.native
    def uniforms: Sides = js.native
    inline def uniforms_=(x: Sides): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uniforms")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/shaders/KaleidoShader", "KaleidoShader.vertexShader")
    @js.native
    def vertexShader: String = js.native
    inline def vertexShader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vertexShader")(x.asInstanceOf[js.Any])
  }
}
