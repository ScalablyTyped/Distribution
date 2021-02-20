package typings.three

import typings.three.colorMod.Color
import typings.three.materialMod.Material
import typings.three.materialMod.MaterialParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shadowMaterialMod {
  
  @JSImport("three/src/materials/ShadowMaterial", "ShadowMaterial")
  @js.native
  class ShadowMaterial () extends Material {
    def this(parameters: ShadowMaterialParameters) = this()
    
    /**
    	 * @default new THREE.Color( 0x000000 )
    	 */
    var color: Color = js.native
  }
  
  @js.native
  trait ShadowMaterialParameters extends MaterialParameters {
    
    var color: js.UndefOr[Color | String | Double] = js.native
  }
  object ShadowMaterialParameters {
    
    @scala.inline
    def apply(): ShadowMaterialParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShadowMaterialParameters]
    }
    
    @scala.inline
    implicit class ShadowMaterialParametersMutableBuilder[Self <: ShadowMaterialParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: Color | String | Double): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    }
  }
}
