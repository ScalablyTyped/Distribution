package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisplacementBias extends js.Object {
  var displacementBias: threeLib.srcRenderersShadersUniformsLibMod.IUniform
  var displacementMap: threeLib.srcRenderersShadersUniformsLibMod.IUniform
  var displacementScale: threeLib.srcRenderersShadersUniformsLibMod.IUniform
}

object Anon_DisplacementBias {
  @scala.inline
  def apply(
    displacementBias: threeLib.srcRenderersShadersUniformsLibMod.IUniform,
    displacementMap: threeLib.srcRenderersShadersUniformsLibMod.IUniform,
    displacementScale: threeLib.srcRenderersShadersUniformsLibMod.IUniform
  ): Anon_DisplacementBias = {
    val __obj = js.Dynamic.literal(displacementBias = displacementBias, displacementMap = displacementMap, displacementScale = displacementScale)
  
    __obj.asInstanceOf[Anon_DisplacementBias]
  }
}

