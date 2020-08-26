package typings.testingbotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestingBotOptions extends js.Object {
  var api_key: js.UndefOr[String] = js.native
  var api_secret: js.UndefOr[String] = js.native
}

object TestingBotOptions {
  @scala.inline
  def apply(): TestingBotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestingBotOptions]
  }
  @scala.inline
  implicit class TestingBotOptionsOps[Self <: TestingBotOptions] (val x: Self) extends AnyVal {
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
    def setApi_key(value: String): Self = this.set("api_key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApi_key: Self = this.set("api_key", js.undefined)
    @scala.inline
    def setApi_secret(value: String): Self = this.set("api_secret", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApi_secret: Self = this.set("api_secret", js.undefined)
  }
  
}

