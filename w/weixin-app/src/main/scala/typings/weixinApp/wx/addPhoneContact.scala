package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.addPhoneContact")
@js.native
object addPhoneContact extends js.Object {
  /**
  	 * 增加 手机联系人
  	 * 调用后，用户可以选择将该表单以“新增联系人”或“添加到已有联系人”的方式
  	 * 写入手机系统通讯录
  	 * 完成手机通讯录联系人和联系方式的增加。
  	 * @version 1.2.0
  	 */
  def apply(options: PhoneContact): Unit = js.native
}

