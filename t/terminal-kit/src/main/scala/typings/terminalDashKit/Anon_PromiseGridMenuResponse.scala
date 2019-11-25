package typings.terminalDashKit

import typings.terminalDashKit.terminalMod.GridMenuResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PromiseGridMenuResponse extends js.Object {
  var promise: js.Promise[GridMenuResponse]
}

object Anon_PromiseGridMenuResponse {
  @scala.inline
  def apply(promise: js.Promise[GridMenuResponse]): Anon_PromiseGridMenuResponse = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_PromiseGridMenuResponse]
  }
}

