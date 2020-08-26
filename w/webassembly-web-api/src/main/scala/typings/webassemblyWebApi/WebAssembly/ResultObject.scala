package typings.webassemblyWebApi.WebAssembly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultObject extends js.Object {
  var instance: Instance = js.native
  var module: Module = js.native
}

object ResultObject {
  @scala.inline
  def apply(instance: Instance, module: Module): ResultObject = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultObject]
  }
  @scala.inline
  implicit class ResultObjectOps[Self <: ResultObject] (val x: Self) extends AnyVal {
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
    def setInstance(value: Instance): Self = this.set("instance", value.asInstanceOf[js.Any])
    @scala.inline
    def setModule(value: Module): Self = this.set("module", value.asInstanceOf[js.Any])
  }
  
}

