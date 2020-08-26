package typings.tslint.ruleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICodeExample extends js.Object {
  var config: String = js.native
  var description: String = js.native
  var fail: js.UndefOr[String] = js.native
  var pass: String = js.native
}

object ICodeExample {
  @scala.inline
  def apply(config: String, description: String, pass: String): ICodeExample = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICodeExample]
  }
  @scala.inline
  implicit class ICodeExampleOps[Self <: ICodeExample] (val x: Self) extends AnyVal {
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
    def setConfig(value: String): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setPass(value: String): Self = this.set("pass", value.asInstanceOf[js.Any])
    @scala.inline
    def setFail(value: String): Self = this.set("fail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
  }
  
}

