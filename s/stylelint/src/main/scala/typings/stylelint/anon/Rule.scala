package typings.stylelint.anon

import typings.stylelint.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rule
  extends StObject
     with Plugin {
  
  var rule: typings.stylelint.mod.Rule[Any, Any]
  
  var ruleName: String
}
object Rule {
  
  inline def apply(rule: typings.stylelint.mod.Rule[Any, Any], ruleName: String): Rule = {
    val __obj = js.Dynamic.literal(rule = rule.asInstanceOf[js.Any], ruleName = ruleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Rule] (val x: Self) extends AnyVal {
    
    inline def setRule(value: typings.stylelint.mod.Rule[Any, Any]): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setRuleName(value: String): Self = StObject.set(x, "ruleName", value.asInstanceOf[js.Any])
  }
}
