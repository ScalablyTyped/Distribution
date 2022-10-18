package typings.three

import org.scalablytyped.runtime.StringDictionary
import typings.three.srcConstantsMod.NormalMapTypes
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcMaterialsMaterialMod.MaterialParameters
import typings.three.srcMathColorMod.Color
import typings.three.srcMathVector2Mod.Vector2
import typings.three.srcTexturesTextureMod.Texture
import typings.three.srcUtilsMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMaterialsMeshMatcapMaterialMod {
  
  @JSImport("three/src/materials/MeshMatcapMaterial", "MeshMatcapMaterial")
  @js.native
  open class MeshMatcapMaterial () extends Material {
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
    var defines_MeshMatcapMaterial: StringDictionary[Any] = js.native
    
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
      * Whether the material is affected by fog. Default is true.
      * @default fog
      */
    var fog: Boolean = js.native
    
    /**
      * @default null
      */
    var map: Texture | Null = js.native
    
    /**
      * @default null
      */
    var matcap: Texture | Null = js.native
    
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
  }
  
  trait MeshMatcapMaterialParameters
    extends StObject
       with MaterialParameters {
    
    var alphaMap: js.UndefOr[Texture | Null] = js.undefined
    
    var bumpMap: js.UndefOr[Texture | Null] = js.undefined
    
    var bumpScale: js.UndefOr[Double] = js.undefined
    
    var color: js.UndefOr[ColorRepresentation] = js.undefined
    
    var displacementBias: js.UndefOr[Double] = js.undefined
    
    var displacementMap: js.UndefOr[Texture | Null] = js.undefined
    
    var displacementScale: js.UndefOr[Double] = js.undefined
    
    var flatShading: js.UndefOr[Boolean] = js.undefined
    
    var fog: js.UndefOr[Boolean] = js.undefined
    
    var map: js.UndefOr[Texture | Null] = js.undefined
    
    var matcap: js.UndefOr[Texture | Null] = js.undefined
    
    var normalMap: js.UndefOr[Texture | Null] = js.undefined
    
    var normalMapType: js.UndefOr[NormalMapTypes] = js.undefined
    
    var normalScale: js.UndefOr[Vector2] = js.undefined
  }
  object MeshMatcapMaterialParameters {
    
    inline def apply(): MeshMatcapMaterialParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MeshMatcapMaterialParameters]
    }
    
    extension [Self <: MeshMatcapMaterialParameters](x: Self) {
      
      inline def setAlphaMap(value: Texture): Self = StObject.set(x, "alphaMap", value.asInstanceOf[js.Any])
      
      inline def setAlphaMapNull: Self = StObject.set(x, "alphaMap", null)
      
      inline def setAlphaMapUndefined: Self = StObject.set(x, "alphaMap", js.undefined)
      
      inline def setBumpMap(value: Texture): Self = StObject.set(x, "bumpMap", value.asInstanceOf[js.Any])
      
      inline def setBumpMapNull: Self = StObject.set(x, "bumpMap", null)
      
      inline def setBumpMapUndefined: Self = StObject.set(x, "bumpMap", js.undefined)
      
      inline def setBumpScale(value: Double): Self = StObject.set(x, "bumpScale", value.asInstanceOf[js.Any])
      
      inline def setBumpScaleUndefined: Self = StObject.set(x, "bumpScale", js.undefined)
      
      inline def setColor(value: ColorRepresentation): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDisplacementBias(value: Double): Self = StObject.set(x, "displacementBias", value.asInstanceOf[js.Any])
      
      inline def setDisplacementBiasUndefined: Self = StObject.set(x, "displacementBias", js.undefined)
      
      inline def setDisplacementMap(value: Texture): Self = StObject.set(x, "displacementMap", value.asInstanceOf[js.Any])
      
      inline def setDisplacementMapNull: Self = StObject.set(x, "displacementMap", null)
      
      inline def setDisplacementMapUndefined: Self = StObject.set(x, "displacementMap", js.undefined)
      
      inline def setDisplacementScale(value: Double): Self = StObject.set(x, "displacementScale", value.asInstanceOf[js.Any])
      
      inline def setDisplacementScaleUndefined: Self = StObject.set(x, "displacementScale", js.undefined)
      
      inline def setFlatShading(value: Boolean): Self = StObject.set(x, "flatShading", value.asInstanceOf[js.Any])
      
      inline def setFlatShadingUndefined: Self = StObject.set(x, "flatShading", js.undefined)
      
      inline def setFog(value: Boolean): Self = StObject.set(x, "fog", value.asInstanceOf[js.Any])
      
      inline def setFogUndefined: Self = StObject.set(x, "fog", js.undefined)
      
      inline def setMap(value: Texture): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapNull: Self = StObject.set(x, "map", null)
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setMatcap(value: Texture): Self = StObject.set(x, "matcap", value.asInstanceOf[js.Any])
      
      inline def setMatcapNull: Self = StObject.set(x, "matcap", null)
      
      inline def setMatcapUndefined: Self = StObject.set(x, "matcap", js.undefined)
      
      inline def setNormalMap(value: Texture): Self = StObject.set(x, "normalMap", value.asInstanceOf[js.Any])
      
      inline def setNormalMapNull: Self = StObject.set(x, "normalMap", null)
      
      inline def setNormalMapType(value: NormalMapTypes): Self = StObject.set(x, "normalMapType", value.asInstanceOf[js.Any])
      
      inline def setNormalMapTypeUndefined: Self = StObject.set(x, "normalMapType", js.undefined)
      
      inline def setNormalMapUndefined: Self = StObject.set(x, "normalMap", js.undefined)
      
      inline def setNormalScale(value: Vector2): Self = StObject.set(x, "normalScale", value.asInstanceOf[js.Any])
      
      inline def setNormalScaleUndefined: Self = StObject.set(x, "normalScale", js.undefined)
    }
  }
}
