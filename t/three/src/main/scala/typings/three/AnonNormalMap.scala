package typings.three

import typings.three.uniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNormalMap extends js.Object {
  var normalMap: IUniform
  var normalScale: IUniform
}

object AnonNormalMap {
  @scala.inline
  def apply(normalMap: IUniform, normalScale: IUniform): AnonNormalMap = {
    val __obj = js.Dynamic.literal(normalMap = normalMap.asInstanceOf[js.Any], normalScale = normalScale.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNormalMap]
  }
}

