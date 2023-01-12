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

object srcMaterialsMeshToonMaterialMod {
  
  @JSImport("three/src/materials/MeshToonMaterial", "MeshToonMaterial")
  @js.native
  open class MeshToonMaterial () extends Material {
    def this(parameters: MeshToonMaterialParameters) = this()
    
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
      * @default { 'TOON': '' }
      */
    @JSName("defines")
    var defines_MeshToonMaterial: StringDictionary[Any] = js.native
    
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
      * Whether the material is affected by fog. Default is true.
      * @default fog
      */
    var fog: Boolean = js.native
    
    /**
      * @default null
      */
    var gradientMap: Texture | Null = js.native
    
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
    
    def setValues(parameters: MeshToonMaterialParameters): Unit = js.native
    
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
  
  trait MeshToonMaterialParameters
    extends StObject
       with MaterialParameters {
    
    var alphaMap: js.UndefOr[Texture | Null] = js.undefined
    
    var aoMap: js.UndefOr[Texture | Null] = js.undefined
    
    var aoMapIntensity: js.UndefOr[Double] = js.undefined
    
    var bumpMap: js.UndefOr[Texture | Null] = js.undefined
    
    var bumpScale: js.UndefOr[Double] = js.undefined
    
    /** geometry color in hexadecimal. Default is 0xffffff. */
    var color: js.UndefOr[ColorRepresentation] = js.undefined
    
    var displacementBias: js.UndefOr[Double] = js.undefined
    
    var displacementMap: js.UndefOr[Texture | Null] = js.undefined
    
    var displacementScale: js.UndefOr[Double] = js.undefined
    
    var emissive: js.UndefOr[ColorRepresentation] = js.undefined
    
    var emissiveIntensity: js.UndefOr[Double] = js.undefined
    
    var emissiveMap: js.UndefOr[Texture | Null] = js.undefined
    
    var fog: js.UndefOr[Boolean] = js.undefined
    
    var gradientMap: js.UndefOr[Texture | Null] = js.undefined
    
    var lightMap: js.UndefOr[Texture | Null] = js.undefined
    
    var lightMapIntensity: js.UndefOr[Double] = js.undefined
    
    var map: js.UndefOr[Texture | Null] = js.undefined
    
    var normalMap: js.UndefOr[Texture | Null] = js.undefined
    
    var normalMapType: js.UndefOr[NormalMapTypes] = js.undefined
    
    var normalScale: js.UndefOr[Vector2] = js.undefined
    
    var wireframe: js.UndefOr[Boolean] = js.undefined
    
    var wireframeLinecap: js.UndefOr[String] = js.undefined
    
    var wireframeLinejoin: js.UndefOr[String] = js.undefined
    
    var wireframeLinewidth: js.UndefOr[Double] = js.undefined
  }
  object MeshToonMaterialParameters {
    
