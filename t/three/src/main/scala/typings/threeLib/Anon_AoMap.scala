package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AoMap extends js.Object {
  var aoMap: threeLib.threeDashCoreMod.IUniform
  var aoMapIntensity: threeLib.threeDashCoreMod.IUniform
}

trait Anon_Aomap extends js.Object {
  var aomap: Anon_AoMap
  var bumpmap: Anon_BumpMap
  var common: Anon_AlphaMap
  var displacementmap: Anon_DisplacementBias
  var emissivemap: Anon_EmissiveMap
  var envmap: Anon_EnvMap
  var fog: Anon_FogColor
  var gradientmap: Anon_GradientMap
  var lightmap: Anon_LightMap
  var lights: Anon_AmbientLightColor
  var metalnessmap: Anon_MetalnessMap
  var normalmap: Anon_NormalMap
  var points: Anon_Diffuse
  var roughnessmap: Anon_RoughnessMap
  var specularmap: Anon_SpecularMap
}

object Anon_AoMap {
  @scala.inline
  def apply(aoMap: threeLib.threeDashCoreMod.IUniform, aoMapIntensity: threeLib.threeDashCoreMod.IUniform): Anon_AoMap = {
    val __obj = js.Dynamic.literal(aoMap = aoMap, aoMapIntensity = aoMapIntensity)
  
    __obj.asInstanceOf[Anon_AoMap]
  }
}

object Anon_Aomap {
  @scala.inline
  def apply(
    aomap: Anon_AoMap,
    bumpmap: Anon_BumpMap,
    common: Anon_AlphaMap,
    displacementmap: Anon_DisplacementBias,
    emissivemap: Anon_EmissiveMap,
    envmap: Anon_EnvMap,
    fog: Anon_FogColor,
    gradientmap: Anon_GradientMap,
    lightmap: Anon_LightMap,
    lights: Anon_AmbientLightColor,
    metalnessmap: Anon_MetalnessMap,
    normalmap: Anon_NormalMap,
    points: Anon_Diffuse,
    roughnessmap: Anon_RoughnessMap,
    specularmap: Anon_SpecularMap
  ): Anon_Aomap = {
    val __obj = js.Dynamic.literal(aomap = aomap, bumpmap = bumpmap, common = common, displacementmap = displacementmap, emissivemap = emissivemap, envmap = envmap, fog = fog, gradientmap = gradientmap, lightmap = lightmap, lights = lights, metalnessmap = metalnessmap, normalmap = normalmap, points = points, roughnessmap = roughnessmap, specularmap = specularmap)
  
    __obj.asInstanceOf[Anon_Aomap]
  }
}

