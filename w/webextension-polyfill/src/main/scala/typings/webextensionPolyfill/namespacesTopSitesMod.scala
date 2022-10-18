package typings.webextensionPolyfill

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object namespacesTopSitesMod {
  
  object TopSites {
    
    trait GetOptionsType extends StObject {
      
      /**
        * Include sites that the user has blocked from appearing on the Firefox new tab.
        * Optional.
        */
      var includeBlocked: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Include sites favicon if available.
        * Optional.
        */
      var includeFavicon: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Include sites that the user has pinned on the Firefox new tab.
        * Optional.
        */
      var includePinned: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Include search shortcuts appearing on the Firefox new tab.
        * Optional.
        */
      var includeSearchShortcuts: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The number of top sites to return, defaults to the value used by Firefox
        * Optional.
        */
      var limit: js.UndefOr[Double] = js.undefined
      
      /**
        * Return the sites that exactly appear on the user's new-tab page. When true, all other options are ignored except limit
        * and includeFavicon. If the user disabled newtab Top Sites, the newtab parameter will be ignored.
        * Optional.
        */
      var newtab: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Limit the result to a single top site link per domain
        * Optional.
        */
      var onePerDomain: js.UndefOr[Boolean] = js.undefined
    }
    object GetOptionsType {
      
      inline def apply(): GetOptionsType = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GetOptionsType]
      }
      
      extension [Self <: GetOptionsType](x: Self) {
        
        inline def setIncludeBlocked(value: Boolean): Self = StObject.set(x, "includeBlocked", value.asInstanceOf[js.Any])
        
        inline def setIncludeBlockedUndefined: Self = StObject.set(x, "includeBlocked", js.undefined)
        
        inline def setIncludeFavicon(value: Boolean): Self = StObject.set(x, "includeFavicon", value.asInstanceOf[js.Any])
        
        inline def setIncludeFaviconUndefined: Self = StObject.set(x, "includeFavicon", js.undefined)
        
        inline def setIncludePinned(value: Boolean): Self = StObject.set(x, "includePinned", value.asInstanceOf[js.Any])
        
        inline def setIncludePinnedUndefined: Self = StObject.set(x, "includePinned", js.undefined)
        
        inline def setIncludeSearchShortcuts(value: Boolean): Self = StObject.set(x, "includeSearchShortcuts", value.asInstanceOf[js.Any])
        
        inline def setIncludeSearchShortcutsUndefined: Self = StObject.set(x, "includeSearchShortcuts", js.undefined)
        
        inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
        
        inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
        
        inline def setNewtab(value: Boolean): Self = StObject.set(x, "newtab", value.asInstanceOf[js.Any])
        
        inline def setNewtabUndefined: Self = StObject.set(x, "newtab", js.undefined)
        
        inline def setOnePerDomain(value: Boolean): Self = StObject.set(x, "onePerDomain", value.asInstanceOf[js.Any])
        
        inline def setOnePerDomainUndefined: Self = StObject.set(x, "onePerDomain", js.undefined)
      }
    }
    
    /**
      * An object encapsulating a most visited URL, such as the URLs on the new tab page.
      */
    trait MostVisitedURL extends StObject {
      
      /**
        * Data URL for the favicon, if available.
        * Optional.
        */
      var favicon: js.UndefOr[String] = js.undefined
      
      /**
        * The title of the page.
        * Optional.
        */
      var title: js.UndefOr[String] = js.undefined
      
      /**
        * The entry type, either <code>url</code> for a normal page link, or <code>search</code> for a search shortcut.
        * Optional.
        */
      var `type`: js.UndefOr[MostVisitedURLTypeEnum] = js.undefined
      
      /**
        * The most visited URL.
        */
      var url: String
    }
    object MostVisitedURL {
      
      inline def apply(url: String): MostVisitedURL = {
        val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[MostVisitedURL]
      }
      
      extension [Self <: MostVisitedURL](x: Self) {
        
        inline def setFavicon(value: String): Self = StObject.set(x, "favicon", value.asInstanceOf[js.Any])
        
        inline def setFaviconUndefined: Self = StObject.set(x, "favicon", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        inline def setType(value: MostVisitedURLTypeEnum): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The entry type, either <code>url</code> for a normal page link, or <code>search</code> for a search shortcut.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.webextensionPolyfill.webextensionPolyfillStrings.url
      - typings.webextensionPolyfill.webextensionPolyfillStrings.search
    */
    trait MostVisitedURLTypeEnum extends StObject
    object MostVisitedURLTypeEnum {
      
      inline def search: typings.webextensionPolyfill.webextensionPolyfillStrings.search = "search".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.search]
      
      inline def url: typings.webextensionPolyfill.webextensionPolyfillStrings.url = "url".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.url]
    }
    
    @js.native
    trait Static extends StObject {
      
      /**
        * Gets a list of top sites.
        *
        * @param options Optional.
        */
      def get(): js.Promise[js.Array[MostVisitedURL]] = js.native
      def get(options: GetOptionsType): js.Promise[js.Array[MostVisitedURL]] = js.native
    }
  }
}
