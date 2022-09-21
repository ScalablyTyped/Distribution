package typings.webextensionPolyfill.manifestMod.Manifest

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a WebExtension language pack manifest.json file
  */
trait WebExtensionLangpackManifest
  extends StObject
     with ManifestBase {
  
  var langpack_id: String
  
  var languages: Record[String, WebExtensionLangpackManifestLanguagesPatternType]
  
  /**
    * Optional.
    */
  var sources: js.UndefOr[Record[String, WebExtensionLangpackManifestSourcesPatternType]] = js.undefined
}
object WebExtensionLangpackManifest {
  
  inline def apply(
    langpack_id: String,
    languages: Record[String, WebExtensionLangpackManifestLanguagesPatternType],
    manifest_version: Double,
    name: String,
    version: String
  ): WebExtensionLangpackManifest = {
    val __obj = js.Dynamic.literal(langpack_id = langpack_id.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], manifest_version = manifest_version.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebExtensionLangpackManifest]
  }
  
  extension [Self <: WebExtensionLangpackManifest](x: Self) {
    
    inline def setLangpack_id(value: String): Self = StObject.set(x, "langpack_id", value.asInstanceOf[js.Any])
    
    inline def setLanguages(value: Record[String, WebExtensionLangpackManifestLanguagesPatternType]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
    
    inline def setSources(value: Record[String, WebExtensionLangpackManifestSourcesPatternType]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
  }
}
