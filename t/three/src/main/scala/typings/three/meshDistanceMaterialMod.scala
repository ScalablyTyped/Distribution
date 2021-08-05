package typings.three

import typings.three.materialMod.Material
import typings.three.materialMod.MaterialParameters
import typings.three.textureMod.Texture
import typings.three.vector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meshDistanceMaterialMod {
  
  @JSImport("three/src/materials/MeshDistanceMaterial", "MeshDistanceMaterial")
  @js.native
  class MeshDistanceMaterial () extends Material {
    def this(parameters: MeshDistanceMaterialParameters) = this()
    
    /**
    	 * @default null
    	 */
    var alphaMap: Texture | Null = js.native
    
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
    	 * @default 1000
    	 */
    var farDistance: Double = js.native
    
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
    var nearDistance: Double = js.native
    
    /**
    	 * @default new THREE.Vector3()
    	 */
    var referencePosition: Vector3 = js.native
    
    def setValues(parameters: MeshDistanceMaterialParameters): Unit = js.native
    
    /**
    	 * @default false
    	 */
    var skinning: Boolean = js.native
  }
  
  trait MeshDistanceMaterialParameters
    extends StObject
       with MaterialParameters {
    
    var alphaMap: js.UndefOr[Texture | Null] = js.undefined
    
    var displacementBias: js.UndefOr[Double] = js.undefined
    
    var displacementMap: js.UndefOr[Texture | Null] = js.undefined
    
    var displacementScale: js.UndefOr[Double] = js.undefined
    
    var farDistance: js.UndefOr[Double] = js.undefined
    
    var map: js.UndefOr[Texture | Null] = js.undefined
    
    var nearDistance: js.UndefOr[Double] = js.undefined
    
    var referencePosition: js.UndefOr[Vector3] = js.undefined
  }
  object MeshDistanceMaterialParameters {
    
    inline def apply(): MeshDistanceMaterialParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MeshDistanceMaterialParameters]
    }
    
    extension [Self <: MeshDistanceMaterialParameters](x: Self) {
      
      inline def setAlphaMap(value: Texture): Self = StObject.set(x, "alphaMap", value.asInstanceOf[js.Any])
      
      inline def setAlphaMapNull: Self = StObject.set(x, "alphaMap", null)
      
      inline def setAlphaMapUndefined: Self = StObject.set(x, "alphaMap", js.undefined)
      
      inline def setDisplacementBias(value: Double): Self = StObject.set(x, "displacementBias", value.asInstanceOf[js.Any])
      
      inline def setDisplacementBiasUndefined: Self = StObject.set(x, "displacementBias", js.undefined)
      
      inline def setDisplacementMap(value: Texture): Self = StObject.set(x, "displacementMap", value.asInstanceOf[js.Any])
      
      inline def setDisplacementMapNull: Self = StObject.set(x, "displacementMap", null)
      
      inline def setDisplacementMapUndefined: Self = StObject.set(x, "displacementMap", js.undefined)
      
      inline def setDisplacementScale(value: Double): Self = StObject.set(x, "displacementScale", value.asInstanceOf[js.Any])
      
      inline def setDisplacementScaleUndefined: Self = StObject.set(x, "displacementScale", js.undefined)
      
      inline def setFarDistance(value: Double): Self = StObject.set(x, "farDistance", value.asInstanceOf[js.Any])
      
      inline def setFarDistanceUndefined: Self = StObject.set(x, "farDistance", js.undefined)
      
      inline def setMap(value: Texture): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapNull: Self = StObject.set(x, "map", null)
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setNearDistance(value: Double): Self = StObject.set(x, "nearDistance", value.asInstanceOf[js.Any])
      
      inline def setNearDistanceUndefined: Self = StObject.set(x, "nearDistance", js.undefined)
      
      inline def setReferencePosition(value: Vector3): Self = StObject.set(x, "referencePosition", value.asInstanceOf[js.Any])
      
      inline def setReferencePositionUndefined: Self = StObject.set(x, "referencePosition", js.undefined)
    }
  }
}
