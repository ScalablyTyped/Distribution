package typings.three

import typings.three.colorMod.Color
import typings.three.materialMod.Material
import typings.three.materialMod.MaterialParameters
import typings.three.textureMod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointsMaterialMod {
  
  @JSImport("three/src/materials/PointsMaterial", "PointsMaterial")
  @js.native
  class PointsMaterial () extends Material {
    def this(parameters: PointsMaterialParameters) = this()
    
    /**
    	 * @default null
    	 */
    var alphaMap: Texture | Null = js.native
    
    /**
    	 * @default new THREE.Color( 0xffffff )
    	 */
    var color: Color = js.native
    
    /**
    	 * @default null
    	 */
    var map: Texture | Null = js.native
    
    /**
    	 * @default false
    	 */
    var morphTargets: Boolean = js.native
    
    def setValues(parameters: PointsMaterialParameters): Unit = js.native
    
    /**
    	 * @default 1
    	 */
    var size: Double = js.native
    
    /**
    	 * @default true
    	 */
    var sizeAttenuation: Boolean = js.native
  }
  
  @js.native
  trait PointsMaterialParameters extends MaterialParameters {
    
    var alphaMap: js.UndefOr[Texture | Null] = js.native
    
    var color: js.UndefOr[Color | String | Double] = js.native
    
    var map: js.UndefOr[Texture | Null] = js.native
    
    var morphTargets: js.UndefOr[Boolean] = js.native
    
    var size: js.UndefOr[Double] = js.native
    
    var sizeAttenuation: js.UndefOr[Boolean] = js.native
  }
  object PointsMaterialParameters {
    
    @scala.inline
    def apply(): PointsMaterialParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PointsMaterialParameters]
    }
    
    @scala.inline
    implicit class PointsMaterialParametersMutableBuilder[Self <: PointsMaterialParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlphaMap(value: Texture): Self = StObject.set(x, "alphaMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlphaMapNull: Self = StObject.set(x, "alphaMap", null)
      
      @scala.inline
      def setAlphaMapUndefined: Self = StObject.set(x, "alphaMap", js.undefined)
      
      @scala.inline
      def setColor(value: Color | String | Double): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setMap(value: Texture): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapNull: Self = StObject.set(x, "map", null)
      
      @scala.inline
      def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      @scala.inline
      def setMorphTargets(value: Boolean): Self = StObject.set(x, "morphTargets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMorphTargetsUndefined: Self = StObject.set(x, "morphTargets", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeAttenuation(value: Boolean): Self = StObject.set(x, "sizeAttenuation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeAttenuationUndefined: Self = StObject.set(x, "sizeAttenuation", js.undefined)
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
