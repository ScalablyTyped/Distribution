package typings.three

import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcMaterialsMaterialMod.MaterialParameters
import typings.three.srcMathColorMod.Color
import typings.three.srcUtilsMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMaterialsLineBasicMaterialMod {
  
  @JSImport("three/src/materials/LineBasicMaterial", "LineBasicMaterial")
  @js.native
  open class LineBasicMaterial () extends Material {
    def this(parameters: LineBasicMaterialParameters) = this()
    
    /**
      * @default 0xffffff
      */
    var color: Color = js.native
    
    /**
      * Whether the material is affected by fog. Default is true.
      * @default true
      */
    var fog: Boolean = js.native
    
    /**
      * @default 'round'
      */
    var linecap: String = js.native
    
    /**
      * @default 'round'
      */
    var linejoin: String = js.native
    
    /**
      * @default 1
      */
    var linewidth: Double = js.native
    
    def setValues(parameters: LineBasicMaterialParameters): Unit = js.native
  }
  
  trait LineBasicMaterialParameters
    extends StObject
       with MaterialParameters {
    
    var color: js.UndefOr[ColorRepresentation] = js.undefined
    
    var fog: js.UndefOr[Boolean] = js.undefined
    
    var linecap: js.UndefOr[String] = js.undefined
    
    var linejoin: js.UndefOr[String] = js.undefined
    
    var linewidth: js.UndefOr[Double] = js.undefined
  }
  object LineBasicMaterialParameters {
    
    inline def apply(): LineBasicMaterialParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LineBasicMaterialParameters]
    }
    
    extension [Self <: LineBasicMaterialParameters](x: Self) {
      
      inline def setColor(value: ColorRepresentation): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFog(value: Boolean): Self = StObject.set(x, "fog", value.asInstanceOf[js.Any])
      
      inline def setFogUndefined: Self = StObject.set(x, "fog", js.undefined)
      
      inline def setLinecap(value: String): Self = StObject.set(x, "linecap", value.asInstanceOf[js.Any])
      
      inline def setLinecapUndefined: Self = StObject.set(x, "linecap", js.undefined)
      
      inline def setLinejoin(value: String): Self = StObject.set(x, "linejoin", value.asInstanceOf[js.Any])
      
      inline def setLinejoinUndefined: Self = StObject.set(x, "linejoin", js.undefined)
      
      inline def setLinewidth(value: Double): Self = StObject.set(x, "linewidth", value.asInstanceOf[js.Any])
      
      inline def setLinewidthUndefined: Self = StObject.set(x, "linewidth", js.undefined)
    }
  }
}
