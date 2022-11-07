package typings.three

import typings.three.anon.AlphaMap
import typings.three.anon.AmbientLightColor
import typings.three.anon.AoMap
import typings.three.anon.BackgroundBlurriness
import typings.three.anon.BumpMap
import typings.three.anon.Diffuse
import typings.three.anon.DisplacementBias
import typings.three.anon.EmissiveMap
import typings.three.anon.FogColor
import typings.three.anon.GradientMap
import typings.three.anon.LightMap
import typings.three.anon.MetalnessMap
import typings.three.anon.NormalMap
import typings.three.anon.RoughnessMap
import typings.three.anon.SpecularMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcRenderersShadersUniformsLibMod {
  
  object UniformsLib {
    
    @JSImport("three/src/renderers/shaders/UniformsLib", "UniformsLib")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("three/src/renderers/shaders/UniformsLib", "UniformsLib.aomap")
    @js.native
    def aomap: AoMap = js.native
    inline def aomap_=(x: AoMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aomap")(x.asInstanceOf[js.Any])
    
    @JSImport("three/src/renderers/shaders/UniformsLib", "UniformsLib.bumpmap")
    @js.native
    def bumpmap: BumpMap = js.native
    inline def bumpmap_=(x: BumpMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bumpmap")(x.asInstanceOf[js.Any])
    
    @JSImport("three/src/renderers/shaders/UniformsLib", "UniformsLib.common")
    @js.native
    def common: AlphaMap = js.native
    inline def common_=(x: AlphaMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("common")(x.asInstanceOf[js.Any])
    
    @JSImport("three/src/renderers/shaders/UniformsLib", "UniformsLib.displacementmap")
    @js.native
    def displacementmap: DisplacementBias = js.native
    inline def displacementmap_=(x: DisplacementBias): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displacementmap")(x.asInstanceOf[js.Any])
    
    @JSImport("three/src/renderers/shaders/UniformsLib", "UniformsLib.emissivemap")
    @js.native
    def emissivemap: EmissiveMap = js.native
    inline def emissivemap_=(x: EmissiveMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emissivemap")(x.asInstanceOf[js.Any])
    
    @JSImport("three/src/renderers/shaders/UniformsLib", "UniformsLib.envmap")
    @js.native
    def envmap: BackgroundBlurriness = js.native
    inline def envmap_=(x: BackgroundBlurriness): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("envmap")(x.asInstanceOf[js.Any])
    
    @JSImport("three/src/renderers/shaders/UniformsLib", "UniformsLib.fog")
    @js.native
    def fog: FogColor = js.native
    inline def fog_=(x: FogColor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fog")(x.asInstanceOf[js.Any])
    
    @JSImport("three/src/renderers/shaders/UniformsLib", "UniformsLib.gradientmap")
    @js.native
    def gradientmap: GradientMap = js.native
    inline def gradientmap_=(x: GradientMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gradientmap")(x.asInstanceOf[js.Any])
    
    @JSImport("three/src/renderers/shaders/UniformsLib", "UniformsLib.lightmap")
    @js.native
    def lightmap: LightMap = js.native
    inline def lightmap_=(x: LightMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lightmap")(x.asInstanceOf[js.Any])
    
    @JSImport("three/src/renderers/shaders/UniformsLib", "UniformsLib.lights")
    @js.native
    def lights: AmbientLightColor = js.native
    inline def lights_=(x: AmbientLightColor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lights")(x.asInstanceOf[js.Any])
    
    @JSImport("three/src/renderers/shaders/UniformsLib", "UniformsLib.metalnessmap")
    @js.native
    def metalnessmap: MetalnessMap = js.native
    inline def metalnessmap_=(x: MetalnessMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metalnessmap")(x.asInstanceOf[js.Any])
    
    @JSImport("three/src/renderers/shaders/UniformsLib", "UniformsLib.normalmap")
    @js.native
    def normalmap: NormalMap = js.native
    inline def normalmap_=(x: NormalMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("normalmap")(x.asInstanceOf[js.Any])
    
    @JSImport("three/src/renderers/shaders/UniformsLib", "UniformsLib.points")
    @js.native
    def points: Diffuse = js.native
    inline def points_=(x: Diffuse): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("points")(x.asInstanceOf[js.Any])
    
    @JSImport("three/src/renderers/shaders/UniformsLib", "UniformsLib.roughnessmap")
    @js.native
    def roughnessmap: RoughnessMap = js.native
    inline def roughnessmap_=(x: RoughnessMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("roughnessmap")(x.asInstanceOf[js.Any])
    
    @JSImport("three/src/renderers/shaders/UniformsLib", "UniformsLib.specularmap")
    @js.native
    def specularmap: SpecularMap = js.native
    inline def specularmap_=(x: SpecularMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("specularmap")(x.asInstanceOf[js.Any])
  }
  
  trait IUniform[TValue] extends StObject {
    
    var value: TValue
  }
  object IUniform {
    
    inline def apply[TValue](value: TValue): IUniform[TValue] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IUniform[TValue]]
    }
    
    extension [Self <: IUniform[?], TValue](x: Self & IUniform[TValue]) {
      
      inline def setValue(value: TValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
