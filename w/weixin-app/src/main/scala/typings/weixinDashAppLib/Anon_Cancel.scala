package typings
package weixinDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cancel extends js.Object {
  /**
  			 * 为 true 时，表示用户点击了取消（用于 Android 系统区分点击蒙层关闭还是点击取消按钮关闭）
  			 */
  var cancel: scala.Boolean
  /**
  			 * 为 true 时，表示用户点击了确定按钮
  			 */
  var confirm: scala.Boolean
}

object Anon_Cancel {
  @scala.inline
  def apply(cancel: scala.Boolean, confirm: scala.Boolean): Anon_Cancel = {
    val __obj = js.Dynamic.literal(cancel = cancel, confirm = confirm)
  
    __obj.asInstanceOf[Anon_Cancel]
  }
}

