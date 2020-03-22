package typings.terminalKit

import typings.terminalKit.terminalMod.SingleColumnMenuResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPromisePromise extends js.Object {
  var promise: js.Promise[SingleColumnMenuResponse]
}

object AnonPromisePromise {
  @scala.inline
  def apply(promise: js.Promise[SingleColumnMenuResponse]): AnonPromisePromise = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPromisePromise]
  }
}

