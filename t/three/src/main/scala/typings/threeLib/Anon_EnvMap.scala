package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnvMap extends js.Object {
  var envMap: threeLib.srcRenderersShadersUniformsLibMod.IUniform
  var flipEnvMap: threeLib.srcRenderersShadersUniformsLibMod.IUniform
  var maxMipLevel: threeLib.srcRenderersShadersUniformsLibMod.IUniform
  var reflectivity: threeLib.srcRenderersShadersUniformsLibMod.IUniform
  var refractionRatio: threeLib.srcRenderersShadersUniformsLibMod.IUniform
}

object Anon_EnvMap {
  @scala.inline
  def apply(
    envMap: threeLib.srcRenderersShadersUniformsLibMod.IUniform,
    flipEnvMap: threeLib.srcRenderersShadersUniformsLibMod.IUniform,
    maxMipLevel: threeLib.srcRenderersShadersUniformsLibMod.IUniform,
    reflectivity: threeLib.srcRenderersShadersUniformsLibMod.IUniform,
    refractionRatio: threeLib.srcRenderersShadersUniformsLibMod.IUniform
  ): Anon_EnvMap = {
    val __obj = js.Dynamic.literal(envMap = envMap, flipEnvMap = flipEnvMap, maxMipLevel = maxMipLevel, reflectivity = reflectivity, refractionRatio = refractionRatio)
  
    __obj.asInstanceOf[Anon_EnvMap]
  }
}

