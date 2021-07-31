package typings.three

import typings.three.colorMod.Color
import typings.three.constantsMod.Combine
import typings.three.materialMod.Material
import typings.three.materialMod.MaterialParameters
import typings.three.textureMod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meshBasicMaterialMod {
  
  @JSImport("three/src/materials/MeshBasicMaterial", "MeshBasicMaterial")
  @js.native
  class MeshBasicMaterial () extends Material {
    def this(parameters: MeshBasicMaterialParameters) = this()
    
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
    	 * @default new THREE.Color( 0xffffff )
    	 */
    var color: Color = js.native
    
    /**
    	 * @default THREE.MultiplyOperation
    	 */
    var combine: Combine = js.native
    
    /**
    	 * @default null
    	 */
    var envMap: Texture | Null = js.native
    
    /**
    	 * @default null
    	 */
    var map: Texture | Null = js.native
    
    /**
    	 * @default false
    	 */
    var morphTargets: Boolean = js.native
    
    /**
    	 * @default 1
    	 */
    var reflectivity: Double = js.native
    
    /**
    	 * @default 0.98
    	 */
    var refractionRatio: Double = js.native
    
    def setValues(parameters: MeshBasicMaterialParameters): Unit = js.native
    
    /**
    	 * @default false
    	 */
    var skinning: Boolean = js.native
    
    /**
    	 * @default null
    	 */
    var specularMap: Texture | Null = js.native
    
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
  
  trait MeshBasicMaterialParameters
    extends StObject
       with MaterialParameters {
    
    var alphaMap: js.UndefOr[Texture | Null] = js.undefined
    
    var aoMap: js.UndefOr[Texture | Null] = js.undefined
    
    var aoMapIntensity: js.UndefOr[Double] = js.undefined
    
    var color: js.UndefOr[Color | String | Double] = js.undefined
    
    var combine: js.UndefOr[Combine] = js.undefined
    
    var envMap: js.UndefOr[Texture | Null] = js.undefined
    
    var map: js.UndefOr[Texture | Null] = js.undefined
    
    var morphTargets: js.UndefOr[Boolean] = js.undefined
    
    var reflectivity: js.UndefOr[Double] = js.undefined
    
    var refractionRatio: js.UndefOr[Double] = js.undefined
    
    var skinning: js.UndefOr[Boolean] = js.undefined
    
    var specularMap: js.UndefOr[Texture | Null] = js.undefined
    
    var wireframe: js.UndefOr[Boolean] = js.undefined
    
    var wireframeLinecap: js.UndefOr[String] = js.undefined
    
    var wireframeLinejoin: js.UndefOr[String] = js.undefined
    
    var wireframeLinewidth: js.UndefOr[Double] = js.undefined
  }
  object MeshBasicMaterialParameters {
    
    @scala.inline
    def apply(): MeshBasicMaterialParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MeshBasicMaterialParameters]
    }
    
    @scala.inline
    implicit class MeshBasicMaterialParametersMutableBuilder[Self <: MeshBasicMaterialParameters] (val x: Self) extends AnyVal {
      
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
      def setColor(value: Color | String | Double): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setCombine(value: Combine): Self = StObject.set(x, "combine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCombineUndefined: Self = StObject.set(x, "combine", js.undefined)
      
      @scala.inline
      def setEnvMap(value: Texture): Self = StObject.set(x, "envMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvMapNull: Self = StObject.set(x, "envMap", null)
      
      @scala.inline
      def setEnvMapUndefined: Self = StObject.set(x, "envMap", js.undefined)
      
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
      def setReflectivity(value: Double): Self = StObject.set(x, "reflectivity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReflectivityUndefined: Self = StObject.set(x, "reflectivity", js.undefined)
      
      @scala.inline
      def setRefractionRatio(value: Double): Self = StObject.set(x, "refractionRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefractionRatioUndefined: Self = StObject.set(x, "refractionRatio", js.undefined)
      
      @scala.inline
      def setSkinning(value: Boolean): Self = StObject.set(x, "skinning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkinningUndefined: Self = StObject.set(x, "skinning", js.undefined)
      
      @scala.inline
      def setSpecularMap(value: Texture): Self = StObject.set(x, "specularMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpecularMapNull: Self = StObject.set(x, "specularMap", null)
      
      @scala.inline
      def setSpecularMapUndefined: Self = StObject.set(x, "specularMap", js.undefined)
      
      @scala.inline
      def setWireframe(value: Boolean): Self = StObject.set(x, "wireframe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWireframeLinecap(value: String): Self = StObject.set(x, "wireframeLinecap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWireframeLinecapUndefined: Self = StObject.set(x, "wireframeLinecap", js.undefined)
      
      @scala.inline
      def setWireframeLinejoin(value: String): Self = StObject.set(x, "wireframeLinejoin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWireframeLinejoinUndefined: Self = StObject.set(x, "wireframeLinejoin", js.undefined)
      
      @scala.inline
      def setWireframeLinewidth(value: Double): Self = StObject.set(x, "wireframeLinewidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWireframeLinewidthUndefined: Self = StObject.set(x, "wireframeLinewidth", js.undefined)
      
      @scala.inline
      def setWireframeUndefined: Self = StObject.set(x, "wireframe", js.undefined)
    }
  }
}
