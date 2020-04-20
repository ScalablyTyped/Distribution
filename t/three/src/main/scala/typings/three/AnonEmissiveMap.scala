package typings.three

import typings.three.uniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEmissiveMap extends js.Object {
  var emissiveMap: IUniform
}

object AnonEmissiveMap {
  @scala.inline
  def apply(emissiveMap: IUniform): AnonEmissiveMap = {
    val __obj = js.Dynamic.literal(emissiveMap = emissiveMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEmissiveMap]
  }
}

