package typings
package torrentDashStreamLib.TorrentStreamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Swarm extends js.Object {
  var downloaded: scala.Double
}

object Swarm {
  @scala.inline
  def apply(downloaded: scala.Double): Swarm = {
    val __obj = js.Dynamic.literal(downloaded = downloaded)
  
    __obj.asInstanceOf[Swarm]
  }
}

