package typings.webextensionPolyfill.manifestMod.Manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebExtensionManifestWebAccessibleResourcesC2ItemType extends StObject {
  
  var matches: js.Array[MatchPatternRestricted]
  
  var resources: js.Array[String]
}
object WebExtensionManifestWebAccessibleResourcesC2ItemType {
  
  inline def apply(matches: js.Array[MatchPatternRestricted], resources: js.Array[String]): WebExtensionManifestWebAccessibleResourcesC2ItemType = {
    val __obj = js.Dynamic.literal(matches = matches.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebExtensionManifestWebAccessibleResourcesC2ItemType]
  }
  
  extension [Self <: WebExtensionManifestWebAccessibleResourcesC2ItemType](x: Self) {
    
    inline def setMatches(value: js.Array[MatchPatternRestricted]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    inline def setMatchesVarargs(value: MatchPatternRestricted*): Self = StObject.set(x, "matches", js.Array(value*))
    
    inline def setResources(value: js.Array[String]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesVarargs(value: String*): Self = StObject.set(x, "resources", js.Array(value*))
  }
}
