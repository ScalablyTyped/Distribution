package typings.yandexMoneySdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllowedCscrequired extends js.Object {
  var allowed: Boolean
  var csc_required: Boolean
  var items: js.Array[AnonId]
}

object AnonAllowedCscrequired {
  @scala.inline
  def apply(allowed: Boolean, csc_required: Boolean, items: js.Array[AnonId]): AnonAllowedCscrequired = {
    val __obj = js.Dynamic.literal(allowed = allowed.asInstanceOf[js.Any], csc_required = csc_required.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAllowedCscrequired]
  }
}

