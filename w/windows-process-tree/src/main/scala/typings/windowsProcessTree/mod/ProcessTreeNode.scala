package typings.windowsProcessTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessTreeNode extends js.Object {
  var children: js.Array[ProcessTreeNode] = js.native
  var commandLine: js.UndefOr[String] = js.native
  var memory: js.UndefOr[Double] = js.native
  var name: String = js.native
  var pid: Double = js.native
}

object ProcessTreeNode {
  @scala.inline
  def apply(children: js.Array[ProcessTreeNode], name: String, pid: Double): ProcessTreeNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessTreeNode]
  }
  @scala.inline
  implicit class ProcessTreeNodeOps[Self <: ProcessTreeNode] (val x: Self) extends AnyVal {
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
    def setChildrenVarargs(value: ProcessTreeNode*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[ProcessTreeNode]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPid(value: Double): Self = this.set("pid", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommandLine(value: String): Self = this.set("commandLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommandLine: Self = this.set("commandLine", js.undefined)
    @scala.inline
    def setMemory(value: Double): Self = this.set("memory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemory: Self = this.set("memory", js.undefined)
  }
  
}

