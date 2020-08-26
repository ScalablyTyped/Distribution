package typings.vscodeLanguageclient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ServerOptions extends js.Object

object _ServerOptions {
  @scala.inline
  def Executable(command: String): _ServerOptions = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ServerOptions]
  }
  @scala.inline
  def Debug(debug: Executable, run: Executable): _ServerOptions = {
    val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], run = run.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ServerOptions]
  }
  @scala.inline
  def Run(debug: NodeModule, run: NodeModule): _ServerOptions = {
    val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], run = run.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ServerOptions]
  }
  @scala.inline
  def NodeModule(module: String): _ServerOptions = {
    val __obj = js.Dynamic.literal(module = module.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ServerOptions]
  }
}

