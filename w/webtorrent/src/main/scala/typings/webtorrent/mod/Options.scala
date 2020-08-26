package typings.webtorrent.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var dht: js.UndefOr[Boolean | js.Object] = js.native
  var maxConns: js.UndefOr[Double] = js.native
  var nodeId: js.UndefOr[String | Buffer] = js.native
  var peerId: js.UndefOr[String | Buffer] = js.native
  var tracker: js.UndefOr[Boolean | js.Object] = js.native
  var webSeeds: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setDht(value: Boolean | js.Object): Self = this.set("dht", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDht: Self = this.set("dht", js.undefined)
    @scala.inline
    def setMaxConns(value: Double): Self = this.set("maxConns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxConns: Self = this.set("maxConns", js.undefined)
    @scala.inline
    def setNodeId(value: String | Buffer): Self = this.set("nodeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeId: Self = this.set("nodeId", js.undefined)
    @scala.inline
    def setPeerId(value: String | Buffer): Self = this.set("peerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeerId: Self = this.set("peerId", js.undefined)
    @scala.inline
    def setTracker(value: Boolean | js.Object): Self = this.set("tracker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTracker: Self = this.set("tracker", js.undefined)
    @scala.inline
    def setWebSeeds(value: Boolean): Self = this.set("webSeeds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebSeeds: Self = this.set("webSeeds", js.undefined)
  }
  
}

