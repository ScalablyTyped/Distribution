package typings.three

import typings.three.uniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAoMap extends js.Object {
  var aoMap: IUniform
  var aoMapIntensity: IUniform
}

object AnonAoMap {
  @scala.inline
  def apply(aoMap: IUniform, aoMapIntensity: IUniform): AnonAoMap = {
    val __obj = js.Dynamic.literal(aoMap = aoMap.asInstanceOf[js.Any], aoMapIntensity = aoMapIntensity.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAoMap]
  }
}

