package typings.vscodeDashLanguageclient.vscodeDashLanguageclientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Executable extends _ServerOptions {
  var args: js.UndefOr[js.Array[String]] = js.undefined
  var command: String
  var options: js.UndefOr[ExecutableOptions] = js.undefined
}

object Executable {
  @scala.inline
  def apply(command: String, args: js.Array[String] = null, options: ExecutableOptions = null): Executable = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Executable]
  }
}

