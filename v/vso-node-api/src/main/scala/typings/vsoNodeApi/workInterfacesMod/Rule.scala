package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rule extends StObject {
  
  var clauses: js.Array[FilterClause]
  
  var filter: String
  
  var isEnabled: String
  
  var name: String
  
  var settings: attribute
}
object Rule {
  
  inline def apply(
    clauses: js.Array[FilterClause],
    filter: String,
    isEnabled: String,
    name: String,
    settings: attribute
  ): Rule = {
    val __obj = js.Dynamic.literal(clauses = clauses.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
  
  extension [Self <: Rule](x: Self) {
    
    inline def setClauses(value: js.Array[FilterClause]): Self = StObject.set(x, "clauses", value.asInstanceOf[js.Any])
    
    inline def setClausesVarargs(value: FilterClause*): Self = StObject.set(x, "clauses", js.Array(value :_*))
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setIsEnabled(value: String): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSettings(value: attribute): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
  }
}
