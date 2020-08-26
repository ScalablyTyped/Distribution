package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DebugSessionOptions extends js.Object {
  /**
    * Controls whether this session should have a separate debug console or share it
    * with the parent session. Has no effect for sessions which do not have a parent session.
    * Defaults to Separate.
    */
  var consoleMode: js.UndefOr[DebugConsoleMode] = js.native
  /**
    * When specified the newly created debug session is registered as a "child" session of this
    * "parent" debug session.
    */
  var parentSession: js.UndefOr[DebugSession] = js.native
}

object DebugSessionOptions {
  @scala.inline
  def apply(): DebugSessionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DebugSessionOptions]
  }
  @scala.inline
  implicit class DebugSessionOptionsOps[Self <: DebugSessionOptions] (val x: Self) extends AnyVal {
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
    def setConsoleMode(value: DebugConsoleMode): Self = this.set("consoleMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsoleMode: Self = this.set("consoleMode", js.undefined)
    @scala.inline
    def setParentSession(value: DebugSession): Self = this.set("parentSession", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentSession: Self = this.set("parentSession", js.undefined)
  }
  
}

