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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meshStandardMaterialMod {
  
  @JSImport("three/src/materials/MeshStandardMaterial", "MeshStandardMaterial")
  @js.native
  class MeshStandardMaterial () extends Material {
    def this(parameters: MeshStandardMaterialParameters) = this()
    
    /**
    	 * @default null
    	 */
    var alphaMap: Texture | Null = js.native
    
    /**
    	 * @default null
    	 */
    var aoMap: Texture | Null = js.native
    
    /**
    	 * @default 1
    	 */
    var aoMapIntensity: Double = js.native
    
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
    	 * @default { 'STANDARD': '' }
    	 */
    @JSName("defines")
    var defines_MeshStandardMaterial: StringDictionary[js.Any] = js.native
    
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
    	 * @default new THREE.Color( 0x000000 )
    	 */
    var emissive: Color = js.native
    
    /**
    	 * @default 1
    	 */
    var emissiveIntensity: Double = js.native
    
    /**
    	 * @default null
    	 */
    var emissiveMap: Texture | Null = js.native
    
    /**
    	 * @default null
    	 */
    var envMap: Texture | Null = js.native
    
    /**
    	 * @default 1
    	 */
    var envMapIntensity: Double = js.native
    
    /**
    	 * @default null
    	 */
    var lightMap: Texture | Null = js.native
    
    /**
    	 * @default 1
    	 */
    var lightMapIntensity: Double = js.native
    
    /**
    	 * @default null
    	 */
    var map: Texture | Null = js.native
    
    /**
    	 * @default 0
    	 */
    var metalness: Double = js.native
    
    /**
    	 * @default null
    	 */
    var metalnessMap: Texture | Null = js.native
    
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
    	 * @default new THREE.Vector2( 1, 1 )
    	 */
    var normalScale: Vector2 = js.native
    
    /**
    	 * @default 0.98
    	 */
    var refractionRatio: Double = js.native
    
    /**
    	 * @default 1
    	 */
    var roughness: Double = js.native
    
    /**
    	 * @default null
    	 */
    var roughnessMap: Texture | Null = js.native
    
    def setValues(parameters: MeshStandardMaterialParameters): Unit = js.native
    
    /**
    	 * @default false
    	 */
    var skinning: Boolean = js.native
    
    /**
    	 * @default false
    	 */
    var vertexTangents: Boolean = js.native
    
    /**
    	 * @default false
    	 */
    var wireframe: Boolean = js.native
    
    /**
    	 * @default 'round'
    	 */
    var wireframeLinecap: String = js.native
    
    /**
    	 * @default 'round'
    	 */
    var wireframeLinejoin: String = js.native
    
    /**
    	 * @default 1
    	 */
    var wireframeLinewidth: Double = js.native
  }
  
  trait MeshStandardMaterialParameters
    extends StObject
       with MaterialParameters {
    
    var alphaMap: js.UndefOr[Texture | Null] = js.undefined
    
    var aoMap: js.UndefOr[Texture | Null] = js.undefined
    
    var aoMapIntensity: js.UndefOr[Double] = js.undefined
    
    var bumpMap: js.UndefOr[Texture | Null] = js.undefined
    
    var bumpScale: js.UndefOr[Double] = js.undefined
    
    var color: js.UndefOr[Color | String | Double] = js.undefined
    
    var displacementBias: js.UndefOr[Double] = js.undefined
    
    var displacementMap: js.UndefOr[Texture | Null] = js.undefined
    
    var displacementScale: js.UndefOr[Double] = js.undefined
    
    var emissive: js.UndefOr[Color | String | Double] = js.undefined
    
    var emissiveIntensity: js.UndefOr[Double] = js.undefined
    
    var emissiveMap: js.UndefOr[Texture | Null] = js.undefined
    
    var envMap: js.UndefOr[Texture | Null] = js.undefined
    
    var envMapIntensity: js.UndefOr[Double] = js.undefined
    
    var lightMap: js.UndefOr[Texture | Null] = js.undefined
    
    var lightMapIntensity: js.UndefOr[Double] = js.undefined
    
    var map: js.UndefOr[Texture | Null] = js.undefined
    
    var metalness: js.UndefOr[Double] = js.undefined
    
    var metalnessMap: js.UndefOr[Texture | Null] = js.undefined
    
    var morphNormals: js.UndefOr[Boolean] = js.undefined
    
    var morphTargets: js.UndefOr[Boolean] = js.undefined
    
    var normalMap: js.UndefOr[Texture | Null] = js.undefined
    
    var normalMapType: js.UndefOr[NormalMapTypes] = js.undefined
    
    var normalScale: js.UndefOr[Vector2] = js.undefined
    
    var refractionRatio: js.UndefOr[Double] = js.undefined
    
    var roughness: js.UndefOr[Double] = js.undefined
    
    var roughnessMap: js.UndefOr[Texture | Null] = js.undefined
    
    var skinning: js.UndefOr[Boolean] = js.undefined
    
    var vertexTangents: js.UndefOr[Boolean] = js.undefined
    
    var wireframe: js.UndefOr[Boolean] = js.undefined
    
    var wireframeLinewidth: js.UndefOr[Double] = js.undefined
  }
  object MeshStandardMaterialParameters {
    
    @scala.inline
    def apply(): MeshStandardMaterialParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MeshStandardMaterialParameters]
    }
    
    @scala.inline
    implicit class MeshStandardMaterialParametersMutableBuilder[Self <: MeshStandardMaterialParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlphaMap(value: Texture): Self = StObject.set(x, "alphaMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlphaMapNull: Self = StObject.set(x, "alphaMap", null)
      
      @scala.inline
      def setAlphaMapUndefined: Self = StObject.set(x, "alphaMap", js.undefined)
      
      @scala.inline
      def setAoMap(value: Texture): Self = StObject.set(x, "aoMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAoMapIntensity(value: Double): Self = StObject.set(x, "aoMapIntensity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAoMapIntensityUndefined: Self = StObject.set(x, "aoMapIntensity", js.undefined)
      
      @scala.inline
      def setAoMapNull: Self = StObject.set(x, "aoMap", null)
      
      @scala.inline
      def setAoMapUndefined: Self = StObject.set(x, "aoMap", js.undefined)
      
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
      def setEmissive(value: Color | String | Double): Self = StObject.set(x, "emissive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmissiveIntensity(value: Double): Self = StObject.set(x, "emissiveIntensity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmissiveIntensityUndefined: Self = StObject.set(x, "emissiveIntensity", js.undefined)
      
      @scala.inline
      def setEmissiveMap(value: Texture): Self = StObject.set(x, "emissiveMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmissiveMapNull: Self = StObject.set(x, "emissiveMap", null)
      
      @scala.inline
      def setEmissiveMapUndefined: Self = StObject.set(x, "emissiveMap", js.undefined)
      
      @scala.inline
      def setEmissiveUndefined: Self = StObject.set(x, "emissive", js.undefined)
      
      @scala.inline
      def setEnvMap(value: Texture): Self = StObject.set(x, "envMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvMapIntensity(value: Double): Self = StObject.set(x, "envMapIntensity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvMapIntensityUndefined: Self = StObject.set(x, "envMapIntensity", js.undefined)
      
      @scala.inline
      def setEnvMapNull: Self = StObject.set(x, "envMap", null)
      
      @scala.inline
      def setEnvMapUndefined: Self = StObject.set(x, "envMap", js.undefined)
      
      @scala.inline
      def setLightMap(value: Texture): Self = StObject.set(x, "lightMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLightMapIntensity(value: Double): Self = StObject.set(x, "lightMapIntensity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLightMapIntensityUndefined: Self = StObject.set(x, "lightMapIntensity", js.undefined)
      
      @scala.inline
      def setLightMapNull: Self = StObject.set(x, "lightMap", null)
      
      @scala.inline
      def setLightMapUndefined: Self = StObject.set(x, "lightMap", js.undefined)
      
      @scala.inline
      def setMap(value: Texture): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapNull: Self = StObject.set(x, "map", null)
      
      @scala.inline
      def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      @scala.inline
      def setMetalness(value: Double): Self = StObject.set(x, "metalness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetalnessMap(value: Texture): Self = StObject.set(x, "metalnessMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetalnessMapNull: Self = StObject.set(x, "metalnessMap", null)
      
      @scala.inline
      def setMetalnessMapUndefined: Self = StObject.set(x, "metalnessMap", js.undefined)
      
      @scala.inline
      def setMetalnessUndefined: Self = StObject.set(x, "metalness", js.undefined)
      
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
      def setRefractionRatio(value: Double): Self = StObject.set(x, "refractionRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefractionRatioUndefined: Self = StObject.set(x, "refractionRatio", js.undefined)
      
      @scala.inline
      def setRoughness(value: Double): Self = StObject.set(x, "roughness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoughnessMap(value: Texture): Self = StObject.set(x, "roughnessMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoughnessMapNull: Self = StObject.set(x, "roughnessMap", null)
      
      @scala.inline
      def setRoughnessMapUndefined: Self = StObject.set(x, "roughnessMap", js.undefined)
      
      @scala.inline
      def setRoughnessUndefined: Self = StObject.set(x, "roughness", js.undefined)
      
      @scala.inline
      def setSkinning(value: Boolean): Self = StObject.set(x, "skinning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkinningUndefined: Self = StObject.set(x, "skinning", js.undefined)
      
      @scala.inline
      def setVertexTangents(value: Boolean): Self = StObject.set(x, "vertexTangents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertexTangentsUndefined: Self = StObject.set(x, "vertexTangents", js.undefined)
      
      @scala.inline
      def setWireframe(value: Boolean): Self = StObject.set(x, "wireframe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWireframeLinewidth(value: Double): Self = StObject.set(x, "wireframeLinewidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWireframeLinewidthUndefined: Self = StObject.set(x, "wireframeLinewidth", js.undefined)
      
      @scala.inline
      def setWireframeUndefined: Self = StObject.set(x, "wireframe", js.undefined)
    }
  }
}
