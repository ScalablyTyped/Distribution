package typings.three

import typings.three.anon.R
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object horizontalTiltShiftShaderMod {
  
  object HorizontalTiltShiftShader {
    
    @JSImport("three/examples/jsm/shaders/HorizontalTiltShiftShader", "HorizontalTiltShiftShader")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("three/examples/jsm/shaders/HorizontalTiltShiftShader", "HorizontalTiltShiftShader.fragmentShader")
    @js.native
    def fragmentShader: String = js.native
    inline def fragmentShader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fragmentShader")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/shaders/HorizontalTiltShiftShader", "HorizontalTiltShiftShader.uniforms")
    @js.native
    def uniforms: R = js.native
    inline def uniforms_=(x: R): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uniforms")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/shaders/HorizontalTiltShiftShader", "HorizontalTiltShiftShader.vertexShader")
    @js.native
    def vertexShader: String = js.native
    inline def vertexShader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vertexShader")(x.asInstanceOf[js.Any])
  }
}
