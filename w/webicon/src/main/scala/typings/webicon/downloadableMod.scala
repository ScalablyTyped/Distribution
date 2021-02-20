package typings.webicon

import typings.webicon.iconMod.Icon
import typings.webicon.urlConfigMod.UrlConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object downloadableMod {
  
  @js.native
  trait Downloadable[TUriParam] extends Icon {
    
    /**
      * An alias of the `url`-property.
      */
    var uri: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: this['url'] */ js.Any
      ] = js.native
    
    /**
      * The url to load the source from.
      */
    var url: js.UndefOr[UrlConfig[TUriParam]] = js.native
  }
  object Downloadable {
    
    @scala.inline
    def apply[TUriParam](): Downloadable[TUriParam] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Downloadable[TUriParam]]
    }
    
    @scala.inline
    implicit class DownloadableMutableBuilder[Self <: Downloadable[_], TUriParam] (val x: Self with Downloadable[TUriParam]) extends AnyVal {
      
      @scala.inline
      def setUri(value: /* import warning: importer.ImportType#apply Failed type conversion: this['url'] */ js.Any): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
      
      @scala.inline
      def setUrl(value: UrlConfig[TUriParam]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
