package typings.webdriverJsExtender.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefineCommand extends js.Object {
  def defineCommand(name: String, method: String, path: String): Unit = js.native
}

object DefineCommand {
  @scala.inline
  def apply(defineCommand: (String, String, String) => Unit): DefineCommand = {
    val __obj = js.Dynamic.literal(defineCommand = js.Any.fromFunction3(defineCommand))
    __obj.asInstanceOf[DefineCommand]
  }
  @scala.inline
  implicit class DefineCommandOps[Self <: DefineCommand] (val x: Self) extends AnyVal {
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
    def setDefineCommand(value: (String, String, String) => Unit): Self = this.set("defineCommand", js.Any.fromFunction3(value))
  }
  
}

