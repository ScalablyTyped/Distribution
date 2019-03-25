package typings
package vscodeLib.vscodeMod

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
  var command: java.lang.String
  /**
  		 * Title of the command, like `save`.
  		 */
  var title: java.lang.String
  /**
  		 * A tooltip for the command, when represented in the UI.
  		 */
  var tooltip: js.UndefOr[java.lang.String] = js.undefined
}

object Command {
  @scala.inline
  def apply(
    command: java.lang.String,
    title: java.lang.String,
    arguments: js.Array[_] = null,
    tooltip: java.lang.String = null
  ): Command = {
    val __obj = js.Dynamic.literal(command = command, title = title)
    if (arguments != null) __obj.updateDynamic("arguments")(arguments)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    __obj.asInstanceOf[Command]
  }
}

