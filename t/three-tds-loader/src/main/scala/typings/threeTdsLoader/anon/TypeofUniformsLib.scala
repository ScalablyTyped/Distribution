package typings.threeTdsLoader.anon

import typings.three.anon.AlphaMap
import typings.three.anon.AlphaTest
import typings.three.anon.AmbientLightColor
import typings.three.anon.AoMap
import typings.three.anon.BumpMap
import typings.three.anon.Center
import typings.three.anon.DisplacementBias
import typings.three.anon.EmissiveMap
import typings.three.anon.EnvMap
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

trait TypeofUniformsLib extends StObject {
  
  var aomap: AoMap
  
  var bumpmap: BumpMap
  
  var common: AlphaMap
  
  var displacementmap: DisplacementBias
  
  var emissivemap: EmissiveMap
  
  var envmap: EnvMap
  
  var fog: FogColor
  
  var gradientmap: GradientMap
  
  var lightmap: LightMap
  
  var lights: AmbientLightColor
  
  var metalnessmap: MetalnessMap
  
  var normalmap: NormalMap
  
  var points: AlphaTest
  
  var roughnessmap: RoughnessMap
  
  var specularmap: SpecularMap
  
  var sprite: Center
}
object TypeofUniformsLib {
  
  inline def apply(
    aomap: AoMap,
    bumpmap: BumpMap,
    common: AlphaMap,
    displacementmap: DisplacementBias,
    emissivemap: EmissiveMap,
    envmap: EnvMap,
    fog: FogColor,
    gradientmap: GradientMap,
    lightmap: LightMap,
    lights: AmbientLightColor,
    metalnessmap: MetalnessMap,
    normalmap: NormalMap,
    points: AlphaTest,
    roughnessmap: RoughnessMap,
    specularmap: SpecularMap,
    sprite: Center
  ): TypeofUniformsLib = {
    val __obj = js.Dynamic.literal(aomap = aomap.asInstanceOf[js.Any], bumpmap = bumpmap.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], displacementmap = displacementmap.asInstanceOf[js.Any], emissivemap = emissivemap.asInstanceOf[js.Any], envmap = envmap.asInstanceOf[js.Any], fog = fog.asInstanceOf[js.Any], gradientmap = gradientmap.asInstanceOf[js.Any], lightmap = lightmap.asInstanceOf[js.Any], lights = lights.asInstanceOf[js.Any], metalnessmap = metalnessmap.asInstanceOf[js.Any], normalmap = normalmap.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], roughnessmap = roughnessmap.asInstanceOf[js.Any], specularmap = specularmap.asInstanceOf[js.Any], sprite = sprite.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofUniformsLib]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofUniformsLib] (val x: Self) extends AnyVal {
    
    inline def setAomap(value: AoMap): Self = StObject.set(x, "aomap", value.asInstanceOf[js.Any])
    
    inline def setBumpmap(value: BumpMap): Self = StObject.set(x, "bumpmap", value.asInstanceOf[js.Any])
    
    inline def setCommon(value: AlphaMap): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    inline def setDisplacementmap(value: DisplacementBias): Self = StObject.set(x, "displacementmap", value.asInstanceOf[js.Any])
    
    inline def setEmissivemap(value: EmissiveMap): Self = StObject.set(x, "emissivemap", value.asInstanceOf[js.Any])
    
    inline def setEnvmap(value: EnvMap): Self = StObject.set(x, "envmap", value.asInstanceOf[js.Any])
    
    inline def setFog(value: FogColor): Self = StObject.set(x, "fog", value.asInstanceOf[js.Any])
    
    inline def setGradientmap(value: GradientMap): Self = StObject.set(x, "gradientmap", value.asInstanceOf[js.Any])
    
    inline def setLightmap(value: LightMap): Self = StObject.set(x, "lightmap", value.asInstanceOf[js.Any])
    
    inline def setLights(value: AmbientLightColor): Self = StObject.set(x, "lights", value.asInstanceOf[js.Any])
    
    inline def setMetalnessmap(value: MetalnessMap): Self = StObject.set(x, "metalnessmap", value.asInstanceOf[js.Any])
    
    inline def setNormalmap(value: NormalMap): Self = StObject.set(x, "normalmap", value.asInstanceOf[js.Any])
    
    inline def setPoints(value: AlphaTest): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setRoughnessmap(value: RoughnessMap): Self = StObject.set(x, "roughnessmap", value.asInstanceOf[js.Any])
    
    inline def setSpecularmap(value: SpecularMap): Self = StObject.set(x, "specularmap", value.asInstanceOf[js.Any])
    
    inline def setSprite(value: Center): Self = StObject.set(x, "sprite", value.asInstanceOf[js.Any])
  }
}
