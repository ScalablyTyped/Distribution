package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConditionRunner extends StObject {
  
  def runCondition(values: Any, properties: Any): Any
}
object IConditionRunner {
  
  inline def apply(runCondition: (Any, Any) => Any): IConditionRunner = {
    val __obj = js.Dynamic.literal(runCondition = js.Any.fromFunction2(runCondition))
    __obj.asInstanceOf[IConditionRunner]
  }
  
  extension [Self <: IConditionRunner](x: Self) {
    
    inline def setRunCondition(value: (Any, Any) => Any): Self = StObject.set(x, "runCondition", js.Any.fromFunction2(value))
  }
}
