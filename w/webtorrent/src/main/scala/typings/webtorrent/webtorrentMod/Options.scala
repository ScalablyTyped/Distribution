package typings.webtorrent.webtorrentMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var dht: js.UndefOr[Boolean | js.Object] = js.undefined
  var maxConns: js.UndefOr[Double] = js.undefined
  var nodeId: js.UndefOr[String | Buffer] = js.undefined
  var peerId: js.UndefOr[String | Buffer] = js.undefined
  var tracker: js.UndefOr[Boolean | js.Object] = js.undefined
  var webSeeds: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    dht: Boolean | js.Object = null,
    maxConns: Int | Double = null,
    nodeId: String | Buffer = null,
    peerId: String | Buffer = null,
    tracker: Boolean | js.Object = null,
    webSeeds: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (dht != null) __obj.updateDynamic("dht")(dht.asInstanceOf[js.Any])
    if (maxConns != null) __obj.updateDynamic("maxConns")(maxConns.asInstanceOf[js.Any])
    if (nodeId != null) __obj.updateDynamic("nodeId")(nodeId.asInstanceOf[js.Any])
    if (peerId != null) __obj.updateDynamic("peerId")(peerId.asInstanceOf[js.Any])
    if (tracker != null) __obj.updateDynamic("tracker")(tracker.asInstanceOf[js.Any])
    if (!js.isUndefined(webSeeds)) __obj.updateDynamic("webSeeds")(webSeeds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

