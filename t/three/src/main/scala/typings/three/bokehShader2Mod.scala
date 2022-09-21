package typings.three

import typings.three.anon.MFar
import typings.three.uniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bokehShader2Mod {
  
  object BokehDepthShader {
    
    @JSImport("three/examples/jsm/shaders/BokehShader2", "BokehDepthShader")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("three/examples/jsm/shaders/BokehShader2", "BokehDepthShader.fragmentShader")
    @js.native
    def fragmentShader: String = js.native
    inline def fragmentShader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fragmentShader")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/shaders/BokehShader2", "BokehDepthShader.uniforms")
    @js.native
    def uniforms: MFar = js.native
    inline def uniforms_=(x: MFar): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uniforms")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/shaders/BokehShader2", "BokehDepthShader.vertexShader")
    @js.native
    def vertexShader: String = js.native
    inline def vertexShader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vertexShader")(x.asInstanceOf[js.Any])
  }
  
  object BokehShader {
    
    @JSImport("three/examples/jsm/shaders/BokehShader2", "BokehShader")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("three/examples/jsm/shaders/BokehShader2", "BokehShader.fragmentShader")
    @js.native
    def fragmentShader: String = js.native
    inline def fragmentShader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fragmentShader")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/shaders/BokehShader2", "BokehShader.uniforms")
    @js.native
    def uniforms: BokehShaderUniforms = js.native
    inline def uniforms_=(x: BokehShaderUniforms): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uniforms")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/shaders/BokehShader2", "BokehShader.vertexShader")
    @js.native
    def vertexShader: String = js.native
    inline def vertexShader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vertexShader")(x.asInstanceOf[js.Any])
  }
  
  trait BokehShaderUniforms extends StObject {
    
    var bias: IUniform[Any]
    
    var depthblur: IUniform[Any]
    
    var dithering: IUniform[Any]
    
    var focalDepth: IUniform[Any]
    
    var focalLength: IUniform[Any]
    
    var focusCoords: IUniform[Any]
    
    var fringe: IUniform[Any]
    
    var fstop: IUniform[Any]
    
    var gain: IUniform[Any]
    
    var manualdof: IUniform[Any]
    
    var maxblur: IUniform[Any]
    
    var noise: IUniform[Any]
    
    var pentagon: IUniform[Any]
    
    var shaderFocus: IUniform[Any]
    
    var showFocus: IUniform[Any]
    
    var tColor: IUniform[Any]
    
    var tDepth: IUniform[Any]
    
    var textureHeight: IUniform[Any]
    
    var textureWidth: IUniform[Any]
    
    var threshold: IUniform[Any]
    
    var vignetting: IUniform[Any]
    
    var zfar: IUniform[Any]
    
    var znear: IUniform[Any]
  }
  object BokehShaderUniforms {
    
    inline def apply(
      bias: IUniform[Any],
      depthblur: IUniform[Any],
      dithering: IUniform[Any],
      focalDepth: IUniform[Any],
      focalLength: IUniform[Any],
      focusCoords: IUniform[Any],
      fringe: IUniform[Any],
      fstop: IUniform[Any],
      gain: IUniform[Any],
      manualdof: IUniform[Any],
      maxblur: IUniform[Any],
      noise: IUniform[Any],
      pentagon: IUniform[Any],
      shaderFocus: IUniform[Any],
      showFocus: IUniform[Any],
      tColor: IUniform[Any],
      tDepth: IUniform[Any],
      textureHeight: IUniform[Any],
      textureWidth: IUniform[Any],
      threshold: IUniform[Any],
      vignetting: IUniform[Any],
      zfar: IUniform[Any],
      znear: IUniform[Any]
    ): BokehShaderUniforms = {
      val __obj = js.Dynamic.literal(bias = bias.asInstanceOf[js.Any], depthblur = depthblur.asInstanceOf[js.Any], dithering = dithering.asInstanceOf[js.Any], focalDepth = focalDepth.asInstanceOf[js.Any], focalLength = focalLength.asInstanceOf[js.Any], focusCoords = focusCoords.asInstanceOf[js.Any], fringe = fringe.asInstanceOf[js.Any], fstop = fstop.asInstanceOf[js.Any], gain = gain.asInstanceOf[js.Any], manualdof = manualdof.asInstanceOf[js.Any], maxblur = maxblur.asInstanceOf[js.Any], noise = noise.asInstanceOf[js.Any], pentagon = pentagon.asInstanceOf[js.Any], shaderFocus = shaderFocus.asInstanceOf[js.Any], showFocus = showFocus.asInstanceOf[js.Any], tColor = tColor.asInstanceOf[js.Any], tDepth = tDepth.asInstanceOf[js.Any], textureHeight = textureHeight.asInstanceOf[js.Any], textureWidth = textureWidth.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any], vignetting = vignetting.asInstanceOf[js.Any], zfar = zfar.asInstanceOf[js.Any], znear = znear.asInstanceOf[js.Any])
      __obj.asInstanceOf[BokehShaderUniforms]
    }
    
    extension [Self <: BokehShaderUniforms](x: Self) {
      
      inline def setBias(value: IUniform[Any]): Self = StObject.set(x, "bias", value.asInstanceOf[js.Any])
      
      inline def setDepthblur(value: IUniform[Any]): Self = StObject.set(x, "depthblur", value.asInstanceOf[js.Any])
      
      inline def setDithering(value: IUniform[Any]): Self = StObject.set(x, "dithering", value.asInstanceOf[js.Any])
      
      inline def setFocalDepth(value: IUniform[Any]): Self = StObject.set(x, "focalDepth", value.asInstanceOf[js.Any])
      
      inline def setFocalLength(value: IUniform[Any]): Self = StObject.set(x, "focalLength", value.asInstanceOf[js.Any])
      
      inline def setFocusCoords(value: IUniform[Any]): Self = StObject.set(x, "focusCoords", value.asInstanceOf[js.Any])
      
      inline def setFringe(value: IUniform[Any]): Self = StObject.set(x, "fringe", value.asInstanceOf[js.Any])
      
      inline def setFstop(value: IUniform[Any]): Self = StObject.set(x, "fstop", value.asInstanceOf[js.Any])
      
      inline def setGain(value: IUniform[Any]): Self = StObject.set(x, "gain", value.asInstanceOf[js.Any])
      
      inline def setManualdof(value: IUniform[Any]): Self = StObject.set(x, "manualdof", value.asInstanceOf[js.Any])
      
      inline def setMaxblur(value: IUniform[Any]): Self = StObject.set(x, "maxblur", value.asInstanceOf[js.Any])
      
      inline def setNoise(value: IUniform[Any]): Self = StObject.set(x, "noise", value.asInstanceOf[js.Any])
      
      inline def setPentagon(value: IUniform[Any]): Self = StObject.set(x, "pentagon", value.asInstanceOf[js.Any])
      
      inline def setShaderFocus(value: IUniform[Any]): Self = StObject.set(x, "shaderFocus", value.asInstanceOf[js.Any])
      
      inline def setShowFocus(value: IUniform[Any]): Self = StObject.set(x, "showFocus", value.asInstanceOf[js.Any])
      
      inline def setTColor(value: IUniform[Any]): Self = StObject.set(x, "tColor", value.asInstanceOf[js.Any])
      
      inline def setTDepth(value: IUniform[Any]): Self = StObject.set(x, "tDepth", value.asInstanceOf[js.Any])
      
      inline def setTextureHeight(value: IUniform[Any]): Self = StObject.set(x, "textureHeight", value.asInstanceOf[js.Any])
      
      inline def setTextureWidth(value: IUniform[Any]): Self = StObject.set(x, "textureWidth", value.asInstanceOf[js.Any])
      
      inline def setThreshold(value: IUniform[Any]): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setVignetting(value: IUniform[Any]): Self = StObject.set(x, "vignetting", value.asInstanceOf[js.Any])
      
      inline def setZfar(value: IUniform[Any]): Self = StObject.set(x, "zfar", value.asInstanceOf[js.Any])
      
      inline def setZnear(value: IUniform[Any]): Self = StObject.set(x, "znear", value.asInstanceOf[js.Any])
    }
  }
}
