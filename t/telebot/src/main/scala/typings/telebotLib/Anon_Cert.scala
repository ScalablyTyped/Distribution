package typings
package telebotLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cert extends js.Object {
   // Optional. Private key for server.
  var cert: js.UndefOr[java.lang.String] = js.undefined
   // HTTPS url to send updates to.
  var host: js.UndefOr[java.lang.String] = js.undefined
  // Optional. Use webhook instead of polling.
  var key: js.UndefOr[java.lang.String] = js.undefined
   // Server port.
  var maxConnections: js.UndefOr[scala.Double] = js.undefined
   // Webhook server host.
  var port: js.UndefOr[scala.Double] = js.undefined
   // Optional. key.
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Cert {
  @scala.inline
  def apply(
    cert: java.lang.String = null,
    host: java.lang.String = null,
    key: java.lang.String = null,
    maxConnections: scala.Int | scala.Double = null,
    port: scala.Int | scala.Double = null,
    url: java.lang.String = null
  ): Anon_Cert = {
    val __obj = js.Dynamic.literal()
    if (cert != null) __obj.updateDynamic("cert")(cert)
    if (host != null) __obj.updateDynamic("host")(host)
    if (key != null) __obj.updateDynamic("key")(key)
    if (maxConnections != null) __obj.updateDynamic("maxConnections")(maxConnections.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_Cert]
  }
}

