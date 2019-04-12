package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LightMap extends js.Object {
  var lightMap: threeLib.srcRenderersShadersUniformsLibMod.IUniform
  var lightMapIntensity: threeLib.srcRenderersShadersUniformsLibMod.IUniform
}

object Anon_LightMap {
  @scala.inline
  def apply(
    lightMap: threeLib.srcRenderersShadersUniformsLibMod.IUniform,
    lightMapIntensity: threeLib.srcRenderersShadersUniformsLibMod.IUniform
  ): Anon_LightMap = {
    val __obj = js.Dynamic.literal(lightMap = lightMap, lightMapIntensity = lightMapIntensity)
  
    __obj.asInstanceOf[Anon_LightMap]
  }
}