    inline def apply(): MeshToonMaterialParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MeshToonMaterialParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MeshToonMaterialParameters] (val x: Self) extends AnyVal {
      
      inline def setAlphaMap(value: Texture): Self = StObject.set(x, "alphaMap", value.asInstanceOf[js.Any])
      
      inline def setAlphaMapNull: Self = StObject.set(x, "alphaMap", null)
      
      inline def setAlphaMapUndefined: Self = StObject.set(x, "alphaMap", js.undefined)
      
      inline def setAoMap(value: Texture): Self = StObject.set(x, "aoMap", value.asInstanceOf[js.Any])
      
      inline def setAoMapIntensity(value: Double): Self = StObject.set(x, "aoMapIntensity", value.asInstanceOf[js.Any])
      
      inline def setAoMapIntensityUndefined: Self = StObject.set(x, "aoMapIntensity", js.undefined)
      
      inline def setAoMapNull: Self = StObject.set(x, "aoMap", null)
      
      inline def setAoMapUndefined: Self = StObject.set(x, "aoMap", js.undefined)
      
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
      
      inline def setEmissive(value: ColorRepresentation): Self = StObject.set(x, "emissive", value.asInstanceOf[js.Any])
      
      inline def setEmissiveIntensity(value: Double): Self = StObject.set(x, "emissiveIntensity", value.asInstanceOf[js.Any])
      
      inline def setEmissiveIntensityUndefined: Self = StObject.set(x, "emissiveIntensity", js.undefined)
      
      inline def setEmissiveMap(value: Texture): Self = StObject.set(x, "emissiveMap", value.asInstanceOf[js.Any])
      
      inline def setEmissiveMapNull: Self = StObject.set(x, "emissiveMap", null)
      
      inline def setEmissiveMapUndefined: Self = StObject.set(x, "emissiveMap", js.undefined)
      
      inline def setEmissiveUndefined: Self = StObject.set(x, "emissive", js.undefined)
      
      inline def setFog(value: Boolean): Self = StObject.set(x, "fog", value.asInstanceOf[js.Any])
      
      inline def setFogUndefined: Self = StObject.set(x, "fog", js.undefined)
      
      inline def setGradientMap(value: Texture): Self = StObject.set(x, "gradientMap", value.asInstanceOf[js.Any])
      
      inline def setGradientMapNull: Self = StObject.set(x, "gradientMap", null)
      
      inline def setGradientMapUndefined: Self = StObject.set(x, "gradientMap", js.undefined)
      
      inline def setLightMap(value: Texture): Self = StObject.set(x, "lightMap", value.asInstanceOf[js.Any])
      
      inline def setLightMapIntensity(value: Double): Self = StObject.set(x, "lightMapIntensity", value.asInstanceOf[js.Any])
      
      inline def setLightMapIntensityUndefined: Self = StObject.set(x, "lightMapIntensity", js.undefined)
      
      inline def setLightMapNull: Self = StObject.set(x, "lightMap", null)
      
      inline def setLightMapUndefined: Self = StObject.set(x, "lightMap", js.undefined)
      
      inline def setMap(value: Texture): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapNull: Self = StObject.set(x, "map", null)
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setNormalMap(value: Texture): Self = StObject.set(x, "normalMap", value.asInstanceOf[js.Any])
      
      inline def setNormalMapNull: Self = StObject.set(x, "normalMap", null)
      
      inline def setNormalMapType(value: NormalMapTypes): Self = StObject.set(x, "normalMapType", value.asInstanceOf[js.Any])
      
      inline def setNormalMapTypeUndefined: Self = StObject.set(x, "normalMapType", js.undefined)
      
      inline def setNormalMapUndefined: Self = StObject.set(x, "normalMap", js.undefined)
      
      inline def setNormalScale(value: Vector2): Self = StObject.set(x, "normalScale", value.asInstanceOf[js.Any])
      
      inline def setNormalScaleUndefined: Self = StObject.set(x, "normalScale", js.undefined)
      
      inline def setWireframe(value: Boolean): Self = StObject.set(x, "wireframe", value.asInstanceOf[js.Any])
      
      inline def setWireframeLinecap(value: String): Self = StObject.set(x, "wireframeLinecap", value.asInstanceOf[js.Any])
      
      inline def setWireframeLinecapUndefined: Self = StObject.set(x, "wireframeLinecap", js.undefined)
      
      inline def setWireframeLinejoin(value: String): Self = StObject.set(x, "wireframeLinejoin", value.asInstanceOf[js.Any])
      
      inline def setWireframeLinejoinUndefined: Self = StObject.set(x, "wireframeLinejoin", js.undefined)
      
      inline def setWireframeLinewidth(value: Double): Self = StObject.set(x, "wireframeLinewidth", value.asInstanceOf[js.Any])
      
      inline def setWireframeLinewidthUndefined: Self = StObject.set(x, "wireframeLinewidth", js.undefined)
      
      inline def setWireframeUndefined: Self = StObject.set(x, "wireframe", js.undefined)
    }
  }
}
