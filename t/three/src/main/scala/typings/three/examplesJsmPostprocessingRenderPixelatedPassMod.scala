package typings.three

import typings.three.examplesJsmPostprocessingPassMod.FullScreenQuad
import typings.three.examplesJsmPostprocessingPassMod.Pass
import typings.three.srcThreeMod.Camera
import typings.three.srcThreeMod.MeshNormalMaterial
import typings.three.srcThreeMod.Scene
import typings.three.srcThreeMod.ShaderMaterial
import typings.three.srcThreeMod.Vector2
import typings.three.srcThreeMod.WebGLRenderTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmPostprocessingRenderPixelatedPassMod {
  
  @JSImport("three/examples/jsm/postprocessing/RenderPixelatedPass", "RenderPixelatedPass")
  @js.native
  open class RenderPixelatedPass protected () extends Pass {
    def this(pixelSize: Double, scene: Scene, camera: Camera) = this()
    def this(pixelSize: Double, scene: Scene, camera: Camera, options: RenderPixelatedPassParameters) = this()
    
    var beautyRenderTarget: WebGLRenderTarget = js.native
    
    var camera: Camera = js.native
    
    var depthEdgeStrength: js.UndefOr[Double] = js.native
    
    var fsQuad: FullScreenQuad = js.native
    
    var normalEdgeStrength: js.UndefOr[Double] = js.native
    
    var normalMaterial: MeshNormalMaterial = js.native
    
    var normalRenderTarget: WebGLRenderTarget = js.native
    
    var pixelSize: Double = js.native
    
    var pixelatedMaterial: ShaderMaterial = js.native
    
    var renderResolution: Vector2 = js.native
    
    var resolution: Vector2 = js.native
    
    var scene: Scene = js.native
  }
  
  trait RenderPixelatedPassParameters extends StObject {
    
    var depthEdgeStrength: js.UndefOr[Double] = js.undefined
    
    var normalEdgeStrength: js.UndefOr[Double] = js.undefined
  }
  object RenderPixelatedPassParameters {
    
    inline def apply(): RenderPixelatedPassParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderPixelatedPassParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RenderPixelatedPassParameters] (val x: Self) extends AnyVal {
      
      inline def setDepthEdgeStrength(value: Double): Self = StObject.set(x, "depthEdgeStrength", value.asInstanceOf[js.Any])
      
      inline def setDepthEdgeStrengthUndefined: Self = StObject.set(x, "depthEdgeStrength", js.undefined)
      
      inline def setNormalEdgeStrength(value: Double): Self = StObject.set(x, "normalEdgeStrength", value.asInstanceOf[js.Any])
      
      inline def setNormalEdgeStrengthUndefined: Self = StObject.set(x, "normalEdgeStrength", js.undefined)
    }
  }
}
