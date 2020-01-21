package typings.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogView extends js.Object {
  var file_size: Double
  var l: String
  var last_pos: Double
}

object LogView {
  @scala.inline
  def apply(file_size: Double, l: String, last_pos: Double): LogView = {
    val __obj = js.Dynamic.literal(file_size = file_size.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], last_pos = last_pos.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LogView]
  }
}

