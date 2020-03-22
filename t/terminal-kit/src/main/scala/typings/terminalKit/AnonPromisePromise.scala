package typings.terminalKit

import typings.terminalKit.terminalMod.SingleLineMenuResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPromisePromise extends js.Object {
  var promise: js.Promise[SingleLineMenuResponse]
}

object AnonPromisePromise {
  @scala.inline
  def apply(promise: js.Promise[SingleLineMenuResponse]): AnonPromisePromise = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPromisePromise]
  }
}

