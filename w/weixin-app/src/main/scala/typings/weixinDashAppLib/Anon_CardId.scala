package typings
package weixinDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CardId extends js.Object {
  var cardId: java.lang.String
  var code: java.lang.String
}

object Anon_CardId {
  @scala.inline
  def apply(cardId: java.lang.String, code: java.lang.String): Anon_CardId = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cardId")(cardId)
    __obj.updateDynamic("code")(code)
    __obj.asInstanceOf[Anon_CardId]
  }
}

