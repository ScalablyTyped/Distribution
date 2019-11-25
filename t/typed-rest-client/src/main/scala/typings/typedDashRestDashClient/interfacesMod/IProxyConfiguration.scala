package typings.typedDashRestDashClient.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProxyConfiguration extends js.Object {
  var proxyBypassHosts: js.UndefOr[js.Array[String]] = js.undefined
  var proxyPassword: js.UndefOr[String] = js.undefined
  var proxyUrl: String
  var proxyUsername: js.UndefOr[String] = js.undefined
}

object IProxyConfiguration {
  @scala.inline
  def apply(
    proxyUrl: String,
    proxyBypassHosts: js.Array[String] = null,
    proxyPassword: String = null,
    proxyUsername: String = null
  ): IProxyConfiguration = {
    val __obj = js.Dynamic.literal(proxyUrl = proxyUrl.asInstanceOf[js.Any])
    if (proxyBypassHosts != null) __obj.updateDynamic("proxyBypassHosts")(proxyBypassHosts.asInstanceOf[js.Any])
    if (proxyPassword != null) __obj.updateDynamic("proxyPassword")(proxyPassword.asInstanceOf[js.Any])
    if (proxyUsername != null) __obj.updateDynamic("proxyUsername")(proxyUsername.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProxyConfiguration]
  }
}

