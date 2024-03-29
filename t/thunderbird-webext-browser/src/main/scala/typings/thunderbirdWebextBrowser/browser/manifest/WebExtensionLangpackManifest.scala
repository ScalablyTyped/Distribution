package typings.thunderbirdWebextBrowser.browser.manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebExtensionLangpackManifest extends StObject {
  
  /**
    * The applications property is deprecated, please use
    * 'browser_specific_settings'
    *
    * Not supported on manifest versions above 2.
    */
  var applications: js.UndefOr[BrowserSpecificSettings] = js.undefined
  
  var author: js.UndefOr[String] = js.undefined
  
  var browser_specific_settings: js.UndefOr[BrowserSpecificSettings] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var developer: js.UndefOr[WebExtensionLangpackManifestDeveloper] = js.undefined
  
  var homepage_url: js.UndefOr[String] = js.undefined
  
  var install_origins: js.UndefOr[js.Array[String]] = js.undefined
  
  var langpack_id: String
  
  var languages: WebExtensionLangpackManifestLanguages
  
  var manifest_version: Double
  
  var name: String
  
  var short_name: js.UndefOr[String] = js.undefined
  
  var sources: js.UndefOr[WebExtensionLangpackManifestSources] = js.undefined
  
  var version: String
}
object WebExtensionLangpackManifest {
  
  inline def apply(
    langpack_id: String,
    languages: WebExtensionLangpackManifestLanguages,
    manifest_version: Double,
    name: String,
    version: String
  ): WebExtensionLangpackManifest = {
    val __obj = js.Dynamic.literal(langpack_id = langpack_id.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], manifest_version = manifest_version.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebExtensionLangpackManifest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebExtensionLangpackManifest] (val x: Self) extends AnyVal {
    
    inline def setApplications(value: BrowserSpecificSettings): Self = StObject.set(x, "applications", value.asInstanceOf[js.Any])
    
    inline def setApplicationsUndefined: Self = StObject.set(x, "applications", js.undefined)
    
    inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setBrowser_specific_settings(value: BrowserSpecificSettings): Self = StObject.set(x, "browser_specific_settings", value.asInstanceOf[js.Any])
    
    inline def setBrowser_specific_settingsUndefined: Self = StObject.set(x, "browser_specific_settings", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDeveloper(value: WebExtensionLangpackManifestDeveloper): Self = StObject.set(x, "developer", value.asInstanceOf[js.Any])
    
    inline def setDeveloperUndefined: Self = StObject.set(x, "developer", js.undefined)
    
    inline def setHomepage_url(value: String): Self = StObject.set(x, "homepage_url", value.asInstanceOf[js.Any])
    
    inline def setHomepage_urlUndefined: Self = StObject.set(x, "homepage_url", js.undefined)
    
    inline def setInstall_origins(value: js.Array[String]): Self = StObject.set(x, "install_origins", value.asInstanceOf[js.Any])
    
    inline def setInstall_originsUndefined: Self = StObject.set(x, "install_origins", js.undefined)
    
    inline def setInstall_originsVarargs(value: String*): Self = StObject.set(x, "install_origins", js.Array(value*))
    
    inline def setLangpack_id(value: String): Self = StObject.set(x, "langpack_id", value.asInstanceOf[js.Any])
    
    inline def setLanguages(value: WebExtensionLangpackManifestLanguages): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
    
    inline def setManifest_version(value: Double): Self = StObject.set(x, "manifest_version", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setShort_name(value: String): Self = StObject.set(x, "short_name", value.asInstanceOf[js.Any])
    
    inline def setShort_nameUndefined: Self = StObject.set(x, "short_name", js.undefined)
    
    inline def setSources(value: WebExtensionLangpackManifestSources): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
