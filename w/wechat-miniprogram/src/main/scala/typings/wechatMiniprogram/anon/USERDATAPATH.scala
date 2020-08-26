package typings.wechatMiniprogram.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait USERDATAPATH extends js.Object {
  var USER_DATA_PATH: String = js.native
}

object USERDATAPATH {
  @scala.inline
  def apply(USER_DATA_PATH: String): USERDATAPATH = {
    val __obj = js.Dynamic.literal(USER_DATA_PATH = USER_DATA_PATH.asInstanceOf[js.Any])
    __obj.asInstanceOf[USERDATAPATH]
  }
  @scala.inline
  implicit class USERDATAPATHOps[Self <: USERDATAPATH] (val x: Self) extends AnyVal {
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
    def setUSER_DATA_PATH(value: String): Self = this.set("USER_DATA_PATH", value.asInstanceOf[js.Any])
  }
  
}

