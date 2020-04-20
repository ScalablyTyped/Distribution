package typings.vscodeLanguageclient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ServerOptions extends js.Object

object _ServerOptions {
  @scala.inline
  def Executable(command: String, args: js.Array[String] = null, options: ExecutableOptions = null): _ServerOptions = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ServerOptions]
  }
  @scala.inline
  def AnonDebug(debug: Executable, run: Executable): _ServerOptions = {
    val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], run = run.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ServerOptions]
  }
  @scala.inline
  def AnonRun(debug: NodeModule, run: NodeModule): _ServerOptions = {
    val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], run = run.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ServerOptions]
  }
  @scala.inline
  def NodeModule(
    module: String,
    args: js.Array[String] = null,
    options: ForkOptions = null,
    runtime: String = null,
    transport: Transport = null
  ): _ServerOptions = {
    val __obj = js.Dynamic.literal(module = module.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (runtime != null) __obj.updateDynamic("runtime")(runtime.asInstanceOf[js.Any])
    if (transport != null) __obj.updateDynamic("transport")(transport.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ServerOptions]
  }
}

