package typings.thunderbirdWebextBrowser.messenger.manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebExtensionLangpackManifestDeveloper extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object WebExtensionLangpackManifestDeveloper {
  
  inline def apply(): WebExtensionLangpackManifestDeveloper = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebExtensionLangpackManifestDeveloper]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebExtensionLangpackManifestDeveloper] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
