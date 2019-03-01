package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecuteCommandParams extends js.Object {
  /**
    * Arguments that the command should be invoked with.
    */
  var arguments: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * The identifier of the actual command handler.
    */
  var command: java.lang.String
}

object ExecuteCommandParams {
  @scala.inline
  def apply(command: java.lang.String, arguments: js.Array[_] = null): ExecuteCommandParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("command")(command)
    if (arguments != null) __obj.updateDynamic("arguments")(arguments)
    __obj.asInstanceOf[ExecuteCommandParams]
  }
}

