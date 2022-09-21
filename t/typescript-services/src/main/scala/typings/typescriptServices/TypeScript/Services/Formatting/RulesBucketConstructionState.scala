package typings.typescriptServices.TypeScript.Services.Formatting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RulesBucketConstructionState extends StObject {
  
  def GetInsertionIndex(maskPosition: RulesPosition): Double
  
  def IncreaseInsertionIndex(maskPosition: RulesPosition): Unit
  
  /* private */ var rulesInsertionIndexBitmap: Any
}
object RulesBucketConstructionState {
  
  inline def apply(
    GetInsertionIndex: RulesPosition => Double,
    IncreaseInsertionIndex: RulesPosition => Unit,
    rulesInsertionIndexBitmap: Any
  ): RulesBucketConstructionState = {
    val __obj = js.Dynamic.literal(GetInsertionIndex = js.Any.fromFunction1(GetInsertionIndex), IncreaseInsertionIndex = js.Any.fromFunction1(IncreaseInsertionIndex), rulesInsertionIndexBitmap = rulesInsertionIndexBitmap.asInstanceOf[js.Any])
    __obj.asInstanceOf[RulesBucketConstructionState]
  }
  
  extension [Self <: RulesBucketConstructionState](x: Self) {
    
    inline def setGetInsertionIndex(value: RulesPosition => Double): Self = StObject.set(x, "GetInsertionIndex", js.Any.fromFunction1(value))
    
    inline def setIncreaseInsertionIndex(value: RulesPosition => Unit): Self = StObject.set(x, "IncreaseInsertionIndex", js.Any.fromFunction1(value))
    
    inline def setRulesInsertionIndexBitmap(value: Any): Self = StObject.set(x, "rulesInsertionIndexBitmap", value.asInstanceOf[js.Any])
  }
}
