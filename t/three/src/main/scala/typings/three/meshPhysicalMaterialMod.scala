package typings.three

import typings.three.colorMod.Color
import typings.three.meshStandardMaterialMod.MeshStandardMaterial
import typings.three.meshStandardMaterialMod.MeshStandardMaterialParameters
import typings.three.textureMod.Texture
import typings.three.vector2Mod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @js.native
  trait MeshPhysicalMaterialParameters extends MeshStandardMaterialParameters {
    
    var clearcoat: js.UndefOr[Double] = js.native
    
    var clearcoatMap: js.UndefOr[Texture | Null] = js.native
    
    var clearcoatNormalMap: js.UndefOr[Texture | Null] = js.native
    
    var clearcoatNormalScale: js.UndefOr[Vector2] = js.native
    
    var clearcoatRoughness: js.UndefOr[Double] = js.native
    
    var clearcoatRoughnessMap: js.UndefOr[Texture | Null] = js.native
    
    var ior: js.UndefOr[Double] = js.native
    
    var reflectivity: js.UndefOr[Double] = js.native
    
    var sheen: js.UndefOr[Color] = js.native
    
    var transmission: js.UndefOr[Double] = js.native
    
    var transmissionMap: js.UndefOr[Texture | Null] = js.native
  }
  object MeshPhysicalMaterialParameters {
    
    @scala.inline
    def apply(): MeshPhysicalMaterialParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MeshPhysicalMaterialParameters]
    }
    
    @scala.inline
    implicit class MeshPhysicalMaterialParametersMutableBuilder[Self <: MeshPhysicalMaterialParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClearcoat(value: Double): Self = StObject.set(x, "clearcoat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearcoatMap(value: Texture): Self = StObject.set(x, "clearcoatMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearcoatMapNull: Self = StObject.set(x, "clearcoatMap", null)
      
      @scala.inline
      def setClearcoatMapUndefined: Self = StObject.set(x, "clearcoatMap", js.undefined)
      
      @scala.inline
      def setClearcoatNormalMap(value: Texture): Self = StObject.set(x, "clearcoatNormalMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearcoatNormalMapNull: Self = StObject.set(x, "clearcoatNormalMap", null)
      
      @scala.inline
      def setClearcoatNormalMapUndefined: Self = StObject.set(x, "clearcoatNormalMap", js.undefined)
      
      @scala.inline
      def setClearcoatNormalScale(value: Vector2): Self = StObject.set(x, "clearcoatNormalScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearcoatNormalScaleUndefined: Self = StObject.set(x, "clearcoatNormalScale", js.undefined)
      
      @scala.inline
      def setClearcoatRoughness(value: Double): Self = StObject.set(x, "clearcoatRoughness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearcoatRoughnessMap(value: Texture): Self = StObject.set(x, "clearcoatRoughnessMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearcoatRoughnessMapNull: Self = StObject.set(x, "clearcoatRoughnessMap", null)
      
      @scala.inline
      def setClearcoatRoughnessMapUndefined: Self = StObject.set(x, "clearcoatRoughnessMap", js.undefined)
      
      @scala.inline
      def setClearcoatRoughnessUndefined: Self = StObject.set(x, "clearcoatRoughness", js.undefined)
      
      @scala.inline
      def setClearcoatUndefined: Self = StObject.set(x, "clearcoat", js.undefined)
      
      @scala.inline
      def setIor(value: Double): Self = StObject.set(x, "ior", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIorUndefined: Self = StObject.set(x, "ior", js.undefined)
      
      @scala.inline
      def setReflectivity(value: Double): Self = StObject.set(x, "reflectivity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReflectivityUndefined: Self = StObject.set(x, "reflectivity", js.undefined)
      
      @scala.inline
      def setSheen(value: Color): Self = StObject.set(x, "sheen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSheenUndefined: Self = StObject.set(x, "sheen", js.undefined)
      
      @scala.inline
      def setTransmission(value: Double): Self = StObject.set(x, "transmission", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransmissionMap(value: Texture): Self = StObject.set(x, "transmissionMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransmissionMapNull: Self = StObject.set(x, "transmissionMap", null)
      
      @scala.inline
      def setTransmissionMapUndefined: Self = StObject.set(x, "transmissionMap", js.undefined)
      
      @scala.inline
      def setTransmissionUndefined: Self = StObject.set(x, "transmission", js.undefined)
    }
  }
}
