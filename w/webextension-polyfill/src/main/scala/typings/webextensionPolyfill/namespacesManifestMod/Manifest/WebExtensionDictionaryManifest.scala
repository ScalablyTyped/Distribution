package typings.webextensionPolyfill.namespacesManifestMod.Manifest

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a WebExtension dictionary manifest.json file
  */
trait WebExtensionDictionaryManifest
  extends StObject
     with ManifestBase {
  
  var dictionaries: Record[String, String]
}
object WebExtensionDictionaryManifest {
  
  inline def apply(dictionaries: Record[String, String], manifest_version: Double, name: String, version: String): WebExtensionDictionaryManifest = {
    val __obj = js.Dynamic.literal(dictionaries = dictionaries.asInstanceOf[js.Any], manifest_version = manifest_version.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebExtensionDictionaryManifest]
  }
  
  extension [Self <: WebExtensionDictionaryManifest](x: Self) {
    
    inline def setDictionaries(value: Record[String, String]): Self = StObject.set(x, "dictionaries", value.asInstanceOf[js.Any])
  }
}
