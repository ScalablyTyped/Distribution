package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 描述符的权限 */
@js.native
trait DescriptorPermission extends js.Object {
  /** 读 */
  var read: js.UndefOr[Boolean] = js.native
  /** 写 */
  var write: js.UndefOr[Boolean] = js.native
}

object DescriptorPermission {
  @scala.inline
  def apply(): DescriptorPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescriptorPermission]
  }
  @scala.inline
  implicit class DescriptorPermissionOps[Self <: DescriptorPermission] (val x: Self) extends AnyVal {
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
    def setRead(value: Boolean): Self = this.set("read", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRead: Self = this.set("read", js.undefined)
    @scala.inline
    def setWrite(value: Boolean): Self = this.set("write", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrite: Self = this.set("write", js.undefined)
  }
  
}

