package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConditionRunner extends StObject {
  
  def runCondition(values: HashTable[_], properties: HashTable[_]): js.Any = js.native
}
object IConditionRunner {
  
  @scala.inline
  def apply(runCondition: (HashTable[_], HashTable[_]) => js.Any): IConditionRunner = {
    val __obj = js.Dynamic.literal(runCondition = js.Any.fromFunction2(runCondition))
    __obj.asInstanceOf[IConditionRunner]
  }
  
  @scala.inline
  implicit class IConditionRunnerMutableBuilder[Self <: IConditionRunner] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRunCondition(value: (HashTable[_], HashTable[_]) => js.Any): Self = StObject.set(x, "runCondition", js.Any.fromFunction2(value))
  }
}
