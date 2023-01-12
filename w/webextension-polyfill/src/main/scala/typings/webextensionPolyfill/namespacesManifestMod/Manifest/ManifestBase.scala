package typings.webextensionPolyfill.namespacesManifestMod.Manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Common properties for all manifest.json files
  */
trait ManifestBase extends StObject {
  
  /**
    * The applications property is deprecated, please use 'browser_specific_settings'
    * Optional.
    */
  var applications: js.UndefOr[BrowserSpecificSettings] = js.undefined
  
  /**
    * Optional.
    */
  var author: js.UndefOr[String] = js.undefined
  
  /**
    * Optional.
    */
  var browser_specific_settings: js.UndefOr[BrowserSpecificSettings] = js.undefined
  
  /**
    * Optional.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Optional.
    */
  var developer: js.UndefOr[ManifestBaseDeveloperType] = js.undefined
  
  /**
    * Optional.
    */
  var homepage_url: js.UndefOr[String] = js.undefined
  
  /**
    * Optional.
    */
  var install_origins: js.UndefOr[js.Array[String]] = js.undefined
  
  var manifest_version: Double
  
  var name: String
  
  /**
    * Optional.
    */
  var short_name: js.UndefOr[String] = js.undefined
  
  var version: String
  
  /**
    * In addition to the version field, which is used for update purposes, version_name can be set to a descriptive version
    * string and will be used for display purposes if present. If no version_name is present,
    * the version field will be used for display purposes as well.
    * Optional.
    */
  var version_name: js.UndefOr[String] = js.undefined
}
object ManifestBase {
  
  inline def apply(manifest_version: Double, name: String, version: String): ManifestBase = {
    val __obj = js.Dynamic.literal(manifest_version = manifest_version.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManifestBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ManifestBase] (val x: Self) extends AnyVal {
    
    inline def setApplications(value: BrowserSpecificSettings): Self = StObject.set(x, "applications", value.asInstanceOf[js.Any])
    
    inline def setApplicationsUndefined: Self = StObject.set(x, "applications", js.undefined)
    
    inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setBrowser_specific_settings(value: BrowserSpecificSettings): Self = StObject.set(x, "browser_specific_settings", value.asInstanceOf[js.Any])
    
    inline def setBrowser_specific_settingsUndefined: Self = StObject.set(x, "browser_specific_settings", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDeveloper(value: ManifestBaseDeveloperType): Self = StObject.set(x, "developer", value.asInstanceOf[js.Any])
    
    inline def setDeveloperUndefined: Self = StObject.set(x, "developer", js.undefined)
    
    inline def setHomepage_url(value: String): Self = StObject.set(x, "homepage_url", value.asInstanceOf[js.Any])
    
    inline def setHomepage_urlUndefined: Self = StObject.set(x, "homepage_url", js.undefined)
    
    inline def setInstall_origins(value: js.Array[String]): Self = StObject.set(x, "install_origins", value.asInstanceOf[js.Any])
    
    inline def setInstall_originsUndefined: Self = StObject.set(x, "install_origins", js.undefined)
    
    inline def setInstall_originsVarargs(value: String*): Self = StObject.set(x, "install_origins", js.Array(value*))
    
    inline def setManifest_version(value: Double): Self = StObject.set(x, "manifest_version", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setShort_name(value: String): Self = StObject.set(x, "short_name", value.asInstanceOf[js.Any])
    
    inline def setShort_nameUndefined: Self = StObject.set(x, "short_name", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersion_name(value: String): Self = StObject.set(x, "version_name", value.asInstanceOf[js.Any])
    
    inline def setVersion_nameUndefined: Self = StObject.set(x, "version_name", js.undefined)
  }
}
