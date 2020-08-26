package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 环境变量 */
@js.native
trait env extends js.Object {
  /** 文件系统中的用户目录路径 (本地路径) */
  var USER_DATA_PATH: String = js.native
}

object env {
  @scala.inline
  def apply(USER_DATA_PATH: String): env = {
    val __obj = js.Dynamic.literal(USER_DATA_PATH = USER_DATA_PATH.asInstanceOf[js.Any])
    __obj.asInstanceOf[env]
  }
  @scala.inline
  implicit class envOps[Self <: env] (val x: Self) extends AnyVal {
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

