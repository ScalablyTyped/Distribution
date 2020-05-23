package typings.vscodeLanguageclient.anon

import typings.vscodeLanguageclient.mod.NodeModule
import typings.vscodeLanguageclient.mod._ServerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Run extends _ServerOptions {
  var debug: NodeModule
  var run: NodeModule
}

object Run {
  @scala.inline
  def apply(debug: NodeModule, run: NodeModule): Run = {
    val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], run = run.asInstanceOf[js.Any])
    __obj.asInstanceOf[Run]
  }
}

