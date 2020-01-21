package typings.thepiratebay.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("thepiratebay", "topTorrents")
@js.native
object topTorrents extends js.Object {
  def apply(): js.Promise[js.Array[TorrentSearchResult]] = js.native
  def apply(category: Double): js.Promise[js.Array[TorrentSearchResult]] = js.native
}

