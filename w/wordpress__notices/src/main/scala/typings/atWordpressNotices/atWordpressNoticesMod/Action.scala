package typings.atWordpressNotices.atWordpressNoticesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atWordpressNotices.atWordpressNoticesMod.URLAction
  - typings.atWordpressNotices.atWordpressNoticesMod.CallbackAction
*/
trait Action extends js.Object

object Action {
  @scala.inline
  def URLAction(label: String, url: String): Action = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def CallbackAction(callback: () => Unit, label: String): Action = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Action]
  }
}

