package typings.webextensionPolyfill.manifestMod.Manifest

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebExtensionLangpackManifestLanguagesPatternType extends StObject {
  
  var chrome_resources: Record[String, ExtensionURL | (Record[String, ExtensionURL])]
  
  var version: String
}
object WebExtensionLangpackManifestLanguagesPatternType {
  
  inline def apply(chrome_resources: Record[String, ExtensionURL | (Record[String, ExtensionURL])], version: String): WebExtensionLangpackManifestLanguagesPatternType = {
    val __obj = js.Dynamic.literal(chrome_resources = chrome_resources.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebExtensionLangpackManifestLanguagesPatternType]
  }
  
  extension [Self <: WebExtensionLangpackManifestLanguagesPatternType](x: Self) {
    
    inline def setChrome_resources(value: Record[String, ExtensionURL | (Record[String, ExtensionURL])]): Self = StObject.set(x, "chrome_resources", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
