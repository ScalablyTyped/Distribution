package typings.three.anon

import typings.three.uniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AoMap extends js.Object {
  var aoMap: IUniform
  var aoMapIntensity: IUniform
}

object AoMap {
  @scala.inline
  def apply(aoMap: IUniform, aoMapIntensity: IUniform): AoMap = {
    val __obj = js.Dynamic.literal(aoMap = aoMap.asInstanceOf[js.Any], aoMapIntensity = aoMapIntensity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AoMap]
  }
}

