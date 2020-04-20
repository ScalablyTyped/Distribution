package typings.three

import typings.three.uniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSpecularMap extends js.Object {
  var specularMap: IUniform
}

object AnonSpecularMap {
  @scala.inline
  def apply(specularMap: IUniform): AnonSpecularMap = {
    val __obj = js.Dynamic.literal(specularMap = specularMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSpecularMap]
  }
}

