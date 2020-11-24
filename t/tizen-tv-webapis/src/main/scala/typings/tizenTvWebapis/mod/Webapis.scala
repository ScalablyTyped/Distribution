package typings.tizenTvWebapis.mod

import typings.tizenTvWebapis.adinfoMod.AdInfoManager
import typings.tizenTvWebapis.appcommonMod.AppCommonManager
import typings.tizenTvWebapis.avinfoMod.AVInfoManager
import typings.tizenTvWebapis.avplayMod.AVPlayManager
import typings.tizenTvWebapis.avplaystoreMod.AVPlayStoreManager
import typings.tizenTvWebapis.billingMod.BillingManager
import typings.tizenTvWebapis.networkMod.NetworkManager
import typings.tizenTvWebapis.productinfoMod.ProductInfoManager
import typings.tizenTvWebapis.ssoMod.SsoManager
import typings.tizenTvWebapis.tvinfoMod.TvInfoManager
import typings.tizenTvWebapis.webapisMod.WebAPIException
import typings.tizenTvWebapis.widgetdataMod.WidgetDataManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Webapis extends js.Object {
  
  var WebAPIException: typings.tizenTvWebapis.webapisMod.WebAPIException = js.native
  
  var adinfo: AdInfoManager = js.native
  
  var appcommon: AppCommonManager = js.native
  
  var avinfo: AVInfoManager = js.native
  
  var avplay: AVPlayManager = js.native
  
  var avplaystore: AVPlayStoreManager = js.native
  
  var billing: BillingManager = js.native
  
  var network: NetworkManager = js.native
  
  var productinfo: ProductInfoManager = js.native
  
  var sso: SsoManager = js.native
  
  var tvinfo: TvInfoManager = js.native
  
  var widgetdata: WidgetDataManager = js.native
}
object Webapis {
  
  @scala.inline
  def apply(
    WebAPIException: WebAPIException,
    adinfo: AdInfoManager,
    appcommon: AppCommonManager,
    avinfo: AVInfoManager,
    avplay: AVPlayManager,
    avplaystore: AVPlayStoreManager,
    billing: BillingManager,
    network: NetworkManager,
    productinfo: ProductInfoManager,
    sso: SsoManager,
    tvinfo: TvInfoManager,
    widgetdata: WidgetDataManager
  ): Webapis = {
    val __obj = js.Dynamic.literal(WebAPIException = WebAPIException.asInstanceOf[js.Any], adinfo = adinfo.asInstanceOf[js.Any], appcommon = appcommon.asInstanceOf[js.Any], avinfo = avinfo.asInstanceOf[js.Any], avplay = avplay.asInstanceOf[js.Any], avplaystore = avplaystore.asInstanceOf[js.Any], billing = billing.asInstanceOf[js.Any], network = network.asInstanceOf[js.Any], productinfo = productinfo.asInstanceOf[js.Any], sso = sso.asInstanceOf[js.Any], tvinfo = tvinfo.asInstanceOf[js.Any], widgetdata = widgetdata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Webapis]
  }
  
  @scala.inline
  implicit class WebapisOps[Self <: Webapis] (val x: Self) extends AnyVal {
    
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
    def setWebAPIException(value: WebAPIException): Self = this.set("WebAPIException", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdinfo(value: AdInfoManager): Self = this.set("adinfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppcommon(value: AppCommonManager): Self = this.set("appcommon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvinfo(value: AVInfoManager): Self = this.set("avinfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvplay(value: AVPlayManager): Self = this.set("avplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvplaystore(value: AVPlayStoreManager): Self = this.set("avplaystore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBilling(value: BillingManager): Self = this.set("billing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetwork(value: NetworkManager): Self = this.set("network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductinfo(value: ProductInfoManager): Self = this.set("productinfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSso(value: SsoManager): Self = this.set("sso", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTvinfo(value: TvInfoManager): Self = this.set("tvinfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidgetdata(value: WidgetDataManager): Self = this.set("widgetdata", value.asInstanceOf[js.Any])
  }
}
