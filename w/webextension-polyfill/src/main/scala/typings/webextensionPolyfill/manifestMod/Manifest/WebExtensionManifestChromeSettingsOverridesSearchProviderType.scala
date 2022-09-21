package typings.webextensionPolyfill.manifestMod.Manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebExtensionManifestChromeSettingsOverridesSearchProviderType extends StObject {
  
  /**
    * Encoding of the search term.
    * Optional.
    */
  var encoding: js.UndefOr[String] = js.undefined
  
  /**
    * Optional.
    */
  var favicon_url: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the default engine to a built-in engine only.
    * Optional.
    */
  var is_default: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional.
    */
  var keyword: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var name: String
  
  /**
    * A list of optional search url parameters. This allows the additon of search url parameters based on how the search is
    * performed in Firefox.
    * Optional.
    */
  var params: js.UndefOr[
    js.Array[WebExtensionManifestChromeSettingsOverridesSearchProviderParamsItemType]
  ] = js.undefined
  
  /**
    * Optional.
    */
  var search_form: js.UndefOr[String] = js.undefined
  
  var search_url: String
  
  /**
    * GET parameters to the search_url as a query string.
    * Optional.
    */
  var search_url_get_params: js.UndefOr[String] = js.undefined
  
  /**
    * POST parameters to the search_url as a query string.
    * Optional.
    */
  var search_url_post_params: js.UndefOr[String] = js.undefined
  
  /**
    * Optional.
    */
  var suggest_url: js.UndefOr[String] = js.undefined
  
  /**
    * GET parameters to the suggest_url as a query string.
    * Optional.
    */
  var suggest_url_get_params: js.UndefOr[String] = js.undefined
  
  /**
    * POST parameters to the suggest_url as a query string.
    * Optional.
    */
  var suggest_url_post_params: js.UndefOr[String] = js.undefined
}
object WebExtensionManifestChromeSettingsOverridesSearchProviderType {
  
  inline def apply(name: String, search_url: String): WebExtensionManifestChromeSettingsOverridesSearchProviderType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], search_url = search_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebExtensionManifestChromeSettingsOverridesSearchProviderType]
  }
  
  extension [Self <: WebExtensionManifestChromeSettingsOverridesSearchProviderType](x: Self) {
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setFavicon_url(value: String): Self = StObject.set(x, "favicon_url", value.asInstanceOf[js.Any])
    
    inline def setFavicon_urlUndefined: Self = StObject.set(x, "favicon_url", js.undefined)
    
    inline def setIs_default(value: Boolean): Self = StObject.set(x, "is_default", value.asInstanceOf[js.Any])
    
    inline def setIs_defaultUndefined: Self = StObject.set(x, "is_default", js.undefined)
    
    inline def setKeyword(value: String | js.Array[String]): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
    
    inline def setKeywordUndefined: Self = StObject.set(x, "keyword", js.undefined)
    
    inline def setKeywordVarargs(value: String*): Self = StObject.set(x, "keyword", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParams(value: js.Array[WebExtensionManifestChromeSettingsOverridesSearchProviderParamsItemType]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setParamsVarargs(value: WebExtensionManifestChromeSettingsOverridesSearchProviderParamsItemType*): Self = StObject.set(x, "params", js.Array(value*))
    
    inline def setSearch_form(value: String): Self = StObject.set(x, "search_form", value.asInstanceOf[js.Any])
    
    inline def setSearch_formUndefined: Self = StObject.set(x, "search_form", js.undefined)
    
    inline def setSearch_url(value: String): Self = StObject.set(x, "search_url", value.asInstanceOf[js.Any])
    
    inline def setSearch_url_get_params(value: String): Self = StObject.set(x, "search_url_get_params", value.asInstanceOf[js.Any])
    
    inline def setSearch_url_get_paramsUndefined: Self = StObject.set(x, "search_url_get_params", js.undefined)
    
    inline def setSearch_url_post_params(value: String): Self = StObject.set(x, "search_url_post_params", value.asInstanceOf[js.Any])
    
    inline def setSearch_url_post_paramsUndefined: Self = StObject.set(x, "search_url_post_params", js.undefined)
    
    inline def setSuggest_url(value: String): Self = StObject.set(x, "suggest_url", value.asInstanceOf[js.Any])
    
    inline def setSuggest_urlUndefined: Self = StObject.set(x, "suggest_url", js.undefined)
    
    inline def setSuggest_url_get_params(value: String): Self = StObject.set(x, "suggest_url_get_params", value.asInstanceOf[js.Any])
    
    inline def setSuggest_url_get_paramsUndefined: Self = StObject.set(x, "suggest_url_get_params", js.undefined)
    
    inline def setSuggest_url_post_params(value: String): Self = StObject.set(x, "suggest_url_post_params", value.asInstanceOf[js.Any])
    
    inline def setSuggest_url_post_paramsUndefined: Self = StObject.set(x, "suggest_url_post_params", js.undefined)
  }
}
