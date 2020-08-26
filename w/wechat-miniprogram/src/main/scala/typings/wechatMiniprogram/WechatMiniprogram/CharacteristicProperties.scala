package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 特征值支持的操作 */
@js.native
trait CharacteristicProperties extends js.Object {
  /** 回包 */
  var indicate: js.UndefOr[Boolean] = js.native
  /** 订阅 */
  @JSName("notify")
  var notify_FCharacteristicProperties: js.UndefOr[Boolean] = js.native
  /** 读 */
  var read: js.UndefOr[Boolean] = js.native
  /** 写 */
  var write: js.UndefOr[Boolean] = js.native
}

object CharacteristicProperties {
  @scala.inline
  def apply(): CharacteristicProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CharacteristicProperties]
  }
  @scala.inline
  implicit class CharacteristicPropertiesOps[Self <: CharacteristicProperties] (val x: Self) extends AnyVal {
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
    def setIndicate(value: Boolean): Self = this.set("indicate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndicate: Self = this.set("indicate", js.undefined)
    @scala.inline
    def setNotify(value: Boolean): Self = this.set("notify", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotify: Self = this.set("notify", js.undefined)
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

