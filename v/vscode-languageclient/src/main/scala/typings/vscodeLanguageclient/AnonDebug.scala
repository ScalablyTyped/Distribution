package typings.vscodeLanguageclient

import typings.vscodeLanguageclient.mod.Executable
import typings.vscodeLanguageclient.mod._ServerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDebug extends _ServerOptions {
  var debug: Executable
  var run: Executable
}

object AnonDebug {
  @scala.inline
  def apply(debug: Executable, run: Executable): AnonDebug = {
    val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], run = run.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDebug]
  }
}

