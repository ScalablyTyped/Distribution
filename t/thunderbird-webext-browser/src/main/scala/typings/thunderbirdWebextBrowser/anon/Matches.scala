package typings.thunderbirdWebextBrowser.anon

import typings.thunderbirdWebextBrowser.browser.manifest.ExtensionID
import typings.thunderbirdWebextBrowser.browser.manifest.MatchPattern
import typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.Asterisk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Matches extends StObject {
  
  var extension_ids: js.UndefOr[js.Array[ExtensionID | Asterisk]] = js.undefined
  
  var matches: js.UndefOr[js.Array[MatchPattern]] = js.undefined
  
  var resources: js.Array[String]
}
object Matches {
  
  inline def apply(resources: js.Array[String]): Matches = {
    val __obj = js.Dynamic.literal(resources = resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[Matches]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Matches] (val x: Self) extends AnyVal {
    
    inline def setExtension_ids(value: js.Array[ExtensionID | Asterisk]): Self = StObject.set(x, "extension_ids", value.asInstanceOf[js.Any])
    
    inline def setExtension_idsUndefined: Self = StObject.set(x, "extension_ids", js.undefined)
    
    inline def setExtension_idsVarargs(value: (ExtensionID | Asterisk)*): Self = StObject.set(x, "extension_ids", js.Array(value*))
    
    inline def setMatches(value: js.Array[MatchPattern]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    inline def setMatchesUndefined: Self = StObject.set(x, "matches", js.undefined)
    
    inline def setMatchesVarargs(value: MatchPattern*): Self = StObject.set(x, "matches", js.Array(value*))
    
    inline def setResources(value: js.Array[String]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesVarargs(value: String*): Self = StObject.set(x, "resources", js.Array(value*))
  }
}
