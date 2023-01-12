package typings.webicon

import typings.webicon.iconIconMod.Icon
import typings.webicon.webUrlConfigMod.UrlConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconOptionsDownloadableMod {
  
  trait Downloadable[TUriParam]
    extends StObject
       with Icon {
    
    /**
      * An alias of the `url`-property.
      */
    var uri: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: this['url'] */ js.Any
      ] = js.undefined
    
    /**
      * The url to load the source from.
      */
    var url: js.UndefOr[UrlConfig[TUriParam]] = js.undefined
  }
  object Downloadable {
    
    inline def apply[TUriParam](): Downloadable[TUriParam] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Downloadable[TUriParam]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Downloadable[?], TUriParam] (val x: Self & Downloadable[TUriParam]) extends AnyVal {
      
      inline def setUri(value: /* import warning: importer.ImportType#apply Failed type conversion: this['url'] */ js.Any): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
      
      inline def setUrl(value: UrlConfig[TUriParam]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
