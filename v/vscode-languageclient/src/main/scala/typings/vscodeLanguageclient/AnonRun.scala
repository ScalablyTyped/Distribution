package typings.vscodeLanguageclient

import typings.vscodeLanguageclient.mod.NodeModule
import typings.vscodeLanguageclient.mod._ServerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRun extends _ServerOptions {
  var debug: NodeModule
  var run: NodeModule
}

object AnonRun {
  @scala.inline
  def apply(debug: NodeModule, run: NodeModule): AnonRun = {
    val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], run = run.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRun]
  }
}

