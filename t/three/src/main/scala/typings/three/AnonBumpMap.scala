package typings.three

import typings.three.uniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBumpMap extends js.Object {
  var bumpMap: IUniform
  var bumpScale: IUniform
}

object AnonBumpMap {
  @scala.inline
  def apply(bumpMap: IUniform, bumpScale: IUniform): AnonBumpMap = {
    val __obj = js.Dynamic.literal(bumpMap = bumpMap.asInstanceOf[js.Any], bumpScale = bumpScale.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBumpMap]
  }
}

