package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceControlResourceState extends js.Object {
  /**
  		 * The [command](#Command) which should be run when the resource
  		 * state is open in the Source Control viewlet.
  		 */
  val command: js.UndefOr[Command] = js.undefined
  /**
  		 * The [decorations](#SourceControlResourceDecorations) for this source control
  		 * resource state.
  		 */
  val decorations: js.UndefOr[SourceControlResourceDecorations] = js.undefined
  /**
  		 * The [uri](#Uri) of the underlying resource inside the workspace.
  		 */
  val resourceUri: Uri
}

object SourceControlResourceState {
  @scala.inline
  def apply(resourceUri: Uri, command: Command = null, decorations: SourceControlResourceDecorations = null): SourceControlResourceState = {
    val __obj = js.Dynamic.literal(resourceUri = resourceUri.asInstanceOf[js.Any])
    if (command != null) __obj.updateDynamic("command")(command.asInstanceOf[js.Any])
    if (decorations != null) __obj.updateDynamic("decorations")(decorations.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceControlResourceState]
  }
}

