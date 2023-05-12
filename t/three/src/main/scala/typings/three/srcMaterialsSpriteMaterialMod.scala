package typings.three

import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcMaterialsMaterialMod.MaterialParameters
import typings.three.srcMathColorMod.Color
import typings.three.srcMathColorMod.ColorRepresentation
import typings.three.srcTexturesTextureMod.Texture
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMaterialsSpriteMaterialMod {
  
  @JSImport("three/src/materials/SpriteMaterial", "SpriteMaterial")
  @js.native
  open class SpriteMaterial () extends Material {
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
    
    /**
      * Whether the material is affected by fog. Default is true.
      * @default fog
      */
    var fog: Boolean = js.native
    
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
  
  trait SpriteMaterialParameters
    extends StObject
       with MaterialParameters {
    
    var alphaMap: js.UndefOr[Texture | Null] = js.undefined
    
    var color: js.UndefOr[ColorRepresentation] = js.undefined
    
    var fog: js.UndefOr[Boolean] = js.undefined
    
    var map: js.UndefOr[Texture | Null] = js.undefined
    
    var rotation: js.UndefOr[Double] = js.undefined
    
    var sizeAttenuation: js.UndefOr[Boolean] = js.undefined
  }
  object SpriteMaterialParameters {
    
    inline def apply(): SpriteMaterialParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpriteMaterialParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SpriteMaterialParameters] (val x: Self) extends AnyVal {
      
      inline def setAlphaMap(value: Texture): Self = StObject.set(x, "alphaMap", value.asInstanceOf[js.Any])
      
      inline def setAlphaMapNull: Self = StObject.set(x, "alphaMap", null)
      
      inline def setAlphaMapUndefined: Self = StObject.set(x, "alphaMap", js.undefined)
      
      inline def setColor(value: ColorRepresentation): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFog(value: Boolean): Self = StObject.set(x, "fog", value.asInstanceOf[js.Any])
      
      inline def setFogUndefined: Self = StObject.set(x, "fog", js.undefined)
      
      inline def setMap(value: Texture): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapNull: Self = StObject.set(x, "map", null)
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      inline def setSizeAttenuation(value: Boolean): Self = StObject.set(x, "sizeAttenuation", value.asInstanceOf[js.Any])
      
      inline def setSizeAttenuationUndefined: Self = StObject.set(x, "sizeAttenuation", js.undefined)
    }
  }
}
