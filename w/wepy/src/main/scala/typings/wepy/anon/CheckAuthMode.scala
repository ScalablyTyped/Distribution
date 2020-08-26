package typings.wepy.anon

import typings.wepy.wepyStrings.facial
import typings.wepy.wepyStrings.fingerPrint
import typings.wepy.wepyStrings.speech
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckAuthMode extends js.Object {
  var checkAuthMode: fingerPrint | facial | speech = js.native
}

object CheckAuthMode {
  @scala.inline
  def apply(checkAuthMode: fingerPrint | facial | speech): CheckAuthMode = {
    val __obj = js.Dynamic.literal(checkAuthMode = checkAuthMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckAuthMode]
  }
  @scala.inline
  implicit class CheckAuthModeOps[Self <: CheckAuthMode] (val x: Self) extends AnyVal {
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
    def setCheckAuthMode(value: fingerPrint | facial | speech): Self = this.set("checkAuthMode", value.asInstanceOf[js.Any])
  }
  
}

