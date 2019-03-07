package typings
package tmiDotJsLib.tmiDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var channels: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var connection: js.UndefOr[tmiDotJsLib.Anon_MaxReconnectAttempts] = js.undefined
  var identity: js.UndefOr[tmiDotJsLib.Anon_Password] = js.undefined
  var logger: js.UndefOr[tmiDotJsLib.Anon_Error] = js.undefined
  var options: js.UndefOr[tmiDotJsLib.Anon_ClientId] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    channels: js.Array[java.lang.String] = null,
    connection: tmiDotJsLib.Anon_MaxReconnectAttempts = null,
    identity: tmiDotJsLib.Anon_Password = null,
    logger: tmiDotJsLib.Anon_Error = null,
    options: tmiDotJsLib.Anon_ClientId = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (channels != null) __obj.updateDynamic("channels")(channels)
    if (connection != null) __obj.updateDynamic("connection")(connection)
    if (identity != null) __obj.updateDynamic("identity")(identity)
    if (logger != null) __obj.updateDynamic("logger")(logger)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[Options]
  }
}

