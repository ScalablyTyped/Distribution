package typings.vscodeLanguageclient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeModule extends _ServerOptions {
  var args: js.UndefOr[js.Array[String]] = js.native
  var module: String = js.native
  var options: js.UndefOr[ForkOptions] = js.native
  var runtime: js.UndefOr[String] = js.native
  var transport: js.UndefOr[Transport] = js.native
}

object NodeModule {
  @scala.inline
  def apply(module: String): NodeModule = {
    val __obj = js.Dynamic.literal(module = module.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeModule]
  }
  @scala.inline
  implicit class NodeModuleOps[Self <: NodeModule] (val x: Self) extends AnyVal {
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
    def setModule(value: String): Self = this.set("module", value.asInstanceOf[js.Any])
    @scala.inline
    def setArgsVarargs(value: String*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[String]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    @scala.inline
    def setOptions(value: ForkOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setRuntime(value: String): Self = this.set("runtime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuntime: Self = this.set("runtime", js.undefined)
    @scala.inline
    def setTransport(value: Transport): Self = this.set("transport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransport: Self = this.set("transport", js.undefined)
  }
  
}

