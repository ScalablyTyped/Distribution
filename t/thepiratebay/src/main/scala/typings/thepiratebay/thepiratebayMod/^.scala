package typings.thepiratebay.thepiratebayMod

import typings.thepiratebay.Anon_Link
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("thepiratebay", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getCategories(): js.Promise[js.Array[CategoryGroup]] = js.native
  def getComments(id: String): js.Promise[js.Array[Comment]] = js.native
  def getComments(id: Double): js.Promise[js.Array[Comment]] = js.native
  def getTorrent(id: String): js.Promise[TorrentDetails] = js.native
  def getTorrent(id: Double): js.Promise[TorrentDetails] = js.native
  def getTorrent(id: Anon_Link): js.Promise[TorrentDetails] = js.native
  def getTvShow(id: String): js.Promise[js.Array[TVSeason]] = js.native
  def getTvShow(id: Double): js.Promise[js.Array[TVSeason]] = js.native
  def recentTorrents(): js.Promise[js.Array[TorrentSearchResult]] = js.native
  def search(): js.Promise[js.Array[TorrentSearchResult]] = js.native
  def search(query: String): js.Promise[js.Array[TorrentSearchResult]] = js.native
  def search(query: String, options: SearchOptions): js.Promise[js.Array[TorrentSearchResult]] = js.native
  def topTorrents(): js.Promise[js.Array[TorrentSearchResult]] = js.native
  def topTorrents(category: Double): js.Promise[js.Array[TorrentSearchResult]] = js.native
  def userTorrents(user: String): js.Promise[js.Array[TorrentSearchResult]] = js.native
  def userTorrents(user: String, options: SearchOptions): js.Promise[js.Array[TorrentSearchResult]] = js.native
}

