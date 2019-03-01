package typings
package torrentDashStreamLib.TorrentStreamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TorrentEngineOptions extends js.Object {
  var connections: js.UndefOr[scala.Double] = js.undefined
   // Verify previously stored data before starting.
  var dht: js.UndefOr[scala.Boolean] = js.undefined
   // Root folder for the files storage. Default folder under /tmp/torrent-stream/{infoHash}.
  var path: js.UndefOr[java.lang.String] = js.undefined
   // Allows to declare additional custom trackers to use.
  var storage: js.UndefOr[js.Any] = js.undefined
   // Number of upload slots.
  var tmp: js.UndefOr[java.lang.String] = js.undefined
   // Whether or not to use DHT to initialize the swarm.
  var tracker: js.UndefOr[scala.Boolean] = js.undefined
   // Whether or not to use trackers from torrent file or magnet link.
  var trackers: js.UndefOr[js.Array[java.lang.String]] = js.undefined
   // Max amount of peers to be connected to.
  var uploads: js.UndefOr[scala.Double] = js.undefined
   // Path where to save the files. Overrides 'tmp'.
  var verify: js.UndefOr[scala.Boolean] = js.undefined
}

object TorrentEngineOptions {
  @scala.inline
  def apply(
    connections: scala.Int | scala.Double = null,
    dht: js.UndefOr[scala.Boolean] = js.undefined,
    path: java.lang.String = null,
    storage: js.Any = null,
    tmp: java.lang.String = null,
    tracker: js.UndefOr[scala.Boolean] = js.undefined,
    trackers: js.Array[java.lang.String] = null,
    uploads: scala.Int | scala.Double = null,
    verify: js.UndefOr[scala.Boolean] = js.undefined
  ): TorrentEngineOptions = {
    val __obj = js.Dynamic.literal()
    if (connections != null) __obj.updateDynamic("connections")(connections.asInstanceOf[js.Any])
    if (!js.isUndefined(dht)) __obj.updateDynamic("dht")(dht)
    if (path != null) __obj.updateDynamic("path")(path)
    if (storage != null) __obj.updateDynamic("storage")(storage)
    if (tmp != null) __obj.updateDynamic("tmp")(tmp)
    if (!js.isUndefined(tracker)) __obj.updateDynamic("tracker")(tracker)
    if (trackers != null) __obj.updateDynamic("trackers")(trackers)
    if (uploads != null) __obj.updateDynamic("uploads")(uploads.asInstanceOf[js.Any])
    if (!js.isUndefined(verify)) __obj.updateDynamic("verify")(verify)
    __obj.asInstanceOf[TorrentEngineOptions]
  }
}

