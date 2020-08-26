package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceControlResourceState extends js.Object {
  /**
    * The [command](#Command) which should be run when the resource
    * state is open in the Source Control viewlet.
    */
  val command: js.UndefOr[Command] = js.native
  /**
    * The [decorations](#SourceControlResourceDecorations) for this source control
    * resource state.
    */
  val decorations: js.UndefOr[SourceControlResourceDecorations] = js.native
  /**
    * The [uri](#Uri) of the underlying resource inside the workspace.
    */
  val resourceUri: Uri = js.native
}

object SourceControlResourceState {
  @scala.inline
  def apply(resourceUri: Uri): SourceControlResourceState = {
    val __obj = js.Dynamic.literal(resourceUri = resourceUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceControlResourceState]
  }
  @scala.inline
  implicit class SourceControlResourceStateOps[Self <: SourceControlResourceState] (val x: Self) extends AnyVal {
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
    def setResourceUri(value: Uri): Self = this.set("resourceUri", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommand(value: Command): Self = this.set("command", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommand: Self = this.set("command", js.undefined)
    @scala.inline
    def setDecorations(value: SourceControlResourceDecorations): Self = this.set("decorations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecorations: Self = this.set("decorations", js.undefined)
  }
  
}

