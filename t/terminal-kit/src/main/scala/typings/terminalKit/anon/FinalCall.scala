package typings.terminalKit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FinalCall extends js.Object {
  var finalCall: Boolean
}

object FinalCall {
  @scala.inline
  def apply(finalCall: Boolean): FinalCall = {
    val __obj = js.Dynamic.literal(finalCall = finalCall.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinalCall]
  }
}

