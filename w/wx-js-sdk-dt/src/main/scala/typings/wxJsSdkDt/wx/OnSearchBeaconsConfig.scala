package typings.wxJsSdkDt.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnSearchBeaconsConfig extends WxBaseRequestConfig {
  @JSName("complete")
  def complete_MOnSearchBeaconsConfig(argv: js.Any): Unit = js.native
}

object OnSearchBeaconsConfig {
  @scala.inline
  def apply(complete: js.Any => Unit): OnSearchBeaconsConfig = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete))
    __obj.asInstanceOf[OnSearchBeaconsConfig]
  }
  @scala.inline
  implicit class OnSearchBeaconsConfigOps[Self <: OnSearchBeaconsConfig] (val x: Self) extends AnyVal {
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
    def setComplete(value: js.Any => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
  }
  
}

