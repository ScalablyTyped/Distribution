package typings.webextensionPolyfill.namespacesManifestMod.Manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebExtensionManifestDeclarativeNetRequestRuleResourcesItemType extends StObject {
  
  /**
    * Whether the ruleset is enabled by default.
    */
  var enabled: Boolean
  
  /**
    * A non-empty string uniquely identifying the ruleset. IDs beginning with '_' are reserved for internal use.
    */
  var id: String
  
  /**
    * The path of the JSON ruleset relative to the extension directory.
    */
  var path: ExtensionURL
}
object WebExtensionManifestDeclarativeNetRequestRuleResourcesItemType {
  
  inline def apply(enabled: Boolean, id: String, path: ExtensionURL): WebExtensionManifestDeclarativeNetRequestRuleResourcesItemType = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebExtensionManifestDeclarativeNetRequestRuleResourcesItemType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebExtensionManifestDeclarativeNetRequestRuleResourcesItemType] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPath(value: ExtensionURL): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
