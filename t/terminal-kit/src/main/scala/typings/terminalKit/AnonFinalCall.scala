package typings.terminalKit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFinalCall extends js.Object {
  var finalCall: Boolean
}

object AnonFinalCall {
  @scala.inline
  def apply(finalCall: Boolean): AnonFinalCall = {
    val __obj = js.Dynamic.literal(finalCall = finalCall.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFinalCall]
  }
}

