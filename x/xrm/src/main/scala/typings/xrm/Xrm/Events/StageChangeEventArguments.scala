package typings.xrm.Xrm.Events

import typings.xrm.Xrm.ProcessFlow.Stage
import typings.xrm.Xrm.ProcessFlow.StageChangeDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for process stage change event arguments.
  */
@js.native
trait StageChangeEventArguments extends js.Object {
  
  /**
    * Gets the direction of the stage change.
    * @returns The direction: "next" or "previous"
    */
  def getDirection(): StageChangeDirection = js.native
  
  /**
    * Gets the destination stage object
    * @returns The stage object. For switching between entities, returns the previous stage object
    */
  def getStage(): Stage = js.native
  
  /**
    * Prevents the stage or status change operation from being submitted to the server.
    */
  def preventDefault(): Unit = js.native
}
object StageChangeEventArguments {
  
  @scala.inline
  def apply(getDirection: () => StageChangeDirection, getStage: () => Stage, preventDefault: () => Unit): StageChangeEventArguments = {
    val __obj = js.Dynamic.literal(getDirection = js.Any.fromFunction0(getDirection), getStage = js.Any.fromFunction0(getStage), preventDefault = js.Any.fromFunction0(preventDefault))
    __obj.asInstanceOf[StageChangeEventArguments]
  }
  
  @scala.inline
  implicit class StageChangeEventArgumentsOps[Self <: StageChangeEventArguments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetDirection(value: () => StageChangeDirection): Self = this.set("getDirection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStage(value: () => Stage): Self = this.set("getStage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPreventDefault(value: () => Unit): Self = this.set("preventDefault", js.Any.fromFunction0(value))
  }
}
