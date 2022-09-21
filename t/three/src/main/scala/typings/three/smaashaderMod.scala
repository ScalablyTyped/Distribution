package typings.three

import typings.three.anon.Resolution
import typings.three.anon.SMAAAREATEXMAXDISTANCE
import typings.three.anon.SMAATHRESHOLD
import typings.three.anon.TArea
import typings.three.anon.TColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object smaashaderMod {
  
  object SMAABlendShader {
    
    @JSImport("three/examples/jsm/shaders/SMAAShader", "SMAABlendShader")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("three/examples/jsm/shaders/SMAAShader", "SMAABlendShader.fragmentShader")
    @js.native
    def fragmentShader: String = js.native
    inline def fragmentShader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fragmentShader")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/shaders/SMAAShader", "SMAABlendShader.uniforms")
    @js.native
    def uniforms: TColor = js.native
    inline def uniforms_=(x: TColor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uniforms")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/shaders/SMAAShader", "SMAABlendShader.vertexShader")
    @js.native
    def vertexShader: String = js.native
    inline def vertexShader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vertexShader")(x.asInstanceOf[js.Any])
  }
  
  object SMAAEdgesShader {
    
    @JSImport("three/examples/jsm/shaders/SMAAShader", "SMAAEdgesShader")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("three/examples/jsm/shaders/SMAAShader", "SMAAEdgesShader.defines")
    @js.native
    def defines: SMAATHRESHOLD = js.native
    inline def defines_=(x: SMAATHRESHOLD): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defines")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/shaders/SMAAShader", "SMAAEdgesShader.fragmentShader")
    @js.native
    def fragmentShader: String = js.native
    inline def fragmentShader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fragmentShader")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/shaders/SMAAShader", "SMAAEdgesShader.uniforms")
    @js.native
    def uniforms: Resolution = js.native
    inline def uniforms_=(x: Resolution): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uniforms")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/shaders/SMAAShader", "SMAAEdgesShader.vertexShader")
    @js.native
    def vertexShader: String = js.native
    inline def vertexShader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vertexShader")(x.asInstanceOf[js.Any])
  }
  
  object SMAAWeightsShader {
    
    @JSImport("three/examples/jsm/shaders/SMAAShader", "SMAAWeightsShader")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("three/examples/jsm/shaders/SMAAShader", "SMAAWeightsShader.defines")
    @js.native
    def defines: SMAAAREATEXMAXDISTANCE = js.native
    inline def defines_=(x: SMAAAREATEXMAXDISTANCE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defines")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/shaders/SMAAShader", "SMAAWeightsShader.fragmentShader")
    @js.native
    def fragmentShader: String = js.native
    inline def fragmentShader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fragmentShader")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/shaders/SMAAShader", "SMAAWeightsShader.uniforms")
    @js.native
    def uniforms: TArea = js.native
    inline def uniforms_=(x: TArea): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uniforms")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/shaders/SMAAShader", "SMAAWeightsShader.vertexShader")
    @js.native
    def vertexShader: String = js.native
    inline def vertexShader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vertexShader")(x.asInstanceOf[js.Any])
  }
}
