package typings
package thepiratebayLib.thepiratebayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("thepiratebay", JSImport.Namespace)
@js.native
object thepiratebayModMembers extends js.Object {
  def getCategories(): stdLib.Promise[js.Array[CategoryGroup]] = js.native
  def getComments(id: java.lang.String): stdLib.Promise[js.Array[Comment]] = js.native
  def getComments(id: scala.Double): stdLib.Promise[js.Array[Comment]] = js.native
  def getTorrent(id: java.lang.String): stdLib.Promise[TorrentDetails] = js.native
  def getTorrent(id: scala.Double): stdLib.Promise[TorrentDetails] = js.native
  def getTorrent(id: thepiratebayLib.Anon_PropName): stdLib.Promise[TorrentDetails] = js.native
  def getTvShow(id: java.lang.String): stdLib.Promise[js.Array[TVSeason]] = js.native
  def getTvShow(id: scala.Double): stdLib.Promise[js.Array[TVSeason]] = js.native
  def recentTorrents(): stdLib.Promise[js.Array[TorrentSearchResult]] = js.native
  def search(): stdLib.Promise[js.Array[TorrentSearchResult]] = js.native
  def search(query: java.lang.String): stdLib.Promise[js.Array[TorrentSearchResult]] = js.native
  def search(query: java.lang.String, options: SearchOptions): stdLib.Promise[js.Array[TorrentSearchResult]] = js.native
  def topTorrents(): stdLib.Promise[js.Array[TorrentSearchResult]] = js.native
  def topTorrents(category: scala.Double): stdLib.Promise[js.Array[TorrentSearchResult]] = js.native
  def userTorrents(user: java.lang.String): stdLib.Promise[js.Array[TorrentSearchResult]] = js.native
  def userTorrents(user: java.lang.String, options: SearchOptions): stdLib.Promise[js.Array[TorrentSearchResult]] = js.native
}

