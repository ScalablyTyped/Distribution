package typings.terminalDashKit

import typings.terminalDashKit.terminalMod.SingleLineMenuResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Promise extends js.Object {
  var promise: js.Promise[SingleLineMenuResponse]
}

object Anon_Promise {
  @scala.inline
  def apply(promise: js.Promise[SingleLineMenuResponse]): Anon_Promise = {
    val __obj = js.Dynamic.literal(promise = promise)
  
    __obj.asInstanceOf[Anon_Promise]
  }
}

