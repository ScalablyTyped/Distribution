package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Diffuse extends js.Object {
  var diffuse: threeLib.srcRenderersShadersUniformsLibMod.IUniform
  var map: threeLib.srcRenderersShadersUniformsLibMod.IUniform
  var opacity: threeLib.srcRenderersShadersUniformsLibMod.IUniform
  var scale: threeLib.srcRenderersShadersUniformsLibMod.IUniform
  var size: threeLib.srcRenderersShadersUniformsLibMod.IUniform
  var uvTransform: threeLib.srcRenderersShadersUniformsLibMod.IUniform
}

object Anon_Diffuse {
  @scala.inline
  def apply(
    diffuse: threeLib.srcRenderersShadersUniformsLibMod.IUniform,
    map: threeLib.srcRenderersShadersUniformsLibMod.IUniform,
    opacity: threeLib.srcRenderersShadersUniformsLibMod.IUniform,
    scale: threeLib.srcRenderersShadersUniformsLibMod.IUniform,
    size: threeLib.srcRenderersShadersUniformsLibMod.IUniform,
    uvTransform: threeLib.srcRenderersShadersUniformsLibMod.IUniform
  ): Anon_Diffuse = {
    val __obj = js.Dynamic.literal(diffuse = diffuse, map = map, opacity = opacity, scale = scale, size = size, uvTransform = uvTransform)
  
    __obj.asInstanceOf[Anon_Diffuse]
  }
}

