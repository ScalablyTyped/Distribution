package typings.thepiratebay.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("thepiratebay", "search")
@js.native
object search extends js.Object {
  def apply(): js.Promise[js.Array[TorrentSearchResult]] = js.native
  def apply(query: js.UndefOr[scala.Nothing], options: SearchOptions): js.Promise[js.Array[TorrentSearchResult]] = js.native
  def apply(query: String): js.Promise[js.Array[TorrentSearchResult]] = js.native
  def apply(query: String, options: SearchOptions): js.Promise[js.Array[TorrentSearchResult]] = js.native
}

