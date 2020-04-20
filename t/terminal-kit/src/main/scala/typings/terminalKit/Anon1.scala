package typings.terminalKit

import typings.terminalKit.terminalMod.GridMenuResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon1 extends js.Object {
  var promise: js.Promise[GridMenuResponse]
}

object Anon1 {
  @scala.inline
  def apply(promise: js.Promise[GridMenuResponse]): Anon1 = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon1]
  }
}

