package typings
package atWordpressNoticesLib.atWordpressNoticesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URLAction extends Action {
  var label: java.lang.String
  var url: java.lang.String
}

object URLAction {
  @scala.inline
  def apply(label: java.lang.String, url: java.lang.String): URLAction = {
    val __obj = js.Dynamic.literal(label = label, url = url)
  
    __obj.asInstanceOf[URLAction]
  }
}

