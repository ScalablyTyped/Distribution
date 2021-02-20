package typings.three

import typings.three.colorMod.Color
import typings.three.materialMod.Material
import typings.three.materialMod.MaterialParameters
import typings.three.textureMod.Texture
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spriteMaterialMod {
  
  @JSImport("three/src/materials/SpriteMaterial", "SpriteMaterial")
  @js.native
  class SpriteMaterial () extends Material {
    def this(parameters: SpriteMaterialParameters) = this()
    
    /**
    	 * @default null
    	 */
    var alphaMap: Texture | Null = js.native
    
    /**
    	 * @default new THREE.Color( 0xffffff )
    	 */
    var color: Color = js.native
    
    def copy(source: SpriteMaterial): this.type = js.native
    
    val isSpriteMaterial: `true` = js.native
    
    /**
    	 * @default null
    	 */
    var map: Texture | Null = js.native
    
    /**
    	 * @default 0
    	 */
    var rotation: Double = js.native
    
    def setValues(parameters: SpriteMaterialParameters): Unit = js.native
    
    /**
    	 * @default true
    	 */
    var sizeAttenuation: Boolean = js.native
  }
  
  @js.native
  trait SpriteMaterialParameters extends MaterialParameters {
    
    var alphaMap: js.UndefOr[Texture | Null] = js.native
    
    var color: js.UndefOr[Color | String | Double] = js.native
    
    var map: js.UndefOr[Texture | Null] = js.native
    
    var rotation: js.UndefOr[Double] = js.native
    
    var sizeAttenuation: js.UndefOr[Boolean] = js.native
  }
  object SpriteMaterialParameters {
    
    @scala.inline
    def apply(): SpriteMaterialParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpriteMaterialParameters]
    }
    
    @scala.inline
    implicit class SpriteMaterialParametersMutableBuilder[Self <: SpriteMaterialParameters] (val x: Self) extends AnyVal {
      
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
      def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      @scala.inline
      def setSizeAttenuation(value: Boolean): Self = StObject.set(x, "sizeAttenuation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeAttenuationUndefined: Self = StObject.set(x, "sizeAttenuation", js.undefined)
    }
  }
}
