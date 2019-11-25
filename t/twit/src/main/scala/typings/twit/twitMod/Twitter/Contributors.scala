package typings.twit.twitMod.Twitter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Contributors extends js.Object {
  var id: Double
  var id_str: String
  var screen_name: String
}

object Contributors {
  @scala.inline
  def apply(id: Double, id_str: String, screen_name: String): Contributors = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], id_str = id_str.asInstanceOf[js.Any], screen_name = screen_name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Contributors]
  }
}

