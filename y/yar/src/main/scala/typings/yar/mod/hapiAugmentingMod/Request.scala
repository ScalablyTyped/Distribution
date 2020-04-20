package typings.yar.mod.hapiAugmentingMod

import typings.yar.mod.Yar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var yar: Yar
}

object Request {
  @scala.inline
  def apply(yar: Yar): Request = {
    val __obj = js.Dynamic.literal(yar = yar.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
}

