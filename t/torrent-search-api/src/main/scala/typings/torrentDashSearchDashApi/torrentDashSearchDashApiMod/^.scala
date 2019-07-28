package typings.torrentDashSearchDashApi.torrentDashSearchDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("torrent-search-api", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def addProvider(provider: String): Unit = js.native
  def disableAllProviders(): Unit = js.native
  def disableProvider(providerName: String): Unit = js.native
  def downloadTorrent(torrent: Torrent): js.Promise[String] = js.native
  def downloadTorrent(torrent: Torrent, filenamePath: String): js.Promise[String] = js.native
  def enableProvider(providerName: String): Unit = js.native
  def enableProvider(providerName: String, args: String*): Unit = js.native
  def enableProvider(providerName: String, args: js.Array[String]): Unit = js.native
  def enablePublicProviders(): Unit = js.native
  def getActiveProviders(): js.Array[TorrentProvider] = js.native
  def getMagnet(torrent: Torrent): js.Promise[String] = js.native
  def getProvider(name: String, throwOnError: Boolean): String = js.native
  def getProviders(): js.Array[TorrentProvider] = js.native
  def getTorrentDetails(torrent: Torrent): js.Promise[String] = js.native
  def isProviderActive(name: String): Boolean = js.native
  def loadProvider(providerParam: String): Unit = js.native
  def loadProvider(providerParam: TorrentProvider): Unit = js.native
  def loadProviders(args: (String | TorrentProvider)*): Unit = js.native
  def lodProvider(providerParam: String): Unit = js.native
  def overrideConfig(providerName: String, newConfig: TorrentProvider): js.Promise[String] = js.native
  def removeProvider(providerName: String): Unit = js.native
  def search(providers: js.Array[String], query: String, category: String, limit: Double): js.Promise[js.Array[Torrent]] = js.native
  def search(query: String, category: String, limit: Double): js.Promise[js.Array[Torrent]] = js.native
}

