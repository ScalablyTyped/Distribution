package typings.uiBox

import typings.uiBox.anon.SafeHref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsSafeHrefMod {
  
  @JSImport("ui-box/dist/src/utils/safeHref", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def configureSafeHref(configObject: SafeHrefConfigObj): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configureSafeHref")(configObject.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def extractAnchorProps(href: String, rel: String): SafeHref = (^.asInstanceOf[js.Dynamic].applyDynamic("extractAnchorProps")(href.asInstanceOf[js.Any], rel.asInstanceOf[js.Any])).asInstanceOf[SafeHref]
  
  inline def getURLInfo(url: String): URLInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("getURLInfo")(url.asInstanceOf[js.Any]).asInstanceOf[URLInfo]
  
  inline def getUseSafeHref(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getUseSafeHref")().asInstanceOf[Boolean]
  
  trait SafeHrefConfigObj extends StObject {
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var origin: js.UndefOr[String] = js.undefined
  }
  object SafeHrefConfigObj {
    
    inline def apply(): SafeHrefConfigObj = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SafeHrefConfigObj]
    }
    
    extension [Self <: SafeHrefConfigObj](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    }
  }
  
  trait URLInfo extends StObject {
    
    var sameOrigin: Boolean
    
    var url: js.UndefOr[String] = js.undefined
  }
  object URLInfo {
    
    inline def apply(sameOrigin: Boolean): URLInfo = {
      val __obj = js.Dynamic.literal(sameOrigin = sameOrigin.asInstanceOf[js.Any])
      __obj.asInstanceOf[URLInfo]
    }
    
    extension [Self <: URLInfo](x: Self) {
      
      inline def setSameOrigin(value: Boolean): Self = StObject.set(x, "sameOrigin", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
