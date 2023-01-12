package typings.xrm.Xrm.Events

import typings.xrm.Xrm.ProcessFlow.ProcessStatus
import typings.xrm.Xrm.ProcessFlow.Stage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for process status changed event arguments.
  */
trait ProcessStatusChangedEventArguments extends StObject {
  
  /**
    * Gets the selected stage object
    * @returns The stage object
    */
  def getStage(): Stage
  
  /**
    * Gets the destination process status
    * @returns The process status
    */
  def getStatus(): ProcessStatus
  
  /**
    * Prevents the stage or status change operation from being submitted to the server.
    */
  def preventDefault(): Unit
}
object ProcessStatusChangedEventArguments {
  
  inline def apply(getStage: () => Stage, getStatus: () => ProcessStatus, preventDefault: () => Unit): ProcessStatusChangedEventArguments = {
    val __obj = js.Dynamic.literal(getStage = js.Any.fromFunction0(getStage), getStatus = js.Any.fromFunction0(getStatus), preventDefault = js.Any.fromFunction0(preventDefault))
    __obj.asInstanceOf[ProcessStatusChangedEventArguments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProcessStatusChangedEventArguments] (val x: Self) extends AnyVal {
    
    inline def setGetStage(value: () => Stage): Self = StObject.set(x, "getStage", js.Any.fromFunction0(value))
    
    inline def setGetStatus(value: () => ProcessStatus): Self = StObject.set(x, "getStatus", js.Any.fromFunction0(value))
    
    inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
  }
}
