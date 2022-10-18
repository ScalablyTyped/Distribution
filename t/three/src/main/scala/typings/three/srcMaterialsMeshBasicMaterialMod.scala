package typings.three

import typings.three.srcConstantsMod.Combine
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcMaterialsMaterialMod.MaterialParameters
import typings.three.srcMathColorMod.Color
import typings.three.srcTexturesTextureMod.Texture
import typings.three.srcUtilsMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMaterialsMeshBasicMaterialMod {
  
  @JSImport("three/src/materials/MeshBasicMaterial", "MeshBasicMaterial")
  @js.native
  open class MeshBasicMaterial () extends Material {
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
      * Whether the material is affected by fog. Default is true.
      * @default fog
      */
    var fog: Boolean = js.native
    
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
      * @default 1
      */
    var reflectivity: Double = js.native
    
    /**
      * @default 0.98
      */
    var refractionRatio: Double = js.native
    
    def setValues(parameters: MeshBasicMaterialParameters): Unit = js.native
    
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
    
    var color: js.UndefOr[ColorRepresentation] = js.undefined
    
    var combine: js.UndefOr[Combine] = js.undefined
    
    var envMap: js.UndefOr[Texture | Null] = js.undefined
    
    var fog: js.UndefOr[Boolean] = js.undefined
    
    var lightMap: js.UndefOr[Texture | Null] = js.undefined
    
    var lightMapIntensity: js.UndefOr[Double] = js.undefined
    
    var map: js.UndefOr[Texture | Null] = js.undefined
    
    var reflectivity: js.UndefOr[Double] = js.undefined
    
    var refractionRatio: js.UndefOr[Double] = js.undefined
    
    var specularMap: js.UndefOr[Texture | Null] = js.undefined
    
    var wireframe: js.UndefOr[Boolean] = js.undefined
    
    var wireframeLinecap: js.UndefOr[String] = js.undefined
    
    var wireframeLinejoin: js.UndefOr[String] = js.undefined
    
    var wireframeLinewidth: js.UndefOr[Double] = js.undefined
  }
  object MeshBasicMaterialParameters {
    
    inline def apply(): MeshBasicMaterialParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MeshBasicMaterialParameters]
    }
    
    extension [Self <: MeshBasicMaterialParameters](x: Self) {
      
      inline def setAlphaMap(value: Texture): Self = StObject.set(x, "alphaMap", value.asInstanceOf[js.Any])
      
      inline def setAlphaMapNull: Self = StObject.set(x, "alphaMap", null)
      
      inline def setAlphaMapUndefined: Self = StObject.set(x, "alphaMap", js.undefined)
      
      inline def setAoMap(value: Texture): Self = StObject.set(x, "aoMap", value.asInstanceOf[js.Any])
      
      inline def setAoMapIntensity(value: Double): Self = StObject.set(x, "aoMapIntensity", value.asInstanceOf[js.Any])
      
      inline def setAoMapIntensityUndefined: Self = StObject.set(x, "aoMapIntensity", js.undefined)
      
      inline def setAoMapNull: Self = StObject.set(x, "aoMap", null)
      
      inline def setAoMapUndefined: Self = StObject.set(x, "aoMap", js.undefined)
      
      inline def setColor(value: ColorRepresentation): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setCombine(value: Combine): Self = StObject.set(x, "combine", value.asInstanceOf[js.Any])
      
      inline def setCombineUndefined: Self = StObject.set(x, "combine", js.undefined)
      
      inline def setEnvMap(value: Texture): Self = StObject.set(x, "envMap", value.asInstanceOf[js.Any])
      
      inline def setEnvMapNull: Self = StObject.set(x, "envMap", null)
      
      inline def setEnvMapUndefined: Self = StObject.set(x, "envMap", js.undefined)
      
      inline def setFog(value: Boolean): Self = StObject.set(x, "fog", value.asInstanceOf[js.Any])
      
      inline def setFogUndefined: Self = StObject.set(x, "fog", js.undefined)
      
      inline def setLightMap(value: Texture): Self = StObject.set(x, "lightMap", value.asInstanceOf[js.Any])
      
      inline def setLightMapIntensity(value: Double): Self = StObject.set(x, "lightMapIntensity", value.asInstanceOf[js.Any])
      
      inline def setLightMapIntensityUndefined: Self = StObject.set(x, "lightMapIntensity", js.undefined)
      
      inline def setLightMapNull: Self = StObject.set(x, "lightMap", null)
      
      inline def setLightMapUndefined: Self = StObject.set(x, "lightMap", js.undefined)
      
      inline def setMap(value: Texture): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapNull: Self = StObject.set(x, "map", null)
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setReflectivity(value: Double): Self = StObject.set(x, "reflectivity", value.asInstanceOf[js.Any])
      
      inline def setReflectivityUndefined: Self = StObject.set(x, "reflectivity", js.undefined)
      
      inline def setRefractionRatio(value: Double): Self = StObject.set(x, "refractionRatio", value.asInstanceOf[js.Any])
      
      inline def setRefractionRatioUndefined: Self = StObject.set(x, "refractionRatio", js.undefined)
      
      inline def setSpecularMap(value: Texture): Self = StObject.set(x, "specularMap", value.asInstanceOf[js.Any])
      
      inline def setSpecularMapNull: Self = StObject.set(x, "specularMap", null)
      
      inline def setSpecularMapUndefined: Self = StObject.set(x, "specularMap", js.undefined)
      
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
