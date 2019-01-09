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

