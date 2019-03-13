package typings
package taskDashWorkletLib.taskDashWorkletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("task-worklet", JSImport.Namespace)
@js.native
class namespaced () extends TaskQueue {
  def this(options: Options) = this()
  /* CompleteClass */
  override def addModule(moduleURL: java.lang.String): js.Promise[scala.Unit] = js.native
  /* CompleteClass */
  override def postTask(taskName: java.lang.String, args: js.Any*): taskDashWorkletLib.taskDashWorkletMod.TaskQueueNs.Task[_] = js.native
}

