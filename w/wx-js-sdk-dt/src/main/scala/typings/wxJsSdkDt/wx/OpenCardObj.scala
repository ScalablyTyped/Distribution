package typings.wxJsSdkDt.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenCardObj extends js.Object {
  var cardId: String
  var code: String
}

object OpenCardObj {
  @scala.inline
  def apply(cardId: String, code: String): OpenCardObj = {
    val __obj = js.Dynamic.literal(cardId = cardId.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenCardObj]
  }
}

