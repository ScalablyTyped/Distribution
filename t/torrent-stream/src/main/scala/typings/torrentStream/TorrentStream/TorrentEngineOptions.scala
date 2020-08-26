package typings.torrentStream.TorrentStream

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TorrentEngineOptions extends js.Object {
  var connections: js.UndefOr[Double] = js.native
   // Verify previously stored data before starting.
  var dht: js.UndefOr[Boolean] = js.native
   // Root folder for the files storage. Default folder under /tmp/torrent-stream/{infoHash}.
  var path: js.UndefOr[String] = js.native
   // Allows to declare additional custom trackers to use.
  var storage: js.UndefOr[js.Any] = js.native
   // Number of upload slots.
  var tmp: js.UndefOr[String] = js.native
   // Whether or not to use DHT to initialize the swarm.
  var tracker: js.UndefOr[Boolean] = js.native
   // Whether or not to use trackers from torrent file or magnet link.
  var trackers: js.UndefOr[js.Array[String]] = js.native
   // Max amount of peers to be connected to.
  var uploads: js.UndefOr[Double] = js.native
   // Path where to save the files. Overrides 'tmp'.
  var verify: js.UndefOr[Boolean] = js.native
}

object TorrentEngineOptions {
  @scala.inline
  def apply(): TorrentEngineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TorrentEngineOptions]
  }
  @scala.inline
  implicit class TorrentEngineOptionsOps[Self <: TorrentEngineOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConnections(value: Double): Self = this.set("connections", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnections: Self = this.set("connections", js.undefined)
    @scala.inline
    def setDht(value: Boolean): Self = this.set("dht", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDht: Self = this.set("dht", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setStorage(value: js.Any): Self = this.set("storage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorage: Self = this.set("storage", js.undefined)
    @scala.inline
    def setTmp(value: String): Self = this.set("tmp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTmp: Self = this.set("tmp", js.undefined)
    @scala.inline
    def setTracker(value: Boolean): Self = this.set("tracker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTracker: Self = this.set("tracker", js.undefined)
    @scala.inline
    def setTrackersVarargs(value: String*): Self = this.set("trackers", js.Array(value :_*))
    @scala.inline
    def setTrackers(value: js.Array[String]): Self = this.set("trackers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackers: Self = this.set("trackers", js.undefined)
    @scala.inline
    def setUploads(value: Double): Self = this.set("uploads", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploads: Self = this.set("uploads", js.undefined)
    @scala.inline
    def setVerify(value: Boolean): Self = this.set("verify", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerify: Self = this.set("verify", js.undefined)
  }
  
}

