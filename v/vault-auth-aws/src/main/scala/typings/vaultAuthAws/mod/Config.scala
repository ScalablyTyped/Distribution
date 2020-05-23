package typings.vaultAuthAws.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var apiVersion: js.UndefOr[String] = js.undefined
  var certFilePath: js.UndefOr[String] = js.undefined
  var followAllRedirects: js.UndefOr[Boolean] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var ssl: js.UndefOr[Boolean] = js.undefined
  var sslRejectUnAuthorized: js.UndefOr[Boolean] = js.undefined
  var vaultAppName: js.UndefOr[String] = js.undefined
  var vaultLoginUrl: js.UndefOr[String] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    apiVersion: String = null,
    certFilePath: String = null,
    followAllRedirects: js.UndefOr[Boolean] = js.undefined,
    host: String = null,
    port: js.UndefOr[Double] = js.undefined,
    ssl: js.UndefOr[Boolean] = js.undefined,
    sslRejectUnAuthorized: js.UndefOr[Boolean] = js.undefined,
    vaultAppName: String = null,
    vaultLoginUrl: String = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (certFilePath != null) __obj.updateDynamic("certFilePath")(certFilePath.asInstanceOf[js.Any])
    if (!js.isUndefined(followAllRedirects)) __obj.updateDynamic("followAllRedirects")(followAllRedirects.get.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ssl)) __obj.updateDynamic("ssl")(ssl.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sslRejectUnAuthorized)) __obj.updateDynamic("sslRejectUnAuthorized")(sslRejectUnAuthorized.get.asInstanceOf[js.Any])
    if (vaultAppName != null) __obj.updateDynamic("vaultAppName")(vaultAppName.asInstanceOf[js.Any])
    if (vaultLoginUrl != null) __obj.updateDynamic("vaultLoginUrl")(vaultLoginUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

