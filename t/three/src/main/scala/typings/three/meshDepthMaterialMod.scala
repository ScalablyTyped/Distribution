package typings.three

import typings.three.constantsMod.DepthPackingStrategies
import typings.three.materialMod.Material
import typings.three.materialMod.MaterialParameters
import typings.three.textureMod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meshDepthMaterialMod {
  
  @JSImport("three/src/materials/MeshDepthMaterial", "MeshDepthMaterial")
  @js.native
  class MeshDepthMaterial () extends Material {
    def this(parameters: MeshDepthMaterialParameters) = this()
    
    /**
    	 * @default null
    	 */
    var alphaMap: Texture | Null = js.native
    
    /**
    	 * @default THREE.BasicDepthPacking
    	 */
    var depthPacking: DepthPackingStrategies = js.native
    
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
    
    def setValues(parameters: MeshDepthMaterialParameters): Unit = js.native
    
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
  trait MeshDepthMaterialParameters extends MaterialParameters {
    
    var alphaMap: js.UndefOr[Texture | Null] = js.native
    
    var depthPacking: js.UndefOr[DepthPackingStrategies] = js.native
    
    var displacementBias: js.UndefOr[Double] = js.native
    
    var displacementMap: js.UndefOr[Texture | Null] = js.native
    
    var displacementScale: js.UndefOr[Double] = js.native
    
    var map: js.UndefOr[Texture | Null] = js.native
    
    var wireframe: js.UndefOr[Boolean] = js.native
    
    var wireframeLinewidth: js.UndefOr[Double] = js.native
  }
  object MeshDepthMaterialParameters {
    
    @scala.inline
    def apply(): MeshDepthMaterialParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MeshDepthMaterialParameters]
    }
    
    @scala.inline
    implicit class MeshDepthMaterialParametersMutableBuilder[Self <: MeshDepthMaterialParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlphaMap(value: Texture): Self = StObject.set(x, "alphaMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlphaMapNull: Self = StObject.set(x, "alphaMap", null)
      
      @scala.inline
      def setAlphaMapUndefined: Self = StObject.set(x, "alphaMap", js.undefined)
      
      @scala.inline
      def setDepthPacking(value: DepthPackingStrategies): Self = StObject.set(x, "depthPacking", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepthPackingUndefined: Self = StObject.set(x, "depthPacking", js.undefined)
      
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
