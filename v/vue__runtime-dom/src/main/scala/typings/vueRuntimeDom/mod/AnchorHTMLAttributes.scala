package typings.vueRuntimeDom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnchorHTMLAttributes
  extends StObject
     with HTMLAttributes {
  
  var download: js.UndefOr[Any] = js.undefined
  
  var href: js.UndefOr[String] = js.undefined
  
  var hreflang: js.UndefOr[String] = js.undefined
  
  var media: js.UndefOr[String] = js.undefined
  
  var ping: js.UndefOr[String] = js.undefined
  
  var referrerpolicy: js.UndefOr[String] = js.undefined
  
  var rel: js.UndefOr[String] = js.undefined
  
  var target: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object AnchorHTMLAttributes {
  
  inline def apply(): AnchorHTMLAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnchorHTMLAttributes]
  }
  
  extension [Self <: AnchorHTMLAttributes](x: Self) {
    
    inline def setDownload(value: Any): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
    
    inline def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    inline def setHreflang(value: String): Self = StObject.set(x, "hreflang", value.asInstanceOf[js.Any])
    
    inline def setHreflangUndefined: Self = StObject.set(x, "hreflang", js.undefined)
    
    inline def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    inline def setPing(value: String): Self = StObject.set(x, "ping", value.asInstanceOf[js.Any])
    
    inline def setPingUndefined: Self = StObject.set(x, "ping", js.undefined)
    
    inline def setReferrerpolicy(value: String): Self = StObject.set(x, "referrerpolicy", value.asInstanceOf[js.Any])
    
    inline def setReferrerpolicyUndefined: Self = StObject.set(x, "referrerpolicy", js.undefined)
    
    inline def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
    
    inline def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
