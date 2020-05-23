package typings.telebot.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cert extends js.Object {
   // Optional. Private key for server.
  var cert: js.UndefOr[String] = js.undefined
   // HTTPS url to send updates to.
  var host: js.UndefOr[String] = js.undefined
  // Optional. Use webhook instead of polling.
  var key: js.UndefOr[String] = js.undefined
   // Server port.
  var maxConnections: js.UndefOr[Double] = js.undefined
   // Webhook server host.
  var port: js.UndefOr[Double] = js.undefined
   // Optional. key.
  var url: js.UndefOr[String] = js.undefined
}

object Cert {
  @scala.inline
  def apply(
    cert: String = null,
    host: String = null,
    key: String = null,
    maxConnections: js.UndefOr[Double] = js.undefined,
    port: js.UndefOr[Double] = js.undefined,
    url: String = null
  ): Cert = {
    val __obj = js.Dynamic.literal()
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(maxConnections)) __obj.updateDynamic("maxConnections")(maxConnections.get.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cert]
  }
}

