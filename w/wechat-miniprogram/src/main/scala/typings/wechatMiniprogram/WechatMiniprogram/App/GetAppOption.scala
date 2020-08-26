package typings.wechatMiniprogram.WechatMiniprogram.App

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAppOption extends js.Object {
  /** 在 `App` 未定义时返回默认实现。当App被调用时，默认实现中定义的属性会被覆盖合并到App中。一般用于独立分包
    *
    * 最低基础库： 2.2.4
    */
  var allowDefault: js.UndefOr[Boolean] = js.native
}

object GetAppOption {
  @scala.inline
  def apply(): GetAppOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAppOption]
  }
  @scala.inline
  implicit class GetAppOptionOps[Self <: GetAppOption] (val x: Self) extends AnyVal {
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
    def setAllowDefault(value: Boolean): Self = this.set("allowDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowDefault: Self = this.set("allowDefault", js.undefined)
  }
  
}

