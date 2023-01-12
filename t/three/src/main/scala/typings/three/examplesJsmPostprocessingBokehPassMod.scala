package typings.three

import typings.three.examplesJsmPostprocessingPassMod.Pass
import typings.three.srcThreeMod.Camera
import typings.three.srcThreeMod.Color
import typings.three.srcThreeMod.MeshDepthMaterial
import typings.three.srcThreeMod.Scene
import typings.three.srcThreeMod.ShaderMaterial
import typings.three.srcThreeMod.WebGLRenderTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmPostprocessingBokehPassMod {
  
  @JSImport("three/examples/jsm/postprocessing/BokehPass", "BokehPass")
  @js.native
  open class BokehPass protected () extends Pass {
    def this(scene: Scene, camera: Camera, params: BokehPassParamters) = this()
    
    var camera: Camera = js.native
    
    var fsQuad: js.Object = js.native
    
    var materialBokeh: ShaderMaterial = js.native
    
    var materialDepth: MeshDepthMaterial = js.native
    
    var oldClearColor: Color = js.native
    
    var renderTargetColor: WebGLRenderTarget = js.native
    
    var renderTargetDepth: WebGLRenderTarget = js.native
    
    var scene: Scene = js.native
    
    var uniforms: js.Object = js.native
  }
  
  trait BokehPassParamters extends StObject {
    
    var aperture: js.UndefOr[Double] = js.undefined
    
    var aspect: js.UndefOr[Double] = js.undefined
    
    var focus: js.UndefOr[Double] = js.undefined
    
    var maxblur: js.UndefOr[Double] = js.undefined
  }
  object BokehPassParamters {
    
    inline def apply(): BokehPassParamters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BokehPassParamters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BokehPassParamters] (val x: Self) extends AnyVal {
      
      inline def setAperture(value: Double): Self = StObject.set(x, "aperture", value.asInstanceOf[js.Any])
      
      inline def setApertureUndefined: Self = StObject.set(x, "aperture", js.undefined)
      
      inline def setAspect(value: Double): Self = StObject.set(x, "aspect", value.asInstanceOf[js.Any])
      
      inline def setAspectUndefined: Self = StObject.set(x, "aspect", js.undefined)
      
      inline def setFocus(value: Double): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
      
      inline def setMaxblur(value: Double): Self = StObject.set(x, "maxblur", value.asInstanceOf[js.Any])
      
      inline def setMaxblurUndefined: Self = StObject.set(x, "maxblur", js.undefined)
    }
  }
}
