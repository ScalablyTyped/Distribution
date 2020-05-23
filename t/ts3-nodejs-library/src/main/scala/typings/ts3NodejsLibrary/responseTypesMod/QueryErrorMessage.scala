package typings.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryErrorMessage extends js.Object {
  var extra_msg: js.UndefOr[String] = js.undefined
  var failed_permid: js.UndefOr[Double] = js.undefined
  var id: Double
  var msg: String
}

object QueryErrorMessage {
  @scala.inline
  def apply(
    id: Double,
    msg: String,
    extra_msg: String = null,
    failed_permid: js.UndefOr[Double] = js.undefined
  ): QueryErrorMessage = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
    if (extra_msg != null) __obj.updateDynamic("extra_msg")(extra_msg.asInstanceOf[js.Any])
    if (!js.isUndefined(failed_permid)) __obj.updateDynamic("failed_permid")(failed_permid.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryErrorMessage]
  }
}

