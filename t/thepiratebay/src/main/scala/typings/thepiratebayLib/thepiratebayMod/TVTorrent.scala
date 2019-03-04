package typings
package thepiratebayLib.thepiratebayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TVTorrent extends js.Object {
  var id: java.lang.String
  var link: java.lang.String
  var title: java.lang.String
}

object TVTorrent {
  @scala.inline
  def apply(id: java.lang.String, link: java.lang.String, title: java.lang.String): TVTorrent = {
    val __obj = js.Dynamic.literal(id = id, link = link, title = title)
  
    __obj.asInstanceOf[TVTorrent]
  }
}

