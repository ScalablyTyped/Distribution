package typings.tizenTvWebapis

import org.scalablytyped.runtime.Shortcut
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("tizen-tv-webapis", JSImport.Namespace)
  @js.native
  val ^ : Webapis = js.native
  
  object global {
    
    @JSGlobal("webapis")
    @js.native
    val webapis: Webapis = js.native
    
    @js.native
    trait Window extends StObject {
      
      var webapis: Webapis = js.native
    }
    object Window {
      
      @scala.inline
      def apply(webapis: Webapis): Window = {
        val __obj = js.Dynamic.literal(webapis = webapis.asInstanceOf[js.Any])
        __obj.asInstanceOf[Window]
      }
      
      @scala.inline
      implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setWebapis(value: Webapis): Self = StObject.set(x, "webapis", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @js.native
  trait Webapis extends StObject {
    
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
    implicit class WebapisMutableBuilder[Self <: Webapis] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdinfo(value: AdInfoManager): Self = StObject.set(x, "adinfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppcommon(value: AppCommonManager): Self = StObject.set(x, "appcommon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvinfo(value: AVInfoManager): Self = StObject.set(x, "avinfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvplay(value: AVPlayManager): Self = StObject.set(x, "avplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvplaystore(value: AVPlayStoreManager): Self = StObject.set(x, "avplaystore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBilling(value: BillingManager): Self = StObject.set(x, "billing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetwork(value: NetworkManager): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProductinfo(value: ProductInfoManager): Self = StObject.set(x, "productinfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSso(value: SsoManager): Self = StObject.set(x, "sso", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTvinfo(value: TvInfoManager): Self = StObject.set(x, "tvinfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebAPIException(value: WebAPIException): Self = StObject.set(x, "WebAPIException", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidgetdata(value: WidgetDataManager): Self = StObject.set(x, "widgetdata", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Webapis
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Webapis = ^
}
