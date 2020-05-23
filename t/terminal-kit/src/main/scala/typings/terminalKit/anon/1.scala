package typings.terminalKit.anon

import typings.terminalKit.terminalMod.GridMenuResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1` extends js.Object {
  var promise: js.Promise[GridMenuResponse]
}

object `1` {
  @scala.inline
  def apply(promise: js.Promise[GridMenuResponse]): `1` = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
}

