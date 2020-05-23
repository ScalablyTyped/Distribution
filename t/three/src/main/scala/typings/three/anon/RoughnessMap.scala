package typings.three.anon

import typings.three.uniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoughnessMap extends js.Object {
  var roughnessMap: IUniform
}

object RoughnessMap {
  @scala.inline
  def apply(roughnessMap: IUniform): RoughnessMap = {
    val __obj = js.Dynamic.literal(roughnessMap = roughnessMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoughnessMap]
  }
}

