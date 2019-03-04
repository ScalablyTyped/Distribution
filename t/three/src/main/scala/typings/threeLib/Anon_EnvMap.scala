package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnvMap extends js.Object {
  var envMap: threeLib.threeDashCoreMod.IUniform
  var flipEnvMap: threeLib.threeDashCoreMod.IUniform
  var maxMipLevel: threeLib.threeDashCoreMod.IUniform
  var reflectivity: threeLib.threeDashCoreMod.IUniform
  var refractionRatio: threeLib.threeDashCoreMod.IUniform
}

object Anon_EnvMap {
  @scala.inline
  def apply(
    envMap: threeLib.threeDashCoreMod.IUniform,
    flipEnvMap: threeLib.threeDashCoreMod.IUniform,
    maxMipLevel: threeLib.threeDashCoreMod.IUniform,
    reflectivity: threeLib.threeDashCoreMod.IUniform,
    refractionRatio: threeLib.threeDashCoreMod.IUniform
  ): Anon_EnvMap = {
    val __obj = js.Dynamic.literal(envMap = envMap, flipEnvMap = flipEnvMap, maxMipLevel = maxMipLevel, reflectivity = reflectivity, refractionRatio = refractionRatio)
  
    __obj.asInstanceOf[Anon_EnvMap]
  }
}

