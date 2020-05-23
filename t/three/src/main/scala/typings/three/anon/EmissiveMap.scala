package typings.three.anon

import typings.three.uniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmissiveMap extends js.Object {
  var emissiveMap: IUniform
}

object EmissiveMap {
  @scala.inline
  def apply(emissiveMap: IUniform): EmissiveMap = {
    val __obj = js.Dynamic.literal(emissiveMap = emissiveMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmissiveMap]
  }
}

