package typings.three

import typings.three.colorMod.Color
import typings.three.meshStandardMaterialMod.MeshStandardMaterial
import typings.three.meshStandardMaterialMod.MeshStandardMaterialParameters
import typings.three.textureMod.Texture
import typings.three.vector2Mod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meshPhysicalMaterialMod {
  
  @JSImport("three/src/materials/MeshPhysicalMaterial", "MeshPhysicalMaterial")
  @js.native
  class MeshPhysicalMaterial protected () extends MeshStandardMaterial {
    def this(parameters: MeshPhysicalMaterialParameters) = this()
    
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
    	 * @default 0.5
    	 */
    var reflectivity: Double = js.native
    
    /**
    	 * @default null
    	 */
    var sheen: Color | Null = js.native
    
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
    
    var clearcoat: js.UndefOr[Double] = js.undefined
    
    var clearcoatMap: js.UndefOr[Texture | Null] = js.undefined
    
    var clearcoatNormalMap: js.UndefOr[Texture | Null] = js.undefined
    
    var clearcoatNormalScale: js.UndefOr[Vector2] = js.undefined
    
    var clearcoatRoughness: js.UndefOr[Double] = js.undefined
    
    var clearcoatRoughnessMap: js.UndefOr[Texture | Null] = js.undefined
    
    var ior: js.UndefOr[Double] = js.undefined
    
    var reflectivity: js.UndefOr[Double] = js.undefined
    
    var sheen: js.UndefOr[Color] = js.undefined
    
    var transmission: js.UndefOr[Double] = js.undefined
    
    var transmissionMap: js.UndefOr[Texture | Null] = js.undefined
  }
  object MeshPhysicalMaterialParameters {
    
    inline def apply(): MeshPhysicalMaterialParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MeshPhysicalMaterialParameters]
    }
    
    extension [Self <: MeshPhysicalMaterialParameters](x: Self) {
      
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
      
      inline def setSheen(value: Color): Self = StObject.set(x, "sheen", value.asInstanceOf[js.Any])
      
      inline def setSheenUndefined: Self = StObject.set(x, "sheen", js.undefined)
      
      inline def setTransmission(value: Double): Self = StObject.set(x, "transmission", value.asInstanceOf[js.Any])
      
      inline def setTransmissionMap(value: Texture): Self = StObject.set(x, "transmissionMap", value.asInstanceOf[js.Any])
      
      inline def setTransmissionMapNull: Self = StObject.set(x, "transmissionMap", null)
      
      inline def setTransmissionMapUndefined: Self = StObject.set(x, "transmissionMap", js.undefined)
      
      inline def setTransmissionUndefined: Self = StObject.set(x, "transmission", js.undefined)
    }
  }
}
