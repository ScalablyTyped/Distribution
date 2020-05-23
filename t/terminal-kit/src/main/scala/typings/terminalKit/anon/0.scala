package typings.terminalKit.anon

import typings.terminalKit.terminalMod.SingleColumnMenuResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `0` extends js.Object {
  var promise: js.Promise[SingleColumnMenuResponse]
}

object `0` {
  @scala.inline
  def apply(promise: js.Promise[SingleColumnMenuResponse]): `0` = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
}

