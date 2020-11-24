package typings.yeomanGenerator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a task.
  */
@js.native
trait Task extends TaskOptions {
  
  /**
    * The function to queue.
    */
  def method(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
  ): js.Any = js.native
  
  /**
    * The name of the task.
    */
  var taskName: String = js.native
}
object Task {
  
  @scala.inline
  def apply(method: js.Any => js.Any, taskName: String): Task = {
    val __obj = js.Dynamic.literal(method = js.Any.fromFunction1(method), taskName = taskName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Task]
  }
  
  @scala.inline
  implicit class TaskOps[Self <: Task] (val x: Self) extends AnyVal {
    
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
    def setMethod(value: js.Any => js.Any): Self = this.set("method", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTaskName(value: String): Self = this.set("taskName", value.asInstanceOf[js.Any])
  }
}
