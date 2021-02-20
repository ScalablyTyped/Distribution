package typings.typescriptServices.TypeScript.Services.Formatting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RulesBucket extends StObject {
  
  def AddRule(
    rule: Rule,
    specificTokens: Boolean,
    constructionState: js.Array[RulesBucketConstructionState],
    rulesBucketIndex: Double
  ): Unit = js.native
  
  def Rules(): js.Array[Rule] = js.native
  
  var rules: js.Any = js.native
}
object RulesBucket {
  
  @scala.inline
  def apply(
    AddRule: (Rule, Boolean, js.Array[RulesBucketConstructionState], Double) => Unit,
    Rules: () => js.Array[Rule],
    rules: js.Any
  ): RulesBucket = {
    val __obj = js.Dynamic.literal(AddRule = js.Any.fromFunction4(AddRule), Rules = js.Any.fromFunction0(Rules), rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[RulesBucket]
  }
  
  @scala.inline
  implicit class RulesBucketMutableBuilder[Self <: RulesBucket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddRule(value: (Rule, Boolean, js.Array[RulesBucketConstructionState], Double) => Unit): Self = StObject.set(x, "AddRule", js.Any.fromFunction4(value))
    
    @scala.inline
    def setRules(value: () => js.Array[Rule]): Self = StObject.set(x, "Rules", js.Any.fromFunction0(value))
  }
}
