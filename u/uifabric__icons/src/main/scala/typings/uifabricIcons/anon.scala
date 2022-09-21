package typings.uifabricIcons

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait FontBaseUrl extends StObject {
    
    /**
      * Controls the base url of the font files. This is useful for scenarios where the fonts
      * are stored on a private CDN other than the default SharePoint CDN.
      */
    var fontBaseUrl: js.UndefOr[String] = js.undefined
    
    /**
      * Controls the base url of the icon font files. This is useful for scenarios where the icons
      * are stored on a private CDN other than the default SharePoint CDN. Note that in prior
      * iterations, `fontBaseUrl` was used to control both font and icon base urls. While you can
      * still use `fontBaseUrl` to provide a single base url for both, the `iconBaseUrl` will be
      * used first if available.
      */
    var iconBaseUrl: js.UndefOr[String] = js.undefined
  }
  object FontBaseUrl {
    
    inline def apply(): FontBaseUrl = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FontBaseUrl]
    }
    
    extension [Self <: FontBaseUrl](x: Self) {
      
      inline def setFontBaseUrl(value: String): Self = StObject.set(x, "fontBaseUrl", value.asInstanceOf[js.Any])
      
      inline def setFontBaseUrlUndefined: Self = StObject.set(x, "fontBaseUrl", js.undefined)
      
      inline def setIconBaseUrl(value: String): Self = StObject.set(x, "iconBaseUrl", value.asInstanceOf[js.Any])
      
      inline def setIconBaseUrlUndefined: Self = StObject.set(x, "iconBaseUrl", js.undefined)
    }
  }
}
