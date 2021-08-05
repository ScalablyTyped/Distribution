package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoardCardRuleSettings extends StObject {
  
  var _links: js.Any
  
  var rules: StringDictionary[js.Array[Rule]]
  
  var url: String
}
object BoardCardRuleSettings {
  
  inline def apply(_links: js.Any, rules: StringDictionary[js.Array[Rule]], url: String): BoardCardRuleSettings = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoardCardRuleSettings]
  }
  
  extension [Self <: BoardCardRuleSettings](x: Self) {
    
    inline def setRules(value: StringDictionary[js.Array[Rule]]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def set_links(value: js.Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
