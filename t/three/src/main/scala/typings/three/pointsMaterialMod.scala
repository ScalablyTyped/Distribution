package typings.three

import typings.three.colorMod.Color
import typings.three.materialMod.Material
import typings.three.materialMod.MaterialParameters
import typings.three.textureMod.Texture
import typings.three.utilsMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointsMaterialMod {
  
  @JSImport("three/src/materials/PointsMaterial", "PointsMaterial")
  @js.native
  open class PointsMaterial () extends Material {
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
      * Whether the material is affected by fog. Default is true.
      * @default fog
      */
    var fog: Boolean = js.native
    
    /**
      * @default null
      */
    var map: Texture | Null = js.native
    
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
  
  trait PointsMaterialParameters
    extends StObject
       with MaterialParameters {
    
    var alphaMap: js.UndefOr[Texture | Null] = js.undefined
    
    var color: js.UndefOr[ColorRepresentation] = js.undefined
    
    var fog: js.UndefOr[Boolean] = js.undefined
    
    var map: js.UndefOr[Texture | Null] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var sizeAttenuation: js.UndefOr[Boolean] = js.undefined
  }
  object PointsMaterialParameters {
    
    inline def apply(): PointsMaterialParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PointsMaterialParameters]
    }
    
    extension [Self <: PointsMaterialParameters](x: Self) {
      
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
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeAttenuation(value: Boolean): Self = StObject.set(x, "sizeAttenuation", value.asInstanceOf[js.Any])
      
      inline def setSizeAttenuationUndefined: Self = StObject.set(x, "sizeAttenuation", js.undefined)
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
