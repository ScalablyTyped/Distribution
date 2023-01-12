package typings.vhtml.mod.JSX

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebViewHTMLAttributes
  extends StObject
     with HTMLAttributes {
  
  var allowfullscreen: js.UndefOr[Boolean] = js.undefined
  
  var allowpopups: js.UndefOr[Boolean] = js.undefined
  
  var autofocus: js.UndefOr[Boolean] = js.undefined
  
  var autosize: js.UndefOr[Boolean] = js.undefined
  
  var blinkfeatures: js.UndefOr[String] = js.undefined
  
  var disableblinkfeatures: js.UndefOr[String] = js.undefined
  
  var disableguestresize: js.UndefOr[Boolean] = js.undefined
  
  var disablewebsecurity: js.UndefOr[Boolean] = js.undefined
  
  var guestinstance: js.UndefOr[String] = js.undefined
  
  var httpreferrer: js.UndefOr[String] = js.undefined
  
  var nodeintegration: js.UndefOr[Boolean] = js.undefined
  
  var partition: js.UndefOr[String] = js.undefined
  
  var plugins: js.UndefOr[Boolean] = js.undefined
  
  var preload: js.UndefOr[String] = js.undefined
  
  var src: js.UndefOr[String] = js.undefined
  
  var useragent: js.UndefOr[String] = js.undefined
  
  var webpreferences: js.UndefOr[String] = js.undefined
}
object WebViewHTMLAttributes {
  
  inline def apply(): WebViewHTMLAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebViewHTMLAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebViewHTMLAttributes] (val x: Self) extends AnyVal {
    
    inline def setAllowfullscreen(value: Boolean): Self = StObject.set(x, "allowfullscreen", value.asInstanceOf[js.Any])
    
    inline def setAllowfullscreenUndefined: Self = StObject.set(x, "allowfullscreen", js.undefined)
    
    inline def setAllowpopups(value: Boolean): Self = StObject.set(x, "allowpopups", value.asInstanceOf[js.Any])
    
    inline def setAllowpopupsUndefined: Self = StObject.set(x, "allowpopups", js.undefined)
    
    inline def setAutofocus(value: Boolean): Self = StObject.set(x, "autofocus", value.asInstanceOf[js.Any])
    
    inline def setAutofocusUndefined: Self = StObject.set(x, "autofocus", js.undefined)
    
    inline def setAutosize(value: Boolean): Self = StObject.set(x, "autosize", value.asInstanceOf[js.Any])
    
    inline def setAutosizeUndefined: Self = StObject.set(x, "autosize", js.undefined)
    
    inline def setBlinkfeatures(value: String): Self = StObject.set(x, "blinkfeatures", value.asInstanceOf[js.Any])
    
    inline def setBlinkfeaturesUndefined: Self = StObject.set(x, "blinkfeatures", js.undefined)
    
    inline def setDisableblinkfeatures(value: String): Self = StObject.set(x, "disableblinkfeatures", value.asInstanceOf[js.Any])
    
    inline def setDisableblinkfeaturesUndefined: Self = StObject.set(x, "disableblinkfeatures", js.undefined)
    
    inline def setDisableguestresize(value: Boolean): Self = StObject.set(x, "disableguestresize", value.asInstanceOf[js.Any])
    
    inline def setDisableguestresizeUndefined: Self = StObject.set(x, "disableguestresize", js.undefined)
    
    inline def setDisablewebsecurity(value: Boolean): Self = StObject.set(x, "disablewebsecurity", value.asInstanceOf[js.Any])
    
    inline def setDisablewebsecurityUndefined: Self = StObject.set(x, "disablewebsecurity", js.undefined)
    
    inline def setGuestinstance(value: String): Self = StObject.set(x, "guestinstance", value.asInstanceOf[js.Any])
    
    inline def setGuestinstanceUndefined: Self = StObject.set(x, "guestinstance", js.undefined)
    
    inline def setHttpreferrer(value: String): Self = StObject.set(x, "httpreferrer", value.asInstanceOf[js.Any])
    
    inline def setHttpreferrerUndefined: Self = StObject.set(x, "httpreferrer", js.undefined)
    
    inline def setNodeintegration(value: Boolean): Self = StObject.set(x, "nodeintegration", value.asInstanceOf[js.Any])
    
    inline def setNodeintegrationUndefined: Self = StObject.set(x, "nodeintegration", js.undefined)
    
    inline def setPartition(value: String): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
    
    inline def setPartitionUndefined: Self = StObject.set(x, "partition", js.undefined)
    
    inline def setPlugins(value: Boolean): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    inline def setPreload(value: String): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
    
    inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    inline def setUseragent(value: String): Self = StObject.set(x, "useragent", value.asInstanceOf[js.Any])
    
    inline def setUseragentUndefined: Self = StObject.set(x, "useragent", js.undefined)
    
    inline def setWebpreferences(value: String): Self = StObject.set(x, "webpreferences", value.asInstanceOf[js.Any])
    
    inline def setWebpreferencesUndefined: Self = StObject.set(x, "webpreferences", js.undefined)
  }
}
