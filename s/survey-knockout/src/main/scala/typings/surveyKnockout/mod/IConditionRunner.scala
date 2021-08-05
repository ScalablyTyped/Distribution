package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConditionRunner extends StObject {
  
  def runCondition(values: HashTable[js.Any], properties: HashTable[js.Any]): js.Any
}
object IConditionRunner {
  
  inline def apply(runCondition: (HashTable[js.Any], HashTable[js.Any]) => js.Any): IConditionRunner = {
    val __obj = js.Dynamic.literal(runCondition = js.Any.fromFunction2(runCondition))
    __obj.asInstanceOf[IConditionRunner]
  }
  
  extension [Self <: IConditionRunner](x: Self) {
    
    inline def setRunCondition(value: (HashTable[js.Any], HashTable[js.Any]) => js.Any): Self = StObject.set(x, "runCondition", js.Any.fromFunction2(value))
  }
}
