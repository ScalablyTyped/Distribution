package typings.winstonLogglyBulk.mod

import typings.logform.mod.Format_
import typings.node.urlMod.Url
import typings.winstonLogglyBulk.AnonPassword
import typings.winstonTransport.mod.TransportStreamOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogglyOptions extends TransportStreamOptions {
  var auth: js.UndefOr[AnonPassword | Null] = js.undefined
  var bufferOptions: js.UndefOr[BufferOptions] = js.undefined
  var isBulk: js.UndefOr[Boolean] = js.undefined
  var json: js.UndefOr[Boolean] = js.undefined
  var networkErrorOnConsole: js.UndefOr[Boolean] = js.undefined
  var proxy: js.UndefOr[Null | String | Url] = js.undefined
  var stripColors: js.UndefOr[Boolean] = js.undefined
  var subdomain: String
  var tags: js.UndefOr[js.Array[String]] = js.undefined
  var timestamp: js.UndefOr[Boolean] = js.undefined
  var token: String
}

object LogglyOptions {
  @scala.inline
  def apply(
    subdomain: String,
    token: String,
    auth: AnonPassword = null,
    bufferOptions: BufferOptions = null,
    close: () => Unit = null,
    format: Format_ = null,
    handleExceptions: js.UndefOr[Boolean] = js.undefined,
    isBulk: js.UndefOr[Boolean] = js.undefined,
    json: js.UndefOr[Boolean] = js.undefined,
    level: String = null,
    log: (/* info */ js.Any, /* next */ js.Function0[Unit]) => _ = null,
    logv: (/* info */ js.Any, /* next */ js.Function0[Unit]) => _ = null,
    networkErrorOnConsole: js.UndefOr[Boolean] = js.undefined,
    proxy: String | Url = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    stripColors: js.UndefOr[Boolean] = js.undefined,
    tags: js.Array[String] = null,
    timestamp: js.UndefOr[Boolean] = js.undefined
  ): LogglyOptions = {
    val __obj = js.Dynamic.literal(subdomain = subdomain.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (bufferOptions != null) __obj.updateDynamic("bufferOptions")(bufferOptions.asInstanceOf[js.Any])
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction0(close))
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(handleExceptions)) __obj.updateDynamic("handleExceptions")(handleExceptions.asInstanceOf[js.Any])
    if (!js.isUndefined(isBulk)) __obj.updateDynamic("isBulk")(isBulk.asInstanceOf[js.Any])
    if (!js.isUndefined(json)) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(js.Any.fromFunction2(log))
    if (logv != null) __obj.updateDynamic("logv")(js.Any.fromFunction2(logv))
    if (!js.isUndefined(networkErrorOnConsole)) __obj.updateDynamic("networkErrorOnConsole")(networkErrorOnConsole.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (!js.isUndefined(stripColors)) __obj.updateDynamic("stripColors")(stripColors.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (!js.isUndefined(timestamp)) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogglyOptions]
  }
}

