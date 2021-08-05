package typings.three

import typings.three.constantsMod.DepthPackingStrategies
import typings.three.materialMod.Material
import typings.three.materialMod.MaterialParameters
import typings.three.textureMod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  trait MeshDepthMaterialParameters
    extends StObject
       with MaterialParameters {
    
    var alphaMap: js.UndefOr[Texture | Null] = js.undefined
    
    var depthPacking: js.UndefOr[DepthPackingStrategies] = js.undefined
    
    var displacementBias: js.UndefOr[Double] = js.undefined
    
    var displacementMap: js.UndefOr[Texture | Null] = js.undefined
    
    var displacementScale: js.UndefOr[Double] = js.undefined
    
    var map: js.UndefOr[Texture | Null] = js.undefined
    
    var wireframe: js.UndefOr[Boolean] = js.undefined
    
    var wireframeLinewidth: js.UndefOr[Double] = js.undefined
  }
  object MeshDepthMaterialParameters {
    
    inline def apply(): MeshDepthMaterialParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MeshDepthMaterialParameters]
    }
    
    extension [Self <: MeshDepthMaterialParameters](x: Self) {
      
      inline def setAlphaMap(value: Texture): Self = StObject.set(x, "alphaMap", value.asInstanceOf[js.Any])
      
      inline def setAlphaMapNull: Self = StObject.set(x, "alphaMap", null)
      
      inline def setAlphaMapUndefined: Self = StObject.set(x, "alphaMap", js.undefined)
      
      inline def setDepthPacking(value: DepthPackingStrategies): Self = StObject.set(x, "depthPacking", value.asInstanceOf[js.Any])
      
      inline def setDepthPackingUndefined: Self = StObject.set(x, "depthPacking", js.undefined)
      
      inline def setDisplacementBias(value: Double): Self = StObject.set(x, "displacementBias", value.asInstanceOf[js.Any])
      
      inline def setDisplacementBiasUndefined: Self = StObject.set(x, "displacementBias", js.undefined)
      
      inline def setDisplacementMap(value: Texture): Self = StObject.set(x, "displacementMap", value.asInstanceOf[js.Any])
      
      inline def setDisplacementMapNull: Self = StObject.set(x, "displacementMap", null)
      
      inline def setDisplacementMapUndefined: Self = StObject.set(x, "displacementMap", js.undefined)
      
      inline def setDisplacementScale(value: Double): Self = StObject.set(x, "displacementScale", value.asInstanceOf[js.Any])
      
      inline def setDisplacementScaleUndefined: Self = StObject.set(x, "displacementScale", js.undefined)
      
      inline def setMap(value: Texture): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapNull: Self = StObject.set(x, "map", null)
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setWireframe(value: Boolean): Self = StObject.set(x, "wireframe", value.asInstanceOf[js.Any])
      
      inline def setWireframeLinewidth(value: Double): Self = StObject.set(x, "wireframeLinewidth", value.asInstanceOf[js.Any])
      
      inline def setWireframeLinewidthUndefined: Self = StObject.set(x, "wireframeLinewidth", js.undefined)
      
      inline def setWireframeUndefined: Self = StObject.set(x, "wireframe", js.undefined)
    }
  }
}
