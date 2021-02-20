package typings.three

import org.scalablytyped.runtime.StringDictionary
import typings.three.colorMod.Color
import typings.three.constantsMod.NormalMapTypes
import typings.three.materialMod.Material
import typings.three.materialMod.MaterialParameters
import typings.three.textureMod.Texture
import typings.three.vector2Mod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meshMatcapMaterialMod {
  
  @JSImport("three/src/materials/MeshMatcapMaterial", "MeshMatcapMaterial")
  @js.native
  class MeshMatcapMaterial () extends Material {
    def this(parameters: MeshMatcapMaterialParameters) = this()
    
    /**
    	 * @default null
    	 */
    var alphaMap: Texture | Null = js.native
    
    /**
    	 * @default null
    	 */
    var bumpMap: Texture | Null = js.native
    
    /**
    	 * @default 1
    	 */
    var bumpScale: Double = js.native
    
    /**
    	 * @default new THREE.Color( 0xffffff )
    	 */
    var color: Color = js.native
    
    /**
    	 * @default { 'MATCAP': '' }
    	 */
    @JSName("defines")
    var defines_MeshMatcapMaterial: StringDictionary[js.Any] = js.native
    
    /**
    	 * @default 0
    	 */
    var displacementBias: Double = js.native
    
    /**
    	 * @default null
    	 */
    var displacementMap: Texture | Null = js.native
    
    /**
    	 * @default 1
    	 */
    var displacementScale: Double = js.native
    
    /**
    	 * @default null
    	 */
    var map: Texture | Null = js.native
    
    /**
    	 * @default null
    	 */
    var matcap: Texture | Null = js.native
    
    /**
    	 * @default false
    	 */
    var morphNormals: Boolean = js.native
    
    /**
    	 * @default false
    	 */
    var morphTargets: Boolean = js.native
    
    /**
    	 * @default null
    	 */
    var normalMap: Texture | Null = js.native
    
    /**
    	 * @default THREE.TangentSpaceNormalMap
    	 */
    var normalMapType: NormalMapTypes = js.native
    
    /**
    	 * @default new Vector2( 1, 1 )
    	 */
    var normalScale: Vector2 = js.native
    
    def setValues(parameters: MeshMatcapMaterialParameters): Unit = js.native
    
    /**
    	 * @default false
    	 */
    var skinning: Boolean = js.native
  }
  
  @js.native
  trait MeshMatcapMaterialParameters extends MaterialParameters {
    
    var alphaMap: js.UndefOr[Texture | Null] = js.native
    
    var bumpMap: js.UndefOr[Texture | Null] = js.native
    
    var bumpScale: js.UndefOr[Double] = js.native
    
    var color: js.UndefOr[Color | String | Double] = js.native
    
    var displacementBias: js.UndefOr[Double] = js.native
    
    var displacementMap: js.UndefOr[Texture | Null] = js.native
    
    var displacementScale: js.UndefOr[Double] = js.native
    
    var map: js.UndefOr[Texture | Null] = js.native
    
    var matcap: js.UndefOr[Texture | Null] = js.native
    
    var morphNormals: js.UndefOr[Boolean] = js.native
    
    var morphTargets: js.UndefOr[Boolean] = js.native
    
    var normalMap: js.UndefOr[Texture | Null] = js.native
    
    var normalMapType: js.UndefOr[NormalMapTypes] = js.native
    
    var normalScale: js.UndefOr[Vector2] = js.native
    
    var skinning: js.UndefOr[Boolean] = js.native
  }
  object MeshMatcapMaterialParameters {
    
    @scala.inline
    def apply(): MeshMatcapMaterialParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MeshMatcapMaterialParameters]
    }
    
    @scala.inline
    implicit class MeshMatcapMaterialParametersMutableBuilder[Self <: MeshMatcapMaterialParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlphaMap(value: Texture): Self = StObject.set(x, "alphaMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlphaMapNull: Self = StObject.set(x, "alphaMap", null)
      
      @scala.inline
      def setAlphaMapUndefined: Self = StObject.set(x, "alphaMap", js.undefined)
      
      @scala.inline
      def setBumpMap(value: Texture): Self = StObject.set(x, "bumpMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBumpMapNull: Self = StObject.set(x, "bumpMap", null)
      
      @scala.inline
      def setBumpMapUndefined: Self = StObject.set(x, "bumpMap", js.undefined)
      
      @scala.inline
      def setBumpScale(value: Double): Self = StObject.set(x, "bumpScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBumpScaleUndefined: Self = StObject.set(x, "bumpScale", js.undefined)
      
      @scala.inline
      def setColor(value: Color | String | Double): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDisplacementBias(value: Double): Self = StObject.set(x, "displacementBias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplacementBiasUndefined: Self = StObject.set(x, "displacementBias", js.undefined)
      
      @scala.inline
      def setDisplacementMap(value: Texture): Self = StObject.set(x, "displacementMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplacementMapNull: Self = StObject.set(x, "displacementMap", null)
      
      @scala.inline
      def setDisplacementMapUndefined: Self = StObject.set(x, "displacementMap", js.undefined)
      
      @scala.inline
      def setDisplacementScale(value: Double): Self = StObject.set(x, "displacementScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplacementScaleUndefined: Self = StObject.set(x, "displacementScale", js.undefined)
      
      @scala.inline
      def setMap(value: Texture): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapNull: Self = StObject.set(x, "map", null)
      
      @scala.inline
      def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      @scala.inline
      def setMatcap(value: Texture): Self = StObject.set(x, "matcap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatcapNull: Self = StObject.set(x, "matcap", null)
      
      @scala.inline
      def setMatcapUndefined: Self = StObject.set(x, "matcap", js.undefined)
      
      @scala.inline
      def setMorphNormals(value: Boolean): Self = StObject.set(x, "morphNormals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMorphNormalsUndefined: Self = StObject.set(x, "morphNormals", js.undefined)
      
      @scala.inline
      def setMorphTargets(value: Boolean): Self = StObject.set(x, "morphTargets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMorphTargetsUndefined: Self = StObject.set(x, "morphTargets", js.undefined)
      
      @scala.inline
      def setNormalMap(value: Texture): Self = StObject.set(x, "normalMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalMapNull: Self = StObject.set(x, "normalMap", null)
      
      @scala.inline
      def setNormalMapType(value: NormalMapTypes): Self = StObject.set(x, "normalMapType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalMapTypeUndefined: Self = StObject.set(x, "normalMapType", js.undefined)
      
      @scala.inline
      def setNormalMapUndefined: Self = StObject.set(x, "normalMap", js.undefined)
      
      @scala.inline
      def setNormalScale(value: Vector2): Self = StObject.set(x, "normalScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalScaleUndefined: Self = StObject.set(x, "normalScale", js.undefined)
      
      @scala.inline
      def setSkinning(value: Boolean): Self = StObject.set(x, "skinning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkinningUndefined: Self = StObject.set(x, "skinning", js.undefined)
    }
  }
}
