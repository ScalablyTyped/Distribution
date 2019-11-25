package typings.twit.twitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaParam extends js.Object {
  var file_path: String
}

object MediaParam {
  @scala.inline
  def apply(file_path: String): MediaParam = {
    val __obj = js.Dynamic.literal(file_path = file_path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MediaParam]
  }
}

