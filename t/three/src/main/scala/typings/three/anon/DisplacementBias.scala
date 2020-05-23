package typings.three.anon

import typings.three.uniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisplacementBias extends js.Object {
  var displacementBias: IUniform
  var displacementMap: IUniform
  var displacementScale: IUniform
}

object DisplacementBias {
  @scala.inline
  def apply(displacementBias: IUniform, displacementMap: IUniform, displacementScale: IUniform): DisplacementBias = {
    val __obj = js.Dynamic.literal(displacementBias = displacementBias.asInstanceOf[js.Any], displacementMap = displacementMap.asInstanceOf[js.Any], displacementScale = displacementScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplacementBias]
  }
}

