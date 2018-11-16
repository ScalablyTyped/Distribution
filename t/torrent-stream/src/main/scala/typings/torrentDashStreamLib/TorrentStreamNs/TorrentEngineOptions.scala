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

