package typings.three

import typings.three.anon.CKernel
import typings.three.anon.KERNELSIZEFLOAT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object convolutionShaderMod {
  
  object ConvolutionShader {
    
    @JSImport("three/examples/jsm/shaders/ConvolutionShader", "ConvolutionShader")
    @js.native
    val ^ : js.Any = js.native
    
    inline def buildKernel(sigma: Double): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildKernel")(sigma.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
    
    @JSImport("three/examples/jsm/shaders/ConvolutionShader", "ConvolutionShader.defines")
    @js.native
    def defines: KERNELSIZEFLOAT = js.native
    inline def defines_=(x: KERNELSIZEFLOAT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defines")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/shaders/ConvolutionShader", "ConvolutionShader.fragmentShader")
    @js.native
    def fragmentShader: String = js.native
    inline def fragmentShader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fragmentShader")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/shaders/ConvolutionShader", "ConvolutionShader.uniforms")
    @js.native
    def uniforms: CKernel = js.native
    inline def uniforms_=(x: CKernel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uniforms")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/shaders/ConvolutionShader", "ConvolutionShader.vertexShader")
    @js.native
    def vertexShader: String = js.native
    inline def vertexShader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vertexShader")(x.asInstanceOf[js.Any])
  }
}
