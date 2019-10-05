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
    val __obj = js.Dynamic.literal(id = id, id_str = id_str, screen_name = screen_name)
  
    __obj.asInstanceOf[Contributors]
  }
}

