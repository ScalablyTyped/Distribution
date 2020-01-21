package typings.tmiJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClientId extends js.Object {
  var clientId: js.UndefOr[String] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
}

object AnonClientId {
  @scala.inline
  def apply(clientId: String = null, debug: js.UndefOr[Boolean] = js.undefined): AnonClientId = {
    val __obj = js.Dynamic.literal()
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClientId]
  }
}

