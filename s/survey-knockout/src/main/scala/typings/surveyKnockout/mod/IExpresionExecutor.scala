package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IExpresionExecutor extends StObject {
  
  /*
    * This call back runs on executing expression if there is at least one async function
    */
  def onComplete(res: Any): Unit
}
object IExpresionExecutor {
  
  inline def apply(onComplete: Any => Unit): IExpresionExecutor = {
    val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction1(onComplete))
    __obj.asInstanceOf[IExpresionExecutor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IExpresionExecutor] (val x: Self) extends AnyVal {
    
    inline def setOnComplete(value: Any => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
  }
}
