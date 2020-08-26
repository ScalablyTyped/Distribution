package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 数据缓存
@js.native
trait SetStorageOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 需要存储的内容 */
  var data: js.Any | String = js.native
  /** 本地缓存中的指定的 key */
  var key: String = js.native
}

object SetStorageOptions {
  @scala.inline
  def apply(data: js.Any | String, key: String): SetStorageOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetStorageOptions]
  }
  @scala.inline
  implicit class SetStorageOptionsOps[Self <: SetStorageOptions] (val x: Self) extends AnyVal {
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
    def setData(value: js.Any | String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
  }
  
}

