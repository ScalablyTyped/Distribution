package typings
package torrentDashSearchDashApiLib.torrentDashSearchDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("torrent-search-api", JSImport.Namespace)
@js.native
object torrentDashSearchDashApiModMembers extends js.Object {
  def addProvider(provider: java.lang.String): scala.Unit = js.native
  def disableAllProviders(): scala.Unit = js.native
  def disableProvider(providerName: java.lang.String): scala.Unit = js.native
  def downloadTorrent(torrent: Torrent): stdLib.Promise[java.lang.String] = js.native
  def downloadTorrent(torrent: Torrent, filenamePath: java.lang.String): stdLib.Promise[java.lang.String] = js.native
  def enableProvider(providerName: java.lang.String): scala.Unit = js.native
  def enableProvider(providerName: java.lang.String, args: java.lang.String*): scala.Unit = js.native
  def enableProvider(providerName: java.lang.String, args: js.Array[java.lang.String]): scala.Unit = js.native
  def enablePublicProviders(): scala.Unit = js.native
  def getActiveProviders(): js.Array[TorrentProvider] = js.native
  def getMagnet(torrent: Torrent): stdLib.Promise[java.lang.String] = js.native
  def getProvider(name: java.lang.String, throwOnError: scala.Boolean): java.lang.String = js.native
  def getProviders(): js.Array[TorrentProvider] = js.native
  def getTorrentDetails(torrent: Torrent): stdLib.Promise[java.lang.String] = js.native
  def isProviderActive(name: java.lang.String): scala.Boolean = js.native
  def loadProvider(providerParam: java.lang.String): scala.Unit = js.native
  def loadProvider(providerParam: TorrentProvider): scala.Unit = js.native
  def loadProviders(args: (java.lang.String | TorrentProvider)*): scala.Unit = js.native
  def lodProvider(providerParam: java.lang.String): scala.Unit = js.native
  def overrideConfig(providerName: java.lang.String, newConfig: TorrentProvider): stdLib.Promise[java.lang.String] = js.native
  def removeProvider(providerName: java.lang.String): scala.Unit = js.native
  def search(
    providers: js.Array[java.lang.String],
    query: java.lang.String,
    category: java.lang.String,
    limit: scala.Double
  ): stdLib.Promise[js.Array[Torrent]] = js.native
  def search(query: java.lang.String, category: java.lang.String, limit: scala.Double): stdLib.Promise[js.Array[Torrent]] = js.native
}

