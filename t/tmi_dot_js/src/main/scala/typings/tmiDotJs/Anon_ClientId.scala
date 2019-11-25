package typings.tmiDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClientId extends js.Object {
  var clientId: js.UndefOr[String] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
}

object Anon_ClientId {
  @scala.inline
  def apply(clientId: String = null, debug: js.UndefOr[Boolean] = js.undefined): Anon_ClientId = {
    val __obj = js.Dynamic.literal()
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ClientId]
  }
}

