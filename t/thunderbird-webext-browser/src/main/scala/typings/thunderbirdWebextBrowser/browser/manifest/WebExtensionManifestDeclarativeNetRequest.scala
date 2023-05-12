package typings.thunderbirdWebextBrowser.browser.manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebExtensionManifestDeclarativeNetRequest extends StObject {
  
  var rule_resources: js.Array[WebExtensionManifestDeclarativeNetRequestRuleResources]
}
object WebExtensionManifestDeclarativeNetRequest {
  
  inline def apply(rule_resources: js.Array[WebExtensionManifestDeclarativeNetRequestRuleResources]): WebExtensionManifestDeclarativeNetRequest = {
    val __obj = js.Dynamic.literal(rule_resources = rule_resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebExtensionManifestDeclarativeNetRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebExtensionManifestDeclarativeNetRequest] (val x: Self) extends AnyVal {
    
    inline def setRule_resources(value: js.Array[WebExtensionManifestDeclarativeNetRequestRuleResources]): Self = StObject.set(x, "rule_resources", value.asInstanceOf[js.Any])
    
    inline def setRule_resourcesVarargs(value: WebExtensionManifestDeclarativeNetRequestRuleResources*): Self = StObject.set(x, "rule_resources", js.Array(value*))
  }
}
