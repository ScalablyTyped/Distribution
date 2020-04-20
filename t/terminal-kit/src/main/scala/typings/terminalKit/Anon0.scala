package typings.terminalKit

import typings.terminalKit.terminalMod.SingleColumnMenuResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0 extends js.Object {
  var promise: js.Promise[SingleColumnMenuResponse]
}

object Anon0 {
  @scala.inline
  def apply(promise: js.Promise[SingleColumnMenuResponse]): Anon0 = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon0]
  }
}

