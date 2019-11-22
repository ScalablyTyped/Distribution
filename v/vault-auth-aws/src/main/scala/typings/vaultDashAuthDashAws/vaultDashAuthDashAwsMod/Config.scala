package typings.vaultDashAuthDashAws.vaultDashAuthDashAwsMod

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
    port: Int | Double = null,
    ssl: js.UndefOr[Boolean] = js.undefined,
    sslRejectUnAuthorized: js.UndefOr[Boolean] = js.undefined,
    vaultAppName: String = null,
    vaultLoginUrl: String = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion)
    if (certFilePath != null) __obj.updateDynamic("certFilePath")(certFilePath)
    if (!js.isUndefined(followAllRedirects)) __obj.updateDynamic("followAllRedirects")(followAllRedirects)
    if (host != null) __obj.updateDynamic("host")(host)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(ssl)) __obj.updateDynamic("ssl")(ssl)
    if (!js.isUndefined(sslRejectUnAuthorized)) __obj.updateDynamic("sslRejectUnAuthorized")(sslRejectUnAuthorized)
    if (vaultAppName != null) __obj.updateDynamic("vaultAppName")(vaultAppName)
    if (vaultLoginUrl != null) __obj.updateDynamic("vaultLoginUrl")(vaultLoginUrl)
    __obj.asInstanceOf[Config]
  }
}

