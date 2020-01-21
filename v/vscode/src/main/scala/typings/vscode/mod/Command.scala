package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Command extends js.Object {
  /**
  		 * Arguments that the command handler should be
  		 * invoked with.
  		 */
  var arguments: js.UndefOr[js.Array[_]] = js.undefined
  /**
  		 * The identifier of the actual command handler.
  		 * @see [commands.registerCommand](#commands.registerCommand).
  		 */
  var command: String
  /**
  		 * Title of the command, like `save`.
  		 */
  var title: String
  /**
  		 * A tooltip for the command, when represented in the UI.
  		 */
  var tooltip: js.UndefOr[String] = js.undefined
}

object Command {
  @scala.inline
  def apply(command: String, title: String, arguments: js.Array[_] = null, tooltip: String = null): Command = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (arguments != null) __obj.updateDynamic("arguments")(arguments.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Command]
  }
}

