package typings.three

import typings.three.srcMaterialsMaterialMod.MaterialParameters
import typings.three.srcThreeMod.Color
import typings.three.srcThreeMod.ShaderMaterial
import typings.three.srcThreeMod.Vector2
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmLinesLineMaterialMod {
  
  @JSImport("three/examples/jsm/lines/LineMaterial", "LineMaterial")
  @js.native
  open class LineMaterial () extends ShaderMaterial {
    def this(parameters: LineMaterialParameters) = this()
    
    var color: Color = js.native
    
    var dashOffset: Double = js.native
    
    var dashScale: Double = js.native
    
    var dashSize: Double = js.native
    
    var dashed: Boolean = js.native
    
    var gapSize: Double = js.native
    
    val isLineMaterial: `true` = js.native
    
    var resolution: Vector2 = js.native
    
    var worldUnits: Boolean = js.native
  }
  
  trait LineMaterialParameters
    extends StObject
       with MaterialParameters {
    
    var color: js.UndefOr[Double] = js.undefined
    
    var dashOffset: js.UndefOr[Double] = js.undefined
    
    var dashScale: js.UndefOr[Double] = js.undefined
    
    var dashSize: js.UndefOr[Double] = js.undefined
    
    var dashed: js.UndefOr[Boolean] = js.undefined
    
    var gapSize: js.UndefOr[Double] = js.undefined
    
    var linewidth: js.UndefOr[Double] = js.undefined
    
    var resolution: js.UndefOr[Vector2] = js.undefined
    
    var wireframe: js.UndefOr[Boolean] = js.undefined
    
    var worldUnits: js.UndefOr[Boolean] = js.undefined
  }
  object LineMaterialParameters {
    
    inline def apply(): LineMaterialParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LineMaterialParameters]
    }
    
    extension [Self <: LineMaterialParameters](x: Self) {
      
      inline def setColor(value: Double): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDashOffset(value: Double): Self = StObject.set(x, "dashOffset", value.asInstanceOf[js.Any])
      
      inline def setDashOffsetUndefined: Self = StObject.set(x, "dashOffset", js.undefined)
      
      inline def setDashScale(value: Double): Self = StObject.set(x, "dashScale", value.asInstanceOf[js.Any])
      
      inline def setDashScaleUndefined: Self = StObject.set(x, "dashScale", js.undefined)
      
      inline def setDashSize(value: Double): Self = StObject.set(x, "dashSize", value.asInstanceOf[js.Any])
      
      inline def setDashSizeUndefined: Self = StObject.set(x, "dashSize", js.undefined)
      
      inline def setDashed(value: Boolean): Self = StObject.set(x, "dashed", value.asInstanceOf[js.Any])
      
      inline def setDashedUndefined: Self = StObject.set(x, "dashed", js.undefined)
      
      inline def setGapSize(value: Double): Self = StObject.set(x, "gapSize", value.asInstanceOf[js.Any])
      
      inline def setGapSizeUndefined: Self = StObject.set(x, "gapSize", js.undefined)
      
      inline def setLinewidth(value: Double): Self = StObject.set(x, "linewidth", value.asInstanceOf[js.Any])
      
      inline def setLinewidthUndefined: Self = StObject.set(x, "linewidth", js.undefined)
      
      inline def setResolution(value: Vector2): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
      
      inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
      
      inline def setWireframe(value: Boolean): Self = StObject.set(x, "wireframe", value.asInstanceOf[js.Any])
      
      inline def setWireframeUndefined: Self = StObject.set(x, "wireframe", js.undefined)
      
      inline def setWorldUnits(value: Boolean): Self = StObject.set(x, "worldUnits", value.asInstanceOf[js.Any])
      
      inline def setWorldUnitsUndefined: Self = StObject.set(x, "worldUnits", js.undefined)
    }
  }
}
