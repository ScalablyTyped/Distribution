package typings.terminalKit

import typings.terminalKit.terminalMod.SingleColumnMenuResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPromiseSingleColumnMenuResponse extends js.Object {
  var promise: js.Promise[SingleColumnMenuResponse]
}

object AnonPromiseSingleColumnMenuResponse {
  @scala.inline
  def apply(promise: js.Promise[SingleColumnMenuResponse]): AnonPromiseSingleColumnMenuResponse = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPromiseSingleColumnMenuResponse]
  }
}

