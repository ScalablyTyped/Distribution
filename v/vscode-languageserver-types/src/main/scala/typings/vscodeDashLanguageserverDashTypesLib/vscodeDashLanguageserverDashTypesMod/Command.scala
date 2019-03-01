package typings
package vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod

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
    */
  var command: java.lang.String
  /**
    * Title of the command, like `save`.
    */
  var title: java.lang.String
}

object Command {
  @scala.inline
  def apply(command: java.lang.String, title: java.lang.String, arguments: js.Array[_] = null): Command = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("command")(command)
    __obj.updateDynamic("title")(title)
    if (arguments != null) __obj.updateDynamic("arguments")(arguments)
    __obj.asInstanceOf[Command]
  }
}

