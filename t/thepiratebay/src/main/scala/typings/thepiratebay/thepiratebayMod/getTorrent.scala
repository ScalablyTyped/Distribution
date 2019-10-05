package typings.thepiratebay.thepiratebayMod

import typings.thepiratebay.Anon_Link
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("thepiratebay", "getTorrent")
@js.native
object getTorrent extends js.Object {
  def apply(id: String): js.Promise[TorrentDetails] = js.native
  def apply(id: Double): js.Promise[TorrentDetails] = js.native
  def apply(id: Anon_Link): js.Promise[TorrentDetails] = js.native
}

