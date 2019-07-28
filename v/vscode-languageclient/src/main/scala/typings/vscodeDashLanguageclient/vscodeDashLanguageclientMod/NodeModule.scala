package typings.vscodeDashLanguageclient.vscodeDashLanguageclientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeModule extends _ServerOptions {
  var args: js.UndefOr[js.Array[String]] = js.undefined
  var module: String
  var options: js.UndefOr[ForkOptions] = js.undefined
  var runtime: js.UndefOr[String] = js.undefined
  var transport: js.UndefOr[Transport] = js.undefined
}

object NodeModule {
  @scala.inline
  def apply(
    module: String,
    args: js.Array[String] = null,
    options: ForkOptions = null,
    runtime: String = null,
    transport: Transport = null
  ): NodeModule = {
    val __obj = js.Dynamic.literal(module = module)
    if (args != null) __obj.updateDynamic("args")(args)
    if (options != null) __obj.updateDynamic("options")(options)
    if (runtime != null) __obj.updateDynamic("runtime")(runtime)
    if (transport != null) __obj.updateDynamic("transport")(transport)
    __obj.asInstanceOf[NodeModule]
  }
}

