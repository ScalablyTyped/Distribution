package typings.atWordpressNotices.atWordpressNoticesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URLAction extends Action {
  var label: String
  var url: String
}

object URLAction {
  @scala.inline
  def apply(label: String, url: String): URLAction = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[URLAction]
  }
}

