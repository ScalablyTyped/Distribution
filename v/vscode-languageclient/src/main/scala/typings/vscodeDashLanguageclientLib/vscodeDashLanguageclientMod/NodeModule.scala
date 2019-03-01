package typings
package vscodeDashLanguageclientLib.vscodeDashLanguageclientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeModule extends _ServerOptions {
  var args: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var module: java.lang.String
  var options: js.UndefOr[ForkOptions] = js.undefined
  var runtime: js.UndefOr[java.lang.String] = js.undefined
  var transport: js.UndefOr[Transport] = js.undefined
}

object NodeModule {
  @scala.inline
  def apply(
    module: java.lang.String,
    args: js.Array[java.lang.String] = null,
    options: ForkOptions = null,
    runtime: java.lang.String = null,
    transport: Transport = null
  ): NodeModule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("module")(module)
    if (args != null) __obj.updateDynamic("args")(args)
    if (options != null) __obj.updateDynamic("options")(options)
    if (runtime != null) __obj.updateDynamic("runtime")(runtime)
    if (transport != null) __obj.updateDynamic("transport")(transport)
    __obj.asInstanceOf[NodeModule]
  }
}

