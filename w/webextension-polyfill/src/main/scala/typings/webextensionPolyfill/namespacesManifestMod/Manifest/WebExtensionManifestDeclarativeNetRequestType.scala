package typings.webextensionPolyfill.namespacesManifestMod.Manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebExtensionManifestDeclarativeNetRequestType extends StObject {
  
  var rule_resources: js.Array[WebExtensionManifestDeclarativeNetRequestRuleResourcesItemType]
}
object WebExtensionManifestDeclarativeNetRequestType {
  
  inline def apply(rule_resources: js.Array[WebExtensionManifestDeclarativeNetRequestRuleResourcesItemType]): WebExtensionManifestDeclarativeNetRequestType = {
    val __obj = js.Dynamic.literal(rule_resources = rule_resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebExtensionManifestDeclarativeNetRequestType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebExtensionManifestDeclarativeNetRequestType] (val x: Self) extends AnyVal {
    
    inline def setRule_resources(value: js.Array[WebExtensionManifestDeclarativeNetRequestRuleResourcesItemType]): Self = StObject.set(x, "rule_resources", value.asInstanceOf[js.Any])
    
    inline def setRule_resourcesVarargs(value: WebExtensionManifestDeclarativeNetRequestRuleResourcesItemType*): Self = StObject.set(x, "rule_resources", js.Array(value*))
  }
}
