package typings.terminalKit.terminalMod

import typings.node.processMod.global.NodeJS.Process
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateOptions extends js.Object {
  var appId: String = js.native
  var appName: String = js.native
  var generic: js.UndefOr[String] = js.native
  var isSSH: js.UndefOr[Boolean] = js.native
  var isTTY: js.UndefOr[Boolean] = js.native
  var pid: js.UndefOr[js.Any] = js.native
  var preferProcessSigwinch: js.UndefOr[Boolean] = js.native
  var processSigwinch: js.UndefOr[Boolean] = js.native
  var stderr: js.UndefOr[Process] = js.native
  var stdin: js.UndefOr[Process] = js.native
  var stdout: js.UndefOr[Process] = js.native
}

object CreateOptions {
  @scala.inline
  def apply(appId: String, appName: String): CreateOptions = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], appName = appName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOptions]
  }
  @scala.inline
  implicit class CreateOptionsOps[Self <: CreateOptions] (val x: Self) extends AnyVal {
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
    def setAppId(value: String): Self = this.set("appId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAppName(value: String): Self = this.set("appName", value.asInstanceOf[js.Any])
    @scala.inline
    def setGeneric(value: String): Self = this.set("generic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeneric: Self = this.set("generic", js.undefined)
    @scala.inline
    def setIsSSH(value: Boolean): Self = this.set("isSSH", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSSH: Self = this.set("isSSH", js.undefined)
    @scala.inline
    def setIsTTY(value: Boolean): Self = this.set("isTTY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsTTY: Self = this.set("isTTY", js.undefined)
    @scala.inline
    def setPid(value: js.Any): Self = this.set("pid", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePid: Self = this.set("pid", js.undefined)
    @scala.inline
    def setPreferProcessSigwinch(value: Boolean): Self = this.set("preferProcessSigwinch", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferProcessSigwinch: Self = this.set("preferProcessSigwinch", js.undefined)
    @scala.inline
    def setProcessSigwinch(value: Boolean): Self = this.set("processSigwinch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessSigwinch: Self = this.set("processSigwinch", js.undefined)
    @scala.inline
    def setStderr(value: Process): Self = this.set("stderr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStderr: Self = this.set("stderr", js.undefined)
    @scala.inline
    def setStdin(value: Process): Self = this.set("stdin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStdin: Self = this.set("stdin", js.undefined)
    @scala.inline
    def setStdout(value: Process): Self = this.set("stdout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStdout: Self = this.set("stdout", js.undefined)
  }
  
}

