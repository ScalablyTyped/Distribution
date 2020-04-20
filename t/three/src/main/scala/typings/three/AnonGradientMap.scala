package typings.three

import typings.three.uniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGradientMap extends js.Object {
  var gradientMap: IUniform
}

object AnonGradientMap {
  @scala.inline
  def apply(gradientMap: IUniform): AnonGradientMap = {
    val __obj = js.Dynamic.literal(gradientMap = gradientMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGradientMap]
  }
}

