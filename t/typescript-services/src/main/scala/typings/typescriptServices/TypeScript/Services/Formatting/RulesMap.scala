package typings.typescriptServices.TypeScript.Services.Formatting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RulesMap extends StObject {
  
  /* private */ def FillRule(rule: js.Any, rulesBucketConstructionStateList: js.Any): js.Any = js.native
  
  def FillRules(rules: js.Array[Rule], rulesBucketConstructionStateList: js.Array[RulesBucketConstructionState]): Unit = js.native
  
  def GetRule(context: FormattingContext): Rule = js.native
  
  /* private */ def GetRuleBucketIndex(row: js.Any, column: js.Any): js.Any = js.native
  
  def Initialize(rules: js.Array[Rule]): js.Array[RulesBucket] = js.native
  
  var map: js.Array[RulesBucket] = js.native
  
  var mapRowLength: Double = js.native
}
object RulesMap {
  
  @scala.inline
  def apply(
    FillRule: (js.Any, js.Any) => js.Any,
    FillRules: (js.Array[Rule], js.Array[RulesBucketConstructionState]) => Unit,
    GetRule: FormattingContext => Rule,
    GetRuleBucketIndex: (js.Any, js.Any) => js.Any,
    Initialize: js.Array[Rule] => js.Array[RulesBucket],
    map: js.Array[RulesBucket],
    mapRowLength: Double
  ): RulesMap = {
    val __obj = js.Dynamic.literal(FillRule = js.Any.fromFunction2(FillRule), FillRules = js.Any.fromFunction2(FillRules), GetRule = js.Any.fromFunction1(GetRule), GetRuleBucketIndex = js.Any.fromFunction2(GetRuleBucketIndex), Initialize = js.Any.fromFunction1(Initialize), map = map.asInstanceOf[js.Any], mapRowLength = mapRowLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[RulesMap]
  }
  
  @scala.inline
  implicit class RulesMapMutableBuilder[Self <: RulesMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFillRule(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "FillRule", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFillRules(value: (js.Array[Rule], js.Array[RulesBucketConstructionState]) => Unit): Self = StObject.set(x, "FillRules", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetRule(value: FormattingContext => Rule): Self = StObject.set(x, "GetRule", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetRuleBucketIndex(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "GetRuleBucketIndex", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInitialize(value: js.Array[Rule] => js.Array[RulesBucket]): Self = StObject.set(x, "Initialize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMap(value: js.Array[RulesBucket]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapRowLength(value: Double): Self = StObject.set(x, "mapRowLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapVarargs(value: RulesBucket*): Self = StObject.set(x, "map", js.Array(value :_*))
  }
}
