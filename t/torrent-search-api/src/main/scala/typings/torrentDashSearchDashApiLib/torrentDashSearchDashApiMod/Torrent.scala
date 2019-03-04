package typings
package torrentDashSearchDashApiLib.torrentDashSearchDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Torrent extends js.Object {
  var desc: java.lang.String
  var magnet: java.lang.String
  var provider: java.lang.String
  var size: java.lang.String
  var time: java.lang.String
  var title: java.lang.String
}

object Torrent {
  @scala.inline
  def apply(
    desc: java.lang.String,
    magnet: java.lang.String,
    provider: java.lang.String,
    size: java.lang.String,
    time: java.lang.String,
    title: java.lang.String
  ): Torrent = {
    val __obj = js.Dynamic.literal(desc = desc, magnet = magnet, provider = provider, size = size, time = time, title = title)
  
    __obj.asInstanceOf[Torrent]
  }
}

