package typings.terminalKit

import typings.terminalKit.terminalMod.GridMenuResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPromiseGridMenuResponse extends js.Object {
  var promise: js.Promise[GridMenuResponse]
}

object AnonPromiseGridMenuResponse {
  @scala.inline
  def apply(promise: js.Promise[GridMenuResponse]): AnonPromiseGridMenuResponse = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPromiseGridMenuResponse]
  }
}

