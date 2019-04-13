package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AoMap extends js.Object {
  var aoMap: threeLib.srcRenderersShadersUniformsLibMod.IUniform
  var aoMapIntensity: threeLib.srcRenderersShadersUniformsLibMod.IUniform
}

object Anon_AoMap {
  @scala.inline
  def apply(
    aoMap: threeLib.srcRenderersShadersUniformsLibMod.IUniform,
    aoMapIntensity: threeLib.srcRenderersShadersUniformsLibMod.IUniform
  ): Anon_AoMap = {
    val __obj = js.Dynamic.literal(aoMap = aoMap, aoMapIntensity = aoMapIntensity)
  
    __obj.asInstanceOf[Anon_AoMap]
  }
}

