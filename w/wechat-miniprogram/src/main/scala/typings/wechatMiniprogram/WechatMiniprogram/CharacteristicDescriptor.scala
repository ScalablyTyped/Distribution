package typings.wechatMiniprogram.WechatMiniprogram

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 描述符数据 */
@js.native
trait CharacteristicDescriptor extends js.Object {
  /** 描述符的权限 */
  var permission: js.UndefOr[DescriptorPermission] = js.native
  /** Descriptor 的 uuid */
  var uuid: String = js.native
  /** 描述符数据 */
  var value: js.UndefOr[ArrayBuffer] = js.native
}

object CharacteristicDescriptor {
  @scala.inline
  def apply(uuid: String): CharacteristicDescriptor = {
    val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[CharacteristicDescriptor]
  }
  @scala.inline
  implicit class CharacteristicDescriptorOps[Self <: CharacteristicDescriptor] (val x: Self) extends AnyVal {
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
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
    @scala.inline
    def setPermission(value: DescriptorPermission): Self = this.set("permission", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermission: Self = this.set("permission", js.undefined)
    @scala.inline
    def setValue(value: ArrayBuffer): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

