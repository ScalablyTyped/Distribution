package typings.three

import typings.three.anon.Bias
import typings.three.anon.DIFFUSETEXTURE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object saoshaderMod {
  
  object SAOShader {
    
    @JSImport("three/examples/jsm/shaders/SAOShader", "SAOShader")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("three/examples/jsm/shaders/SAOShader", "SAOShader.defines")
    @js.native
    def defines: DIFFUSETEXTURE = js.native
    inline def defines_=(x: DIFFUSETEXTURE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defines")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/shaders/SAOShader", "SAOShader.fragmentShader")
    @js.native
    def fragmentShader: String = js.native
    inline def fragmentShader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fragmentShader")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/shaders/SAOShader", "SAOShader.uniforms")
    @js.native
    def uniforms: Bias = js.native
    inline def uniforms_=(x: Bias): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uniforms")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/shaders/SAOShader", "SAOShader.vertexShader")
    @js.native
    def vertexShader: String = js.native
    inline def vertexShader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vertexShader")(x.asInstanceOf[js.Any])
  }
}
