package typings.tmiJs.mod

import typings.tmiJs.AnonClientId
import typings.tmiJs.AnonError
import typings.tmiJs.AnonMaxReconnectAttempts
import typings.tmiJs.AnonPassword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var channels: js.UndefOr[js.Array[String]] = js.undefined
  var connection: js.UndefOr[AnonMaxReconnectAttempts] = js.undefined
  var identity: js.UndefOr[AnonPassword] = js.undefined
  var logger: js.UndefOr[AnonError] = js.undefined
  var options: js.UndefOr[AnonClientId] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    channels: js.Array[String] = null,
    connection: AnonMaxReconnectAttempts = null,
    identity: AnonPassword = null,
    logger: AnonError = null,
    options: AnonClientId = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (channels != null) __obj.updateDynamic("channels")(channels.asInstanceOf[js.Any])
    if (connection != null) __obj.updateDynamic("connection")(connection.asInstanceOf[js.Any])
    if (identity != null) __obj.updateDynamic("identity")(identity.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

