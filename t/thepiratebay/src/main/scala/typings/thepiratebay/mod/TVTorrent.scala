package typings.thepiratebay.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TVTorrent extends js.Object {
  var id: String
  var link: String
  var title: String
}

object TVTorrent {
  @scala.inline
  def apply(id: String, link: String, title: String): TVTorrent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TVTorrent]
  }
}

