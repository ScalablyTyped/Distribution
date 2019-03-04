package typings
package vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProxyConfiguration extends js.Object {
  var proxyBypassHosts: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var proxyPassword: js.UndefOr[java.lang.String] = js.undefined
  var proxyUrl: java.lang.String
  var proxyUsername: js.UndefOr[java.lang.String] = js.undefined
}

object IProxyConfiguration {
  @scala.inline
  def apply(
    proxyUrl: java.lang.String,
    proxyBypassHosts: js.Array[java.lang.String] = null,
    proxyPassword: java.lang.String = null,
    proxyUsername: java.lang.String = null
  ): IProxyConfiguration = {
    val __obj = js.Dynamic.literal(proxyUrl = proxyUrl)
    if (proxyBypassHosts != null) __obj.updateDynamic("proxyBypassHosts")(proxyBypassHosts)
    if (proxyPassword != null) __obj.updateDynamic("proxyPassword")(proxyPassword)
    if (proxyUsername != null) __obj.updateDynamic("proxyUsername")(proxyUsername)
    __obj.asInstanceOf[IProxyConfiguration]
  }
}

