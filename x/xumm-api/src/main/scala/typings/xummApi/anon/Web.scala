package typings.xummApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Web extends js.Object {
  var app: String | Null = js.native
  var web: String | Null = js.native
}

object Web {
  @scala.inline
  def apply(): Web = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Web]
  }
  @scala.inline
  implicit class WebOps[Self <: Web] (val x: Self) extends AnyVal {
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
    def setApp(value: String): Self = this.set("app", value.asInstanceOf[js.Any])
    @scala.inline
    def setAppNull: Self = this.set("app", null)
    @scala.inline
    def setWeb(value: String): Self = this.set("web", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebNull: Self = this.set("web", null)
  }
  
}

