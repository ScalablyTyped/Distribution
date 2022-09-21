package typings.three

import typings.three.materialMod.Material
import typings.three.materialMod.MaterialParameters
import typings.three.srcConstantsMod.NormalMapTypes
import typings.three.textureMod.Texture
import typings.three.vector2Mod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meshNormalMaterialMod {
  
  @JSImport("three/src/materials/MeshNormalMaterial", "MeshNormalMaterial")
  @js.native
  open class MeshNormalMaterial () extends Material {
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
      * Define whether the material is rendered with flat shading. Default is false.
      * @default false
      */
    var flatShading: Boolean = js.native
    
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
    var wireframe: Boolean = js.native
    
    /**
      * @default 1
      */
    var wireframeLinewidth: Double = js.native
  }
  
  trait MeshNormalMaterialParameters
    extends StObject
       with MaterialParameters {
    
    var bumpMap: js.UndefOr[Texture | Null] = js.undefined
    
    var bumpScale: js.UndefOr[Double] = js.undefined
    
    var displacementBias: js.UndefOr[Double] = js.undefined
    
    var displacementMap: js.UndefOr[Texture | Null] = js.undefined
    
    var displacementScale: js.UndefOr[Double] = js.undefined
    
    var flatShading: js.UndefOr[Boolean] = js.undefined
    
    var normalMap: js.UndefOr[Texture | Null] = js.undefined
    
    var normalMapType: js.UndefOr[NormalMapTypes] = js.undefined
    
    var normalScale: js.UndefOr[Vector2] = js.undefined
    
    var wireframe: js.UndefOr[Boolean] = js.undefined
    
    var wireframeLinewidth: js.UndefOr[Double] = js.undefined
  }
  object MeshNormalMaterialParameters {
    
    inline def apply(): MeshNormalMaterialParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MeshNormalMaterialParameters]
    }
    
    extension [Self <: MeshNormalMaterialParameters](x: Self) {
      
      inline def setBumpMap(value: Texture): Self = StObject.set(x, "bumpMap", value.asInstanceOf[js.Any])
      
      inline def setBumpMapNull: Self = StObject.set(x, "bumpMap", null)
      
      inline def setBumpMapUndefined: Self = StObject.set(x, "bumpMap", js.undefined)
      
      inline def setBumpScale(value: Double): Self = StObject.set(x, "bumpScale", value.asInstanceOf[js.Any])
      
      inline def setBumpScaleUndefined: Self = StObject.set(x, "bumpScale", js.undefined)
      
      inline def setDisplacementBias(value: Double): Self = StObject.set(x, "displacementBias", value.asInstanceOf[js.Any])
      
      inline def setDisplacementBiasUndefined: Self = StObject.set(x, "displacementBias", js.undefined)
      
      inline def setDisplacementMap(value: Texture): Self = StObject.set(x, "displacementMap", value.asInstanceOf[js.Any])
      
      inline def setDisplacementMapNull: Self = StObject.set(x, "displacementMap", null)
      
      inline def setDisplacementMapUndefined: Self = StObject.set(x, "displacementMap", js.undefined)
      
      inline def setDisplacementScale(value: Double): Self = StObject.set(x, "displacementScale", value.asInstanceOf[js.Any])
      
      inline def setDisplacementScaleUndefined: Self = StObject.set(x, "displacementScale", js.undefined)
      
      inline def setFlatShading(value: Boolean): Self = StObject.set(x, "flatShading", value.asInstanceOf[js.Any])
      
      inline def setFlatShadingUndefined: Self = StObject.set(x, "flatShading", js.undefined)
      
      inline def setNormalMap(value: Texture): Self = StObject.set(x, "normalMap", value.asInstanceOf[js.Any])
      
      inline def setNormalMapNull: Self = StObject.set(x, "normalMap", null)
      
      inline def setNormalMapType(value: NormalMapTypes): Self = StObject.set(x, "normalMapType", value.asInstanceOf[js.Any])
      
      inline def setNormalMapTypeUndefined: Self = StObject.set(x, "normalMapType", js.undefined)
      
      inline def setNormalMapUndefined: Self = StObject.set(x, "normalMap", js.undefined)
      
      inline def setNormalScale(value: Vector2): Self = StObject.set(x, "normalScale", value.asInstanceOf[js.Any])
      
      inline def setNormalScaleUndefined: Self = StObject.set(x, "normalScale", js.undefined)
      
      inline def setWireframe(value: Boolean): Self = StObject.set(x, "wireframe", value.asInstanceOf[js.Any])
      
      inline def setWireframeLinewidth(value: Double): Self = StObject.set(x, "wireframeLinewidth", value.asInstanceOf[js.Any])
      
      inline def setWireframeLinewidthUndefined: Self = StObject.set(x, "wireframeLinewidth", js.undefined)
      
      inline def setWireframeUndefined: Self = StObject.set(x, "wireframe", js.undefined)
    }
  }
}
