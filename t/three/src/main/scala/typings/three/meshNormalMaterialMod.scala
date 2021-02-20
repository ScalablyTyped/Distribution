package typings.three

import typings.three.constantsMod.NormalMapTypes
import typings.three.materialMod.Material
import typings.three.materialMod.MaterialParameters
import typings.three.textureMod.Texture
import typings.three.vector2Mod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meshNormalMaterialMod {
  
  @JSImport("three/src/materials/MeshNormalMaterial", "MeshNormalMaterial")
  @js.native
  class MeshNormalMaterial () extends Material {
    def this(parameters: MeshNormalMaterialParameters) = this()
    
    /**
    	 * @default null
    	 */
    var bumpMap: Texture | Null = js.native
    
    /**
    	 * @default 1
    	 */
    var bumpScale: Double = js.native
    
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
    
    def setValues(parameters: MeshNormalMaterialParameters): Unit = js.native
    
    /**
    	 * @default false
    	 */
    var skinning: Boolean = js.native
    
    /**
    	 * @default false
    	 */
    var wireframe: Boolean = js.native
    
    /**
    	 * @default 1
    	 */
    var wireframeLinewidth: Double = js.native
  }
  
  @js.native
  trait MeshNormalMaterialParameters extends MaterialParameters {
    
    var bumpMap: js.UndefOr[Texture | Null] = js.native
    
    var bumpScale: js.UndefOr[Double] = js.native
    
    var displacementBias: js.UndefOr[Double] = js.native
    
    var displacementMap: js.UndefOr[Texture | Null] = js.native
    
    var displacementScale: js.UndefOr[Double] = js.native
    
    var morphNormals: js.UndefOr[Boolean] = js.native
    
    var morphTargets: js.UndefOr[Boolean] = js.native
    
    var normalMap: js.UndefOr[Texture | Null] = js.native
    
    var normalMapType: js.UndefOr[NormalMapTypes] = js.native
    
    var normalScale: js.UndefOr[Vector2] = js.native
    
    var skinning: js.UndefOr[Boolean] = js.native
    
    var wireframe: js.UndefOr[Boolean] = js.native
    
    var wireframeLinewidth: js.UndefOr[Double] = js.native
  }
  object MeshNormalMaterialParameters {
    
    @scala.inline
    def apply(): MeshNormalMaterialParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MeshNormalMaterialParameters]
    }
    
    @scala.inline
    implicit class MeshNormalMaterialParametersMutableBuilder[Self <: MeshNormalMaterialParameters] (val x: Self) extends AnyVal {
      
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
