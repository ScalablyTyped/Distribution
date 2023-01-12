package typings.xrm.Xrm.Events

import typings.xrm.Xrm.ProcessFlow.Stage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for process stage selected event arguments.
  */
trait StageSelectedEventArguments extends StObject {
  
  /**
    * Gets the selected stage object
    * @returns The stage object
    */
  def getStage(): Stage
}
object StageSelectedEventArguments {
  
  inline def apply(getStage: () => Stage): StageSelectedEventArguments = {
    val __obj = js.Dynamic.literal(getStage = js.Any.fromFunction0(getStage))
    __obj.asInstanceOf[StageSelectedEventArguments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StageSelectedEventArguments] (val x: Self) extends AnyVal {
    
    inline def setGetStage(value: () => Stage): Self = StObject.set(x, "getStage", js.Any.fromFunction0(value))
  }
}
