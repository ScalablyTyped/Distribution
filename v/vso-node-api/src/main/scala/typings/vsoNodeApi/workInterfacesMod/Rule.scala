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
  
  @scala.inline
  def apply(
    clauses: js.Array[FilterClause],
    filter: String,
    isEnabled: String,
    name: String,
    settings: attribute
  ): Rule = {
    val __obj = js.Dynamic.literal(clauses = clauses.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
  
  @scala.inline
  implicit class RuleMutableBuilder[Self <: Rule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClauses(value: js.Array[FilterClause]): Self = StObject.set(x, "clauses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClausesVarargs(value: FilterClause*): Self = StObject.set(x, "clauses", js.Array(value :_*))
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnabled(value: String): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettings(value: attribute): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
  }
}
