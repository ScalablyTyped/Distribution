package typings.vscodeLanguageclient.anon

import typings.vscodeLanguageclient.mod.NodeModule
import typings.vscodeLanguageclient.mod._ServerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Run extends _ServerOptions {
  var debug: NodeModule = js.native
  var run: NodeModule = js.native
}

object Run {
  @scala.inline
  def apply(debug: NodeModule, run: NodeModule): Run = {
    val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], run = run.asInstanceOf[js.Any])
    __obj.asInstanceOf[Run]
  }
  @scala.inline
  implicit class RunOps[Self <: Run] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDebug(value: NodeModule): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def setRun(value: NodeModule): Self = this.set("run", value.asInstanceOf[js.Any])
  }
  
}

