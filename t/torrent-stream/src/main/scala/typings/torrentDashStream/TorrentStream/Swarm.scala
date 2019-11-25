package typings.torrentDashStream.TorrentStream

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Swarm extends js.Object {
  var downloaded: Double
}

object Swarm {
  @scala.inline
  def apply(downloaded: Double): Swarm = {
    val __obj = js.Dynamic.literal(downloaded = downloaded.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Swarm]
  }
}

