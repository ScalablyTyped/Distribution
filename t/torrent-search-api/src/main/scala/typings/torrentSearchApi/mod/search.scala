package typings.torrentSearchApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("torrent-search-api", "search")
@js.native
object search extends js.Object {
  def apply(providers: js.Array[String], query: String, category: String, limit: Double): js.Promise[js.Array[Torrent]] = js.native
  def apply(query: String, category: String, limit: Double): js.Promise[js.Array[Torrent]] = js.native
}

