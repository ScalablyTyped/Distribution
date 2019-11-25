package typings.three

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisplacementBias extends js.Object {
  var displacementBias: IUniform
  var displacementMap: IUniform
  var displacementScale: IUniform
}

object Anon_DisplacementBias {
  @scala.inline
  def apply(displacementBias: IUniform, displacementMap: IUniform, displacementScale: IUniform): Anon_DisplacementBias = {
    val __obj = js.Dynamic.literal(displacementBias = displacementBias.asInstanceOf[js.Any], displacementMap = displacementMap.asInstanceOf[js.Any], displacementScale = displacementScale.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DisplacementBias]
  }
}

