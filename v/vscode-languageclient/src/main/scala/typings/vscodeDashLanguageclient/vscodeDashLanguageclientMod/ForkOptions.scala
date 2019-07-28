package typings.vscodeDashLanguageclient.vscodeDashLanguageclientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForkOptions extends js.Object {
  var cwd: js.UndefOr[String] = js.undefined
  var encoding: js.UndefOr[String] = js.undefined
  var env: js.UndefOr[js.Any] = js.undefined
  var execArgv: js.UndefOr[js.Array[String]] = js.undefined
}

object ForkOptions {
  @scala.inline
  def apply(cwd: String = null, encoding: String = null, env: js.Any = null, execArgv: js.Array[String] = null): ForkOptions = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (env != null) __obj.updateDynamic("env")(env)
    if (execArgv != null) __obj.updateDynamic("execArgv")(execArgv)
    __obj.asInstanceOf[ForkOptions]
  }
}

