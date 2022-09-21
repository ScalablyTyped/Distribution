package typings.tizenTvWebapis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Webapis extends StObject {
  
  var WebAPIException: typings.tizenTvWebapis.mod.WebAPIException
  
  var adinfo: AdInfoManager
  
  var appcommon: AppCommonManager
  
  var avinfo: AvInfoManager
  
  var avplay: AVPlayManager
  
  var avplaystore: AVPlayStoreManager
  
  var billing: BillingManager
  
  var network: NetworkManager
  
  var productinfo: ProductInfoManager
  
  var sso: SsoManager
  
  var systeminfo: SystemInfoManager
  
  var tvinfo: TvInfoManager
  
  var widgetdata: WidgetDataManager
}
object Webapis {
  
  inline def apply(
    WebAPIException: WebAPIException,
    adinfo: AdInfoManager,
    appcommon: AppCommonManager,
    avinfo: AvInfoManager,
    avplay: AVPlayManager,
    avplaystore: AVPlayStoreManager,
    billing: BillingManager,
    network: NetworkManager,
    productinfo: ProductInfoManager,
    sso: SsoManager,
    systeminfo: SystemInfoManager,
    tvinfo: TvInfoManager,
    widgetdata: WidgetDataManager
  ): Webapis = {
    val __obj = js.Dynamic.literal(WebAPIException = WebAPIException.asInstanceOf[js.Any], adinfo = adinfo.asInstanceOf[js.Any], appcommon = appcommon.asInstanceOf[js.Any], avinfo = avinfo.asInstanceOf[js.Any], avplay = avplay.asInstanceOf[js.Any], avplaystore = avplaystore.asInstanceOf[js.Any], billing = billing.asInstanceOf[js.Any], network = network.asInstanceOf[js.Any], productinfo = productinfo.asInstanceOf[js.Any], sso = sso.asInstanceOf[js.Any], systeminfo = systeminfo.asInstanceOf[js.Any], tvinfo = tvinfo.asInstanceOf[js.Any], widgetdata = widgetdata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Webapis]
  }
  
  extension [Self <: Webapis](x: Self) {
    
    inline def setAdinfo(value: AdInfoManager): Self = StObject.set(x, "adinfo", value.asInstanceOf[js.Any])
    
    inline def setAppcommon(value: AppCommonManager): Self = StObject.set(x, "appcommon", value.asInstanceOf[js.Any])
    
    inline def setAvinfo(value: AvInfoManager): Self = StObject.set(x, "avinfo", value.asInstanceOf[js.Any])
    
    inline def setAvplay(value: AVPlayManager): Self = StObject.set(x, "avplay", value.asInstanceOf[js.Any])
    
    inline def setAvplaystore(value: AVPlayStoreManager): Self = StObject.set(x, "avplaystore", value.asInstanceOf[js.Any])
    
    inline def setBilling(value: BillingManager): Self = StObject.set(x, "billing", value.asInstanceOf[js.Any])
    
    inline def setNetwork(value: NetworkManager): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setProductinfo(value: ProductInfoManager): Self = StObject.set(x, "productinfo", value.asInstanceOf[js.Any])
    
    inline def setSso(value: SsoManager): Self = StObject.set(x, "sso", value.asInstanceOf[js.Any])
    
    inline def setSysteminfo(value: SystemInfoManager): Self = StObject.set(x, "systeminfo", value.asInstanceOf[js.Any])
    
    inline def setTvinfo(value: TvInfoManager): Self = StObject.set(x, "tvinfo", value.asInstanceOf[js.Any])
    
    inline def setWebAPIException(value: WebAPIException): Self = StObject.set(x, "WebAPIException", value.asInstanceOf[js.Any])
    
    inline def setWidgetdata(value: WidgetDataManager): Self = StObject.set(x, "widgetdata", value.asInstanceOf[js.Any])
  }
}
