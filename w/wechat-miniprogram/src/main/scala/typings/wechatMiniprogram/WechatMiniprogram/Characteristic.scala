package typings.wechatMiniprogram.WechatMiniprogram

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** characteristics列表 */
@js.native
trait Characteristic extends js.Object {
  /** 描述符数据 */
  var descriptors: js.UndefOr[js.Array[CharacteristicDescriptor]] = js.native
  /** 特征值权限 */
  var permission: js.UndefOr[CharacteristicPermission] = js.native
  /** 特征值支持的操作 */
  var properties: js.UndefOr[CharacteristicProperties] = js.native
  /** Characteristic 的 uuid */
  var uuid: String = js.native
  /** 特征值对应的二进制值 */
  var value: js.UndefOr[ArrayBuffer] = js.native
}

object Characteristic {
  @scala.inline
  def apply(uuid: String): Characteristic = {
    val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Characteristic]
  }
  @scala.inline
  implicit class CharacteristicOps[Self <: Characteristic] (val x: Self) extends AnyVal {
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
    def setDescriptorsVarargs(value: CharacteristicDescriptor*): Self = this.set("descriptors", js.Array(value :_*))
    @scala.inline
    def setDescriptors(value: js.Array[CharacteristicDescriptor]): Self = this.set("descriptors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescriptors: Self = this.set("descriptors", js.undefined)
    @scala.inline
    def setPermission(value: CharacteristicPermission): Self = this.set("permission", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermission: Self = this.set("permission", js.undefined)
    @scala.inline
    def setProperties(value: CharacteristicProperties): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setValue(value: ArrayBuffer): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

