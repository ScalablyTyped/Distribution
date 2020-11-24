package typings.yeomanGenerator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides a priority-specification for a custom queue.
  */
@js.native
trait Priority extends js.Object {
  
  /**
    * The name of the queue which this priority should be added before.
    */
  var before: String = js.native
  
  /**
    * The name of the method to execute.
    */
  var priorityName: String = js.native
  
  /**
    * The name for identifying the queue.
    */
  var queueName: js.UndefOr[String] = js.native
}
object Priority {
  
  @scala.inline
  def apply(before: String, priorityName: String): Priority = {
    val __obj = js.Dynamic.literal(before = before.asInstanceOf[js.Any], priorityName = priorityName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Priority]
  }
  
  @scala.inline
  implicit class PriorityOps[Self <: Priority] (val x: Self) extends AnyVal {
    
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
    def setBefore(value: String): Self = this.set("before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityName(value: String): Self = this.set("priorityName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueName(value: String): Self = this.set("queueName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueueName: Self = this.set("queueName", js.undefined)
  }
}
