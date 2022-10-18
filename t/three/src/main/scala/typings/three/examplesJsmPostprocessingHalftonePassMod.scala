package typings.three

import typings.three.examplesJsmPostprocessingPassMod.Pass
import typings.three.srcThreeMod.ShaderMaterial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmPostprocessingHalftonePassMod {
  
  @JSImport("three/examples/jsm/postprocessing/HalftonePass", "HalftonePass")
  @js.native
  open class HalftonePass protected () extends Pass {
    def this(width: Double, height: Double, params: HalftonePassParameters) = this()
    
    var fsQuad: js.Object = js.native
    
    var material: ShaderMaterial = js.native
    
    var uniforms: js.Object = js.native
  }
  
  trait HalftonePassParameters extends StObject {
    
    var blending: js.UndefOr[Double] = js.undefined
    
    var blendingMode: js.UndefOr[Double] = js.undefined
    
    var disable: js.UndefOr[Boolean] = js.undefined
    
    var greyscale: js.UndefOr[Boolean] = js.undefined
    
    var radius: js.UndefOr[Double] = js.undefined
    
    var rotateB: js.UndefOr[Double] = js.undefined
    
    var rotateG: js.UndefOr[Double] = js.undefined
    
    var rotateR: js.UndefOr[Double] = js.undefined
    
    var scatter: js.UndefOr[Double] = js.undefined
    
    var shape: js.UndefOr[Double] = js.undefined
  }
  object HalftonePassParameters {
    
    inline def apply(): HalftonePassParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HalftonePassParameters]
    }
    
    extension [Self <: HalftonePassParameters](x: Self) {
      
      inline def setBlending(value: Double): Self = StObject.set(x, "blending", value.asInstanceOf[js.Any])
      
      inline def setBlendingMode(value: Double): Self = StObject.set(x, "blendingMode", value.asInstanceOf[js.Any])
      
      inline def setBlendingModeUndefined: Self = StObject.set(x, "blendingMode", js.undefined)
      
      inline def setBlendingUndefined: Self = StObject.set(x, "blending", js.undefined)
      
      inline def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
      
      inline def setGreyscale(value: Boolean): Self = StObject.set(x, "greyscale", value.asInstanceOf[js.Any])
      
      inline def setGreyscaleUndefined: Self = StObject.set(x, "greyscale", js.undefined)
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      inline def setRotateB(value: Double): Self = StObject.set(x, "rotateB", value.asInstanceOf[js.Any])
      
      inline def setRotateBUndefined: Self = StObject.set(x, "rotateB", js.undefined)
      
      inline def setRotateG(value: Double): Self = StObject.set(x, "rotateG", value.asInstanceOf[js.Any])
      
      inline def setRotateGUndefined: Self = StObject.set(x, "rotateG", js.undefined)
      
      inline def setRotateR(value: Double): Self = StObject.set(x, "rotateR", value.asInstanceOf[js.Any])
      
      inline def setRotateRUndefined: Self = StObject.set(x, "rotateR", js.undefined)
      
      inline def setScatter(value: Double): Self = StObject.set(x, "scatter", value.asInstanceOf[js.Any])
      
      inline def setScatterUndefined: Self = StObject.set(x, "scatter", js.undefined)
      
      inline def setShape(value: Double): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    }
  }
}
