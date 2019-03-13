package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "TaskGroup")
@js.native
class TaskGroup protected () extends js.Object {
  protected def this(id: java.lang.String, label: java.lang.String) = this()
}

/* static members */
@JSImport("vscode", "TaskGroup")
@js.native
object TaskGroup extends js.Object {
  /**
  		 * The build task group;
  		 */
  var Build: vscodeLib.vscodeMod.TaskGroup = js.native
  /**
  		 * The clean task group;
  		 */
  var Clean: vscodeLib.vscodeMod.TaskGroup = js.native
  /**
  		 * The rebuild all task group;
  		 */
  var Rebuild: vscodeLib.vscodeMod.TaskGroup = js.native
  /**
  		 * The test all task group;
  		 */
  var Test: vscodeLib.vscodeMod.TaskGroup = js.native
}

