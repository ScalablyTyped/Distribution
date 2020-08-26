package typings.vscodeLanguageclient.mod

import typings.node.childProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChildProcessInfo extends js.Object {
  var detached: Boolean = js.native
  var process: ChildProcess = js.native
}

object ChildProcessInfo {
  @scala.inline
  def apply(detached: Boolean, process: ChildProcess): ChildProcessInfo = {
    val __obj = js.Dynamic.literal(detached = detached.asInstanceOf[js.Any], process = process.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildProcessInfo]
  }
  @scala.inline
  implicit class ChildProcessInfoOps[Self <: ChildProcessInfo] (val x: Self) extends AnyVal {
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
    def setDetached(value: Boolean): Self = this.set("detached", value.asInstanceOf[js.Any])
    @scala.inline
    def setProcess(value: ChildProcess): Self = this.set("process", value.asInstanceOf[js.Any])
  }
  
}

