package typings.three

import typings.three.anon.RTDiffuse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object verticalTiltShiftShaderMod {
  
  object VerticalTiltShiftShader {
    
    @JSImport("three/examples/jsm/shaders/VerticalTiltShiftShader", "VerticalTiltShiftShader")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("three/examples/jsm/shaders/VerticalTiltShiftShader", "VerticalTiltShiftShader.fragmentShader")
    @js.native
    def fragmentShader: String = js.native
    inline def fragmentShader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fragmentShader")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/shaders/VerticalTiltShiftShader", "VerticalTiltShiftShader.uniforms")
    @js.native
    def uniforms: RTDiffuse = js.native
    inline def uniforms_=(x: RTDiffuse): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uniforms")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/shaders/VerticalTiltShiftShader", "VerticalTiltShiftShader.vertexShader")
    @js.native
    def vertexShader: String = js.native
    inline def vertexShader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vertexShader")(x.asInstanceOf[js.Any])
  }
}
