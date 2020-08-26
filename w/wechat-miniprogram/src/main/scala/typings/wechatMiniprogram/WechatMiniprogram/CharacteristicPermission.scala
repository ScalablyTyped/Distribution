package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 特征值权限 */
@js.native
trait CharacteristicPermission extends js.Object {
  /** 加密读请求 */
  var readEncryptionRequired: js.UndefOr[Boolean] = js.native
  /** 可读 */
  var readable: js.UndefOr[Boolean] = js.native
  /** 加密写请求 */
  var writeEncryptionRequired: js.UndefOr[Boolean] = js.native
  /** 可写 */
  var writeable: js.UndefOr[Boolean] = js.native
}

object CharacteristicPermission {
  @scala.inline
  def apply(): CharacteristicPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CharacteristicPermission]
  }
  @scala.inline
  implicit class CharacteristicPermissionOps[Self <: CharacteristicPermission] (val x: Self) extends AnyVal {
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
    def setReadEncryptionRequired(value: Boolean): Self = this.set("readEncryptionRequired", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadEncryptionRequired: Self = this.set("readEncryptionRequired", js.undefined)
    @scala.inline
    def setReadable(value: Boolean): Self = this.set("readable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadable: Self = this.set("readable", js.undefined)
    @scala.inline
    def setWriteEncryptionRequired(value: Boolean): Self = this.set("writeEncryptionRequired", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWriteEncryptionRequired: Self = this.set("writeEncryptionRequired", js.undefined)
    @scala.inline
    def setWriteable(value: Boolean): Self = this.set("writeable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWriteable: Self = this.set("writeable", js.undefined)
  }
  
}

