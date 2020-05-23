package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "TaskGroup")
@js.native
class TaskGroup protected () extends js.Object {
  protected def this(id: String, label: String) = this()
}

/* static members */
@JSImport("vscode", "TaskGroup")
@js.native
object TaskGroup extends js.Object {
  /**
    * The build task group;
    */
  var Build: TaskGroup = js.native
  /**
    * The clean task group;
    */
  var Clean: TaskGroup = js.native
  /**
    * The rebuild all task group;
    */
  var Rebuild: TaskGroup = js.native
  /**
    * The test all task group;
    */
  var Test: TaskGroup = js.native
}

