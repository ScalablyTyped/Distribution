package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BumpMap extends js.Object {
  var bumpMap: threeLib.srcRenderersShadersUniformsLibMod.IUniform
  var bumpScale: threeLib.srcRenderersShadersUniformsLibMod.IUniform
}

object Anon_BumpMap {
  @scala.inline
  def apply(
    bumpMap: threeLib.srcRenderersShadersUniformsLibMod.IUniform,
    bumpScale: threeLib.srcRenderersShadersUniformsLibMod.IUniform
  ): Anon_BumpMap = {
    val __obj = js.Dynamic.literal(bumpMap = bumpMap, bumpScale = bumpScale)
  
    __obj.asInstanceOf[Anon_BumpMap]
  }
}

