package typings.yandexDashMoneyDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowedCscrequired extends js.Object {
  var allowed: Boolean
  var csc_required: Boolean
  var items: js.Array[Anon_Id]
}

object Anon_AllowedCscrequired {
  @scala.inline
  def apply(allowed: Boolean, csc_required: Boolean, items: js.Array[Anon_Id]): Anon_AllowedCscrequired = {
    val __obj = js.Dynamic.literal(allowed = allowed, csc_required = csc_required, items = items)
  
    __obj.asInstanceOf[Anon_AllowedCscrequired]
  }
}

