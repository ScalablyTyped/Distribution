package typings.three

import typings.three.srcMaterialsMeshStandardMaterialMod.MeshStandardMaterial
import typings.three.srcMaterialsMeshStandardMaterialMod.MeshStandardMaterialParameters
import typings.three.srcMathColorMod.Color
import typings.three.srcMathVector2Mod.Vector2
import typings.three.srcTexturesTextureMod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMaterialsMeshPhysicalMaterialMod {
  
  @JSImport("three/src/materials/MeshPhysicalMaterial", "MeshPhysicalMaterial")
  @js.native
  open class MeshPhysicalMaterial () extends MeshStandardMaterial {
    def this(parameters: MeshPhysicalMaterialParameters) = this()
    
    /**
      * @default Color( 1, 1, 1 )
      */
    var attenuationColor: Color = js.native
    
    /**
      * @default 0.0
      */
    var attenuationDistance: Double = js.native
    
    /**
      * @default 0
      */
    var clearcoat: Double = js.native
    
    /**
      * @default null
      */
    var clearcoatMap: Texture | Null = js.native
    
    /**
      * @default null
      */
    var clearcoatNormalMap: Texture | Null = js.native
    
    /**
      * @default new THREE.Vector2( 1, 1 )
      */
    var clearcoatNormalScale: Vector2 = js.native
    
    /**
      * @default 0
      */
    var clearcoatRoughness: Double = js.native
    
    /**
      * @default null
      */
    var clearcoatRoughnessMap: Texture | Null = js.native
    
    /**
      * @default 1.5
      */
    var ior: Double = js.native
    
    /**
      * @default 0
      */
    var iridescence: Double = js.native
    
    /**
      * @default 1.3
      */
    var iridescenceIOR: Double = js.native
    
    /**
      * @default null
      */
    var iridescenceMap: Texture | Null = js.native
    
    /**
      * @default null
      */
    var iridescenceThicknessMap: Texture | Null = js.native
    
    /**
      * @default [100, 400]
      */
    var iridescenceThicknessRange: js.Array[Double] = js.native
    
    /**
      * @default 0.5
      */
    var reflectivity: Double = js.native
    
    /**
      * @default 0.0
      */
    var sheen: Double = js.native
    
    /**
      * @default Color( 0x000000 )
      */
    var sheenColor: Color = js.native
    
    /**
      * @default null
      */
    var sheenColorMap: Texture | Null = js.native
    
    /**
      * @default 1.0
      */
    var sheenRoughness: Double = js.native
    
    /**
      * @default null
      */
    var sheenRoughnessMap: Texture | Null = js.native
    
    /**
      * @default Color(1, 1, 1)
      */
    var specularColor: Color = js.native
    
    /**
      * @default null
      */
    var specularColorMap: Texture | Null = js.native
    
    /**
      * @default 1.0
      */
    var specularIntensity: Double = js.native
    
    /**
      * @default null
      */
    var specularIntensityMap: Texture | Null = js.native
    
    /**
      * @default 0.01
      */
    var thickness: Double = js.native
    
    /**
      * @default null
      */
    var thicknessMap: Texture | Null = js.native
    
    /**
      * @default 0
      */
    var transmission: Double = js.native
    
    /**
      * @default null
      */
    var transmissionMap: Texture | Null = js.native
  }
  
  trait MeshPhysicalMaterialParameters
    extends StObject
       with MeshStandardMaterialParameters {
    
    var attenuationColor: js.UndefOr[Color] = js.undefined
    
    var attenuationDistance: js.UndefOr[Double] = js.undefined
    
    var clearcoat: js.UndefOr[Double] = js.undefined
    
    var clearcoatMap: js.UndefOr[Texture | Null] = js.undefined
    
    var clearcoatNormalMap: js.UndefOr[Texture | Null] = js.undefined
    
    var clearcoatNormalScale: js.UndefOr[Vector2] = js.undefined
    
    var clearcoatRoughness: js.UndefOr[Double] = js.undefined
    
    var clearcoatRoughnessMap: js.UndefOr[Texture | Null] = js.undefined
    
    var ior: js.UndefOr[Double] = js.undefined
    
    var reflectivity: js.UndefOr[Double] = js.undefined
    
    var sheen: js.UndefOr[Double] = js.undefined
    
    var sheenColor: js.UndefOr[Color] = js.undefined
    
    var sheenRoughness: js.UndefOr[Double] = js.undefined
    
    var specularColor: js.UndefOr[Color] = js.undefined
    
    var specularColorMap: js.UndefOr[Texture | Null] = js.undefined
    
    var specularIntensity: js.UndefOr[Double] = js.undefined
    
    var specularIntensityMap: js.UndefOr[Texture | Null] = js.undefined
    
    var transmission: js.UndefOr[Double] = js.undefined
    
    var transmissionMap: js.UndefOr[Texture | Null] = js.undefined
  }
  object MeshPhysicalMaterialParameters {
    
    inline def apply(): MeshPhysicalMaterialParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MeshPhysicalMaterialParameters]
    }
    
    extension [Self <: MeshPhysicalMaterialParameters](x: Self) {
      
      inline def setAttenuationColor(value: Color): Self = StObject.set(x, "attenuationColor", value.asInstanceOf[js.Any])
      
      inline def setAttenuationColorUndefined: Self = StObject.set(x, "attenuationColor", js.undefined)
      
      inline def setAttenuationDistance(value: Double): Self = StObject.set(x, "attenuationDistance", value.asInstanceOf[js.Any])
      
      inline def setAttenuationDistanceUndefined: Self = StObject.set(x, "attenuationDistance", js.undefined)
      
      inline def setClearcoat(value: Double): Self = StObject.set(x, "clearcoat", value.asInstanceOf[js.Any])
      
      inline def setClearcoatMap(value: Texture): Self = StObject.set(x, "clearcoatMap", value.asInstanceOf[js.Any])
      
      inline def setClearcoatMapNull: Self = StObject.set(x, "clearcoatMap", null)
      
      inline def setClearcoatMapUndefined: Self = StObject.set(x, "clearcoatMap", js.undefined)
      
      inline def setClearcoatNormalMap(value: Texture): Self = StObject.set(x, "clearcoatNormalMap", value.asInstanceOf[js.Any])
      
      inline def setClearcoatNormalMapNull: Self = StObject.set(x, "clearcoatNormalMap", null)
      
      inline def setClearcoatNormalMapUndefined: Self = StObject.set(x, "clearcoatNormalMap", js.undefined)
      
      inline def setClearcoatNormalScale(value: Vector2): Self = StObject.set(x, "clearcoatNormalScale", value.asInstanceOf[js.Any])
      
      inline def setClearcoatNormalScaleUndefined: Self = StObject.set(x, "clearcoatNormalScale", js.undefined)
      
      inline def setClearcoatRoughness(value: Double): Self = StObject.set(x, "clearcoatRoughness", value.asInstanceOf[js.Any])
      
      inline def setClearcoatRoughnessMap(value: Texture): Self = StObject.set(x, "clearcoatRoughnessMap", value.asInstanceOf[js.Any])
      
      inline def setClearcoatRoughnessMapNull: Self = StObject.set(x, "clearcoatRoughnessMap", null)
      
      inline def setClearcoatRoughnessMapUndefined: Self = StObject.set(x, "clearcoatRoughnessMap", js.undefined)
      
      inline def setClearcoatRoughnessUndefined: Self = StObject.set(x, "clearcoatRoughness", js.undefined)
      
      inline def setClearcoatUndefined: Self = StObject.set(x, "clearcoat", js.undefined)
      
      inline def setIor(value: Double): Self = StObject.set(x, "ior", value.asInstanceOf[js.Any])
      
      inline def setIorUndefined: Self = StObject.set(x, "ior", js.undefined)
      
      inline def setReflectivity(value: Double): Self = StObject.set(x, "reflectivity", value.asInstanceOf[js.Any])
      
      inline def setReflectivityUndefined: Self = StObject.set(x, "reflectivity", js.undefined)
      
      inline def setSheen(value: Double): Self = StObject.set(x, "sheen", value.asInstanceOf[js.Any])
      
      inline def setSheenColor(value: Color): Self = StObject.set(x, "sheenColor", value.asInstanceOf[js.Any])
      
      inline def setSheenColorUndefined: Self = StObject.set(x, "sheenColor", js.undefined)
      
      inline def setSheenRoughness(value: Double): Self = StObject.set(x, "sheenRoughness", value.asInstanceOf[js.Any])
      
      inline def setSheenRoughnessUndefined: Self = StObject.set(x, "sheenRoughness", js.undefined)
      
      inline def setSheenUndefined: Self = StObject.set(x, "sheen", js.undefined)
      
      inline def setSpecularColor(value: Color): Self = StObject.set(x, "specularColor", value.asInstanceOf[js.Any])
      
      inline def setSpecularColorMap(value: Texture): Self = StObject.set(x, "specularColorMap", value.asInstanceOf[js.Any])
      
      inline def setSpecularColorMapNull: Self = StObject.set(x, "specularColorMap", null)
      
      inline def setSpecularColorMapUndefined: Self = StObject.set(x, "specularColorMap", js.undefined)
      
      inline def setSpecularColorUndefined: Self = StObject.set(x, "specularColor", js.undefined)
      
      inline def setSpecularIntensity(value: Double): Self = StObject.set(x, "specularIntensity", value.asInstanceOf[js.Any])
      
      inline def setSpecularIntensityMap(value: Texture): Self = StObject.set(x, "specularIntensityMap", value.asInstanceOf[js.Any])
      
      inline def setSpecularIntensityMapNull: Self = StObject.set(x, "specularIntensityMap", null)
      
      inline def setSpecularIntensityMapUndefined: Self = StObject.set(x, "specularIntensityMap", js.undefined)
      
      inline def setSpecularIntensityUndefined: Self = StObject.set(x, "specularIntensity", js.undefined)
      
      inline def setTransmission(value: Double): Self = StObject.set(x, "transmission", value.asInstanceOf[js.Any])
      
      inline def setTransmissionMap(value: Texture): Self = StObject.set(x, "transmissionMap", value.asInstanceOf[js.Any])
      
      inline def setTransmissionMapNull: Self = StObject.set(x, "transmissionMap", null)
      
      inline def setTransmissionMapUndefined: Self = StObject.set(x, "transmissionMap", js.undefined)
      
      inline def setTransmissionUndefined: Self = StObject.set(x, "transmission", js.undefined)
    }
  }
}
