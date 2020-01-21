package typings.thepiratebay.mod

import typings.thepiratebay.AnonLink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("thepiratebay", "getTorrent")
@js.native
object getTorrent extends js.Object {
  def apply(id: String): js.Promise[TorrentDetails] = js.native
  def apply(id: Double): js.Promise[TorrentDetails] = js.native
  def apply(id: AnonLink): js.Promise[TorrentDetails] = js.native
}

