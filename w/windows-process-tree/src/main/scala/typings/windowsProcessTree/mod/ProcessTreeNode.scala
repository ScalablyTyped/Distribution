package typings.windowsProcessTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessTreeNode extends js.Object {
  var children: js.Array[ProcessTreeNode]
  var commandLine: js.UndefOr[String] = js.undefined
  var memory: js.UndefOr[Double] = js.undefined
  var name: String
  var pid: Double
}

object ProcessTreeNode {
  @scala.inline
  def apply(
    children: js.Array[ProcessTreeNode],
    name: String,
    pid: Double,
    commandLine: String = null,
    memory: Int | Double = null
  ): ProcessTreeNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any])
    if (commandLine != null) __obj.updateDynamic("commandLine")(commandLine.asInstanceOf[js.Any])
    if (memory != null) __obj.updateDynamic("memory")(memory.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessTreeNode]
  }
}

