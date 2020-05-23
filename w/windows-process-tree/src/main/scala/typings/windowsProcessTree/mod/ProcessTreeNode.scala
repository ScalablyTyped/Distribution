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
    memory: js.UndefOr[Double] = js.undefined
  ): ProcessTreeNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any])
    if (commandLine != null) __obj.updateDynamic("commandLine")(commandLine.asInstanceOf[js.Any])
    if (!js.isUndefined(memory)) __obj.updateDynamic("memory")(memory.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessTreeNode]
  }
}

