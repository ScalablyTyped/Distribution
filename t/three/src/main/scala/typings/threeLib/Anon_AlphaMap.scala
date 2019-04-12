package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlphaMap extends js.Object {
  var alphaMap: threeLib.srcRenderersShadersUniformsLibMod.IUniform
  var diffuse: threeLib.srcRenderersShadersUniformsLibMod.IUniform
  var map: threeLib.srcRenderersShadersUniformsLibMod.IUniform
  var opacity: threeLib.srcRenderersShadersUniformsLibMod.IUniform
  var uvTransform: threeLib.srcRenderersShadersUniformsLibMod.IUniform
}

object Anon_AlphaMap {
  @scala.inline
  def apply(
    alphaMap: threeLib.srcRenderersShadersUniformsLibMod.IUniform,
    diffuse: threeLib.srcRenderersShadersUniformsLibMod.IUniform,
    map: threeLib.srcRenderersShadersUniformsLibMod.IUniform,
    opacity: threeLib.srcRenderersShadersUniformsLibMod.IUniform,
    uvTransform: threeLib.srcRenderersShadersUniformsLibMod.IUniform
  ): Anon_AlphaMap = {
    val __obj = js.Dynamic.literal(alphaMap = alphaMap, diffuse = diffuse, map = map, opacity = opacity, uvTransform = uvTransform)
  
    __obj.asInstanceOf[Anon_AlphaMap]
  }
}

