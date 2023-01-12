package typings.three

import typings.three.srcMaterialsLineBasicMaterialMod.LineBasicMaterial
import typings.three.srcMaterialsLineBasicMaterialMod.LineBasicMaterialParameters
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMaterialsLineDashedMaterialMod {
  
  @JSImport("three/src/materials/LineDashedMaterial", "LineDashedMaterial")
  @js.native
  open class LineDashedMaterial () extends LineBasicMaterial {
    def this(parameters: LineDashedMaterialParameters) = this()
    
    /**
      * @default 1
      */
    var dashSize: Double = js.native
    
    /**
      * @default 1
      */
    var gapSize: Double = js.native
    
    val isLineDashedMaterial: `true` = js.native
    
    /**
      * @default 1
      */
    var scale: Double = js.native
    
    def setValues(parameters: LineDashedMaterialParameters): Unit = js.native
  }
  
  trait LineDashedMaterialParameters
    extends StObject
       with LineBasicMaterialParameters {
    
    var dashSize: js.UndefOr[Double] = js.undefined
    
    var gapSize: js.UndefOr[Double] = js.undefined
    
    var scale: js.UndefOr[Double] = js.undefined
  }
  object LineDashedMaterialParameters {
    
    inline def apply(): LineDashedMaterialParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LineDashedMaterialParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LineDashedMaterialParameters] (val x: Self) extends AnyVal {
      
      inline def setDashSize(value: Double): Self = StObject.set(x, "dashSize", value.asInstanceOf[js.Any])
      
      inline def setDashSizeUndefined: Self = StObject.set(x, "dashSize", js.undefined)
      
      inline def setGapSize(value: Double): Self = StObject.set(x, "gapSize", value.asInstanceOf[js.Any])
      
      inline def setGapSizeUndefined: Self = StObject.set(x, "gapSize", js.undefined)
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    }
  }
}
