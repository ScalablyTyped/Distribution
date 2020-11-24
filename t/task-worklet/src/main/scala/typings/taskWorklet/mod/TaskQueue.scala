package typings.taskWorklet.mod

import typings.std.Parameters
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskQueue[T /* <: TaskDescriptor */] extends js.Object {
  
  def addModule(moduleURL: String): js.Promise[Unit] = js.native
  
  @JSName("postTask")
  def postTask_name[U /* <: T */](
    taskName: /* import warning: importer.ImportType#apply Failed type conversion: U['name'] */ js.Any,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<U> is not an array type */ args: Parameters[U]
  ): Task[ReturnType[U]] = js.native
}
object TaskQueue {
  
  @scala.inline
  def apply[T /* <: TaskDescriptor */](
    addModule: String => js.Promise[Unit],
    postTask: (/* import warning: importer.ImportType#apply Failed type conversion: U['name'] */ js.Any, Parameters[js.Any]) => Task[ReturnType[js.Any]]
  ): TaskQueue[T] = {
    val __obj = js.Dynamic.literal(addModule = js.Any.fromFunction1(addModule), postTask = js.Any.fromFunction2(postTask))
    __obj.asInstanceOf[TaskQueue[T]]
  }
  
  @scala.inline
  implicit class TaskQueueOps[Self <: TaskQueue[_], T /* <: TaskDescriptor */] (val x: Self with TaskQueue[T]) extends AnyVal {
    
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
    def setAddModule(value: String => js.Promise[Unit]): Self = this.set("addModule", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPostTask(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: U['name'] */ js.Any, Parameters[js.Any]) => Task[ReturnType[js.Any]]
    ): Self = this.set("postTask", js.Any.fromFunction2(value))
  }
}
