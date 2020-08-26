package typings.windowsProcessTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessInfo extends js.Object {
  /**
    * The string returned is at most 512 chars, strings exceeding this length are truncated.
    */
  var commandLine: js.UndefOr[String] = js.native
  /**
    * The working set size of the process, in bytes.
    */
  var memory: js.UndefOr[Double] = js.native
  var name: String = js.native
  var pid: Double = js.native
  var ppid: Double = js.native
}

object ProcessInfo {
  @scala.inline
  def apply(name: String, pid: Double, ppid: Double): ProcessInfo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], ppid = ppid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessInfo]
  }
  @scala.inline
  implicit class ProcessInfoOps[Self <: ProcessInfo] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPid(value: Double): Self = this.set("pid", value.asInstanceOf[js.Any])
    @scala.inline
    def setPpid(value: Double): Self = this.set("ppid", value.asInstanceOf[js.Any])
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

