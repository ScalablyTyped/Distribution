package typings.webdriver.WebDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProxyObject extends js.Object {
  var ftpProxy: js.UndefOr[String] = js.native
  var ftpProxyPort: js.UndefOr[Double] = js.native
  var httpProxy: js.UndefOr[String] = js.native
  var httpProxyPort: js.UndefOr[Double] = js.native
  var proxyAutoconfigUrl: js.UndefOr[String] = js.native
  var proxyType: js.UndefOr[ProxyTypes] = js.native
  var socksPassword: js.UndefOr[String] = js.native
  var socksProxy: js.UndefOr[String] = js.native
  var socksProxyPort: js.UndefOr[Double] = js.native
  var socksUsername: js.UndefOr[String] = js.native
  var socksVersion: js.UndefOr[String] = js.native
  var sslProxy: js.UndefOr[String] = js.native
  var sslProxyPort: js.UndefOr[Double] = js.native
}

object ProxyObject {
  @scala.inline
  def apply(): ProxyObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProxyObject]
  }
  @scala.inline
  implicit class ProxyObjectOps[Self <: ProxyObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFtpProxy(value: String): Self = this.set("ftpProxy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFtpProxy: Self = this.set("ftpProxy", js.undefined)
    @scala.inline
    def setFtpProxyPort(value: Double): Self = this.set("ftpProxyPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFtpProxyPort: Self = this.set("ftpProxyPort", js.undefined)
    @scala.inline
    def setHttpProxy(value: String): Self = this.set("httpProxy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpProxy: Self = this.set("httpProxy", js.undefined)
    @scala.inline
    def setHttpProxyPort(value: Double): Self = this.set("httpProxyPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpProxyPort: Self = this.set("httpProxyPort", js.undefined)
    @scala.inline
    def setProxyAutoconfigUrl(value: String): Self = this.set("proxyAutoconfigUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxyAutoconfigUrl: Self = this.set("proxyAutoconfigUrl", js.undefined)
    @scala.inline
    def setProxyType(value: ProxyTypes): Self = this.set("proxyType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxyType: Self = this.set("proxyType", js.undefined)
    @scala.inline
    def setSocksPassword(value: String): Self = this.set("socksPassword", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSocksPassword: Self = this.set("socksPassword", js.undefined)
    @scala.inline
    def setSocksProxy(value: String): Self = this.set("socksProxy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSocksProxy: Self = this.set("socksProxy", js.undefined)
    @scala.inline
    def setSocksProxyPort(value: Double): Self = this.set("socksProxyPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSocksProxyPort: Self = this.set("socksProxyPort", js.undefined)
    @scala.inline
    def setSocksUsername(value: String): Self = this.set("socksUsername", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSocksUsername: Self = this.set("socksUsername", js.undefined)
    @scala.inline
    def setSocksVersion(value: String): Self = this.set("socksVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSocksVersion: Self = this.set("socksVersion", js.undefined)
    @scala.inline
    def setSslProxy(value: String): Self = this.set("sslProxy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSslProxy: Self = this.set("sslProxy", js.undefined)
    @scala.inline
    def setSslProxyPort(value: Double): Self = this.set("sslProxyPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSslProxyPort: Self = this.set("sslProxyPort", js.undefined)
  }
  
}

