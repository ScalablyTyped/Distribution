package typings.vscodeLanguageclient.mod

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
    val __obj = js.Dynamic.literal(module = module.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (runtime != null) __obj.updateDynamic("runtime")(runtime.asInstanceOf[js.Any])
    if (transport != null) __obj.updateDynamic("transport")(transport.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeModule]
  }
}

