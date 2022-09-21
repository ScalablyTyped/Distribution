package typings.three

import typings.three.anon.CameraInverseProjectionMatrix
import typings.three.anon.CameraNear
import typings.three.anon.KERNELSIZE
import typings.three.anon.PERSPECTIVECAMERA
import typings.three.anon.Resolution
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ssaoshaderMod {
  
  object SSAOBlurShader {
    
    @JSImport("three/examples/jsm/shaders/SSAOShader", "SSAOBlurShader")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("three/examples/jsm/shaders/SSAOShader", "SSAOBlurShader.fragmentShader")
    @js.native
    def fragmentShader: String = js.native
    inline def fragmentShader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fragmentShader")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/shaders/SSAOShader", "SSAOBlurShader.uniforms")
    @js.native
    def uniforms: Resolution = js.native
    inline def uniforms_=(x: Resolution): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uniforms")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/shaders/SSAOShader", "SSAOBlurShader.vertexShader")
    @js.native
    def vertexShader: String = js.native
    inline def vertexShader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vertexShader")(x.asInstanceOf[js.Any])
  }
  
  object SSAODepthShader {
    
    @JSImport("three/examples/jsm/shaders/SSAOShader", "SSAODepthShader")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("three/examples/jsm/shaders/SSAOShader", "SSAODepthShader.defines")
    @js.native
    def defines: PERSPECTIVECAMERA = js.native
    inline def defines_=(x: PERSPECTIVECAMERA): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defines")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/shaders/SSAOShader", "SSAODepthShader.fragmentShader")
    @js.native
    def fragmentShader: String = js.native
    inline def fragmentShader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fragmentShader")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/shaders/SSAOShader", "SSAODepthShader.uniforms")
    @js.native
    def uniforms: CameraNear = js.native
    inline def uniforms_=(x: CameraNear): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uniforms")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/shaders/SSAOShader", "SSAODepthShader.vertexShader")
    @js.native
    def vertexShader: String = js.native
    inline def vertexShader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vertexShader")(x.asInstanceOf[js.Any])
  }
  
  object SSAOShader {
    
    @JSImport("three/examples/jsm/shaders/SSAOShader", "SSAOShader")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("three/examples/jsm/shaders/SSAOShader", "SSAOShader.defines")
    @js.native
    def defines: KERNELSIZE = js.native
    inline def defines_=(x: KERNELSIZE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defines")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/shaders/SSAOShader", "SSAOShader.fragmentShader")
    @js.native
    def fragmentShader: String = js.native
    inline def fragmentShader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fragmentShader")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/shaders/SSAOShader", "SSAOShader.uniforms")
    @js.native
    def uniforms: CameraInverseProjectionMatrix = js.native
    inline def uniforms_=(x: CameraInverseProjectionMatrix): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uniforms")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/shaders/SSAOShader", "SSAOShader.vertexShader")
    @js.native
    def vertexShader: String = js.native
    inline def vertexShader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vertexShader")(x.asInstanceOf[js.Any])
  }
}
