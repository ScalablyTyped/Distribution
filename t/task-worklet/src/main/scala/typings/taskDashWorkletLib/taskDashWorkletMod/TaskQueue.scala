package typings
package taskDashWorkletLib.taskDashWorkletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskQueue extends js.Object {
  def addModule(moduleURL: java.lang.String): js.Promise[scala.Unit]
  def postTask(taskName: java.lang.String, args: js.Any*): Task[_]
}

