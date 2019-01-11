package typings
package torrentDashSearchDashApiLib.torrentDashSearchDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("torrent-search-api", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def addProvider(provider: java.lang.String): scala.Unit = js.native
  def disableAllProviders(): scala.Unit = js.native
  def disableProvider(providerName: java.lang.String): scala.Unit = js.native
  def downloadTorrent(torrent: torrentDashSearchDashApiLib.torrentDashSearchDashApiMod.Torrent): js.Promise[java.lang.String] = js.native
  def downloadTorrent(
    torrent: torrentDashSearchDashApiLib.torrentDashSearchDashApiMod.Torrent,
    filenamePath: java.lang.String
  ): js.Promise[java.lang.String] = js.native
  def enableProvider(providerName: java.lang.String): scala.Unit = js.native
  def enableProvider(providerName: java.lang.String, args: java.lang.String*): scala.Unit = js.native
  def enableProvider(providerName: java.lang.String, args: js.Array[java.lang.String]): scala.Unit = js.native
  def enablePublicProviders(): scala.Unit = js.native
  def getActiveProviders(): js.Array[torrentDashSearchDashApiLib.torrentDashSearchDashApiMod.TorrentProvider] = js.native
  def getMagnet(torrent: torrentDashSearchDashApiLib.torrentDashSearchDashApiMod.Torrent): js.Promise[java.lang.String] = js.native
  def getProvider(name: java.lang.String, throwOnError: scala.Boolean): java.lang.String = js.native
  def getProviders(): js.Array[torrentDashSearchDashApiLib.torrentDashSearchDashApiMod.TorrentProvider] = js.native
  def getTorrentDetails(torrent: torrentDashSearchDashApiLib.torrentDashSearchDashApiMod.Torrent): js.Promise[java.lang.String] = js.native
  def isProviderActive(name: java.lang.String): scala.Boolean = js.native
  def loadProvider(providerParam: java.lang.String): scala.Unit = js.native
  def loadProvider(providerParam: torrentDashSearchDashApiLib.torrentDashSearchDashApiMod.TorrentProvider): scala.Unit = js.native
  def loadProviders(
    args: (java.lang.String | torrentDashSearchDashApiLib.torrentDashSearchDashApiMod.TorrentProvider)*
  ): scala.Unit = js.native
  def lodProvider(providerParam: java.lang.String): scala.Unit = js.native
  def overrideConfig(
    providerName: java.lang.String,
    newConfig: torrentDashSearchDashApiLib.torrentDashSearchDashApiMod.TorrentProvider
  ): js.Promise[java.lang.String] = js.native
  def removeProvider(providerName: java.lang.String): scala.Unit = js.native
  def search(
    providers: js.Array[java.lang.String],
    query: java.lang.String,
    category: java.lang.String,
    limit: scala.Double
  ): js.Promise[js.Array[torrentDashSearchDashApiLib.torrentDashSearchDashApiMod.Torrent]] = js.native
  def search(query: java.lang.String, category: java.lang.String, limit: scala.Double): js.Promise[js.Array[torrentDashSearchDashApiLib.torrentDashSearchDashApiMod.Torrent]] = js.native
}

