package typings
package vscodeDashLanguageclientLib.vscodeDashLanguageclientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForkOptions extends js.Object {
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var env: js.UndefOr[js.Any] = js.undefined
  var execArgv: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object ForkOptions {
  @scala.inline
  def apply(
    cwd: java.lang.String = null,
    encoding: java.lang.String = null,
    env: js.Any = null,
    execArgv: js.Array[java.lang.String] = null
  ): ForkOptions = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (env != null) __obj.updateDynamic("env")(env)
    if (execArgv != null) __obj.updateDynamic("execArgv")(execArgv)
    __obj.asInstanceOf[ForkOptions]
  }
}

