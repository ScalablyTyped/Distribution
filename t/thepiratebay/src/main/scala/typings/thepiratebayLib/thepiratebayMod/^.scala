package typings
package thepiratebayLib.thepiratebayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("thepiratebay", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getCategories(): js.Promise[js.Array[CategoryGroup]] = js.native
  def getComments(id: java.lang.String): js.Promise[js.Array[Comment]] = js.native
  def getComments(id: scala.Double): js.Promise[js.Array[Comment]] = js.native
  def getTorrent(id: java.lang.String): js.Promise[TorrentDetails] = js.native
  def getTorrent(id: scala.Double): js.Promise[TorrentDetails] = js.native
  def getTorrent(id: thepiratebayLib.Anon_Link): js.Promise[TorrentDetails] = js.native
  def getTvShow(id: java.lang.String): js.Promise[js.Array[TVSeason]] = js.native
  def getTvShow(id: scala.Double): js.Promise[js.Array[TVSeason]] = js.native
  def recentTorrents(): js.Promise[js.Array[TorrentSearchResult]] = js.native
  def search(): js.Promise[js.Array[TorrentSearchResult]] = js.native
  def search(query: java.lang.String): js.Promise[js.Array[TorrentSearchResult]] = js.native
  def search(query: java.lang.String, options: SearchOptions): js.Promise[js.Array[TorrentSearchResult]] = js.native
  def topTorrents(): js.Promise[js.Array[TorrentSearchResult]] = js.native
  def topTorrents(category: scala.Double): js.Promise[js.Array[TorrentSearchResult]] = js.native
  def userTorrents(user: java.lang.String): js.Promise[js.Array[TorrentSearchResult]] = js.native
  def userTorrents(user: java.lang.String, options: SearchOptions): js.Promise[js.Array[TorrentSearchResult]] = js.native
}

