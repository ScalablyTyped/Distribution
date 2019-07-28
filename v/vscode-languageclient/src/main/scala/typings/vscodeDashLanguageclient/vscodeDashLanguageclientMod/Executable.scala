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
    val __obj = js.Dynamic.literal(command = command)
    if (args != null) __obj.updateDynamic("args")(args)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[Executable]
  }
}

