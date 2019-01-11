package typings
package thepiratebayLib.thepiratebayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("thepiratebay", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getCategories(): js.Promise[js.Array[thepiratebayLib.thepiratebayMod.CategoryGroup]] = js.native
  def getComments(id: java.lang.String): js.Promise[js.Array[thepiratebayLib.thepiratebayMod.Comment]] = js.native
  def getComments(id: scala.Double): js.Promise[js.Array[thepiratebayLib.thepiratebayMod.Comment]] = js.native
  def getTorrent(id: java.lang.String): js.Promise[thepiratebayLib.thepiratebayMod.TorrentDetails] = js.native
  def getTorrent(id: scala.Double): js.Promise[thepiratebayLib.thepiratebayMod.TorrentDetails] = js.native
  def getTorrent(id: thepiratebayLib.Anon_Link): js.Promise[thepiratebayLib.thepiratebayMod.TorrentDetails] = js.native
  def getTvShow(id: java.lang.String): js.Promise[js.Array[thepiratebayLib.thepiratebayMod.TVSeason]] = js.native
  def getTvShow(id: scala.Double): js.Promise[js.Array[thepiratebayLib.thepiratebayMod.TVSeason]] = js.native
  def recentTorrents(): js.Promise[js.Array[thepiratebayLib.thepiratebayMod.TorrentSearchResult]] = js.native
  def search(): js.Promise[js.Array[thepiratebayLib.thepiratebayMod.TorrentSearchResult]] = js.native
  def search(query: java.lang.String): js.Promise[js.Array[thepiratebayLib.thepiratebayMod.TorrentSearchResult]] = js.native
  def search(query: java.lang.String, options: thepiratebayLib.thepiratebayMod.SearchOptions): js.Promise[js.Array[thepiratebayLib.thepiratebayMod.TorrentSearchResult]] = js.native
  def topTorrents(): js.Promise[js.Array[thepiratebayLib.thepiratebayMod.TorrentSearchResult]] = js.native
  def topTorrents(category: scala.Double): js.Promise[js.Array[thepiratebayLib.thepiratebayMod.TorrentSearchResult]] = js.native
  def userTorrents(user: java.lang.String): js.Promise[js.Array[thepiratebayLib.thepiratebayMod.TorrentSearchResult]] = js.native
  def userTorrents(user: java.lang.String, options: thepiratebayLib.thepiratebayMod.SearchOptions): js.Promise[js.Array[thepiratebayLib.thepiratebayMod.TorrentSearchResult]] = js.native
}

