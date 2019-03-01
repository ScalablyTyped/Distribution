package typings
package webtorrentLib.webtorrentMod.WebTorrentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var dht: js.UndefOr[scala.Boolean | js.Object] = js.undefined
  var maxConns: js.UndefOr[scala.Double] = js.undefined
  var nodeId: js.UndefOr[java.lang.String | nodeLib.Buffer] = js.undefined
  var peerId: js.UndefOr[java.lang.String | nodeLib.Buffer] = js.undefined
  var tracker: js.UndefOr[scala.Boolean | js.Object] = js.undefined
  var webSeeds: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    dht: scala.Boolean | js.Object = null,
    maxConns: scala.Int | scala.Double = null,
    nodeId: java.lang.String | nodeLib.Buffer = null,
    peerId: java.lang.String | nodeLib.Buffer = null,
    tracker: scala.Boolean | js.Object = null,
    webSeeds: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (dht != null) __obj.updateDynamic("dht")(dht.asInstanceOf[js.Any])
    if (maxConns != null) __obj.updateDynamic("maxConns")(maxConns.asInstanceOf[js.Any])
    if (nodeId != null) __obj.updateDynamic("nodeId")(nodeId.asInstanceOf[js.Any])
    if (peerId != null) __obj.updateDynamic("peerId")(peerId.asInstanceOf[js.Any])
    if (tracker != null) __obj.updateDynamic("tracker")(tracker.asInstanceOf[js.Any])
    if (!js.isUndefined(webSeeds)) __obj.updateDynamic("webSeeds")(webSeeds)
    __obj.asInstanceOf[Options]
  }
}

