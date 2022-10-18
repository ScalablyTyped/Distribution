package typings.webextensionPolyfill.namespacesManifestMod.Manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebExtensionManifestOmniboxType extends StObject {
  
  var keyword: String
}
object WebExtensionManifestOmniboxType {
  
  inline def apply(keyword: String): WebExtensionManifestOmniboxType = {
    val __obj = js.Dynamic.literal(keyword = keyword.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebExtensionManifestOmniboxType]
  }
  
  extension [Self <: WebExtensionManifestOmniboxType](x: Self) {
    
    inline def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
  }
}
