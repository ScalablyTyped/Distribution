package typings.three

import typings.three.anon.CameraFar
import typings.three.anon.KERNELRADIUS
import typings.three.srcThreeMod.Material
import typings.three.srcThreeMod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmShadersDepthLimitedBlurShaderMod {
  
  object BlurShaderUtils {
    
    @JSImport("three/examples/jsm/shaders/DepthLimitedBlurShader", "BlurShaderUtils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def configure(configure: Material, kernelRadius: Double, stdDev: Double, uvIncrement: Vector2): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("configure")(configure.asInstanceOf[js.Any], kernelRadius.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], uvIncrement.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def createSampleOffsets(kernelRadius: Double, uvIncrement: Vector2): js.Array[Vector2] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSampleOffsets")(kernelRadius.asInstanceOf[js.Any], uvIncrement.asInstanceOf[js.Any])).asInstanceOf[js.Array[Vector2]]
    
    inline def createSampleWeights(kernelRadius: Double, stdDev: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSampleWeights")(kernelRadius.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  }
  
  object DepthLimitedBlurShader {
    
    @JSImport("three/examples/jsm/shaders/DepthLimitedBlurShader", "DepthLimitedBlurShader")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("three/examples/jsm/shaders/DepthLimitedBlurShader", "DepthLimitedBlurShader.defines")
    @js.native
    def defines: KERNELRADIUS = js.native
    inline def defines_=(x: KERNELRADIUS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defines")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/shaders/DepthLimitedBlurShader", "DepthLimitedBlurShader.fragmentShader")
    @js.native
    def fragmentShader: String = js.native
    inline def fragmentShader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fragmentShader")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/shaders/DepthLimitedBlurShader", "DepthLimitedBlurShader.uniforms")
    @js.native
    def uniforms: CameraFar = js.native
    inline def uniforms_=(x: CameraFar): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uniforms")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/shaders/DepthLimitedBlurShader", "DepthLimitedBlurShader.vertexShader")
    @js.native
    def vertexShader: String = js.native
    inline def vertexShader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vertexShader")(x.asInstanceOf[js.Any])
  }
}
