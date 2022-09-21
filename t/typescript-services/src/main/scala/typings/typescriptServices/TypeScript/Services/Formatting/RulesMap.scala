package typings.typescriptServices.TypeScript.Services.Formatting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RulesMap extends StObject {
  
  /* private */ def FillRule(rule: Any, rulesBucketConstructionStateList: Any): Any
  
  def FillRules(rules: js.Array[Rule], rulesBucketConstructionStateList: js.Array[RulesBucketConstructionState]): Unit
  
  def GetRule(context: FormattingContext): Rule
  
  /* private */ def GetRuleBucketIndex(row: Any, column: Any): Any
  
  def Initialize(rules: js.Array[Rule]): js.Array[RulesBucket]
  
  var map: js.Array[RulesBucket]
  
  var mapRowLength: Double
}
object RulesMap {
  
  inline def apply(
    FillRule: (Any, Any) => Any,
    FillRules: (js.Array[Rule], js.Array[RulesBucketConstructionState]) => Unit,
    GetRule: FormattingContext => Rule,
    GetRuleBucketIndex: (Any, Any) => Any,
    Initialize: js.Array[Rule] => js.Array[RulesBucket],
    map: js.Array[RulesBucket],
    mapRowLength: Double
  ): RulesMap = {
    val __obj = js.Dynamic.literal(FillRule = js.Any.fromFunction2(FillRule), FillRules = js.Any.fromFunction2(FillRules), GetRule = js.Any.fromFunction1(GetRule), GetRuleBucketIndex = js.Any.fromFunction2(GetRuleBucketIndex), Initialize = js.Any.fromFunction1(Initialize), map = map.asInstanceOf[js.Any], mapRowLength = mapRowLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[RulesMap]
  }
  
  extension [Self <: RulesMap](x: Self) {
    
    inline def setFillRule(value: (Any, Any) => Any): Self = StObject.set(x, "FillRule", js.Any.fromFunction2(value))
    
    inline def setFillRules(value: (js.Array[Rule], js.Array[RulesBucketConstructionState]) => Unit): Self = StObject.set(x, "FillRules", js.Any.fromFunction2(value))
    
    inline def setGetRule(value: FormattingContext => Rule): Self = StObject.set(x, "GetRule", js.Any.fromFunction1(value))
    
    inline def setGetRuleBucketIndex(value: (Any, Any) => Any): Self = StObject.set(x, "GetRuleBucketIndex", js.Any.fromFunction2(value))
    
    inline def setInitialize(value: js.Array[Rule] => js.Array[RulesBucket]): Self = StObject.set(x, "Initialize", js.Any.fromFunction1(value))
    
    inline def setMap(value: js.Array[RulesBucket]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapRowLength(value: Double): Self = StObject.set(x, "mapRowLength", value.asInstanceOf[js.Any])
    
    inline def setMapVarargs(value: RulesBucket*): Self = StObject.set(x, "map", js.Array(value*))
  }
}
