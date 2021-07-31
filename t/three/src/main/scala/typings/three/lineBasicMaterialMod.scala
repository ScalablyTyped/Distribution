package typings.three

import typings.three.colorMod.Color
import typings.three.materialMod.Material
import typings.three.materialMod.MaterialParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lineBasicMaterialMod {
  
  @JSImport("three/src/materials/LineBasicMaterial", "LineBasicMaterial")
  @js.native
  class LineBasicMaterial () extends Material {
    def this(parameters: LineBasicMaterialParameters) = this()
    
    /**
    	 * @default 0xffffff
    	 */
    var color: Color = js.native
    
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
    
    /**
    	 * @default false
    	 */
    var morphTargets: Boolean = js.native
    
    def setValues(parameters: LineBasicMaterialParameters): Unit = js.native
  }
  
  trait LineBasicMaterialParameters
    extends StObject
       with MaterialParameters {
    
    var color: js.UndefOr[Color | String | Double] = js.undefined
    
    var linecap: js.UndefOr[String] = js.undefined
    
    var linejoin: js.UndefOr[String] = js.undefined
    
    var linewidth: js.UndefOr[Double] = js.undefined
    
    var morphTargets: js.UndefOr[Boolean] = js.undefined
  }
  object LineBasicMaterialParameters {
    
    @scala.inline
    def apply(): LineBasicMaterialParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LineBasicMaterialParameters]
    }
    
    @scala.inline
    implicit class LineBasicMaterialParametersMutableBuilder[Self <: LineBasicMaterialParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: Color | String | Double): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setLinecap(value: String): Self = StObject.set(x, "linecap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinecapUndefined: Self = StObject.set(x, "linecap", js.undefined)
      
      @scala.inline
      def setLinejoin(value: String): Self = StObject.set(x, "linejoin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinejoinUndefined: Self = StObject.set(x, "linejoin", js.undefined)
      
      @scala.inline
      def setLinewidth(value: Double): Self = StObject.set(x, "linewidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinewidthUndefined: Self = StObject.set(x, "linewidth", js.undefined)
      
      @scala.inline
      def setMorphTargets(value: Boolean): Self = StObject.set(x, "morphTargets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMorphTargetsUndefined: Self = StObject.set(x, "morphTargets", js.undefined)
    }
  }
}
