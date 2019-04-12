package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FogColor extends js.Object {
  var fogColor: threeLib.srcRenderersShadersUniformsLibMod.IUniform
  var fogDensity: threeLib.srcRenderersShadersUniformsLibMod.IUniform
  var fogFar: threeLib.srcRenderersShadersUniformsLibMod.IUniform
  var fogNear: threeLib.srcRenderersShadersUniformsLibMod.IUniform
}

object Anon_FogColor {
  @scala.inline
  def apply(
    fogColor: threeLib.srcRenderersShadersUniformsLibMod.IUniform,
    fogDensity: threeLib.srcRenderersShadersUniformsLibMod.IUniform,
    fogFar: threeLib.srcRenderersShadersUniformsLibMod.IUniform,
    fogNear: threeLib.srcRenderersShadersUniformsLibMod.IUniform
  ): Anon_FogColor = {
    val __obj = js.Dynamic.literal(fogColor = fogColor, fogDensity = fogDensity, fogFar = fogFar, fogNear = fogNear)
  
    __obj.asInstanceOf[Anon_FogColor]
  }
}

