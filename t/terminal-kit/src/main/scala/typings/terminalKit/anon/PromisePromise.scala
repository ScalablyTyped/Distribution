package typings.terminalKit.anon

import typings.terminalKit.terminalMod.SingleLineMenuResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromisePromise extends js.Object {
  var promise: js.Promise[SingleLineMenuResponse]
}

object PromisePromise {
  @scala.inline
  def apply(promise: js.Promise[SingleLineMenuResponse]): PromisePromise = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromisePromise]
  }
}

