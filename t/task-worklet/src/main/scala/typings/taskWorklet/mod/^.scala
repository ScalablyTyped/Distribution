package typings.taskWorklet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("task-worklet", JSImport.Namespace)
@js.native
class ^ () extends TaskQueue {
  def this(options: Options) = this()
  /* CompleteClass */
  override def addModule(moduleURL: String): js.Promise[Unit] = js.native
  /* CompleteClass */
  override def postTask(taskName: String, args: js.Any*): Task[_] = js.native
}

