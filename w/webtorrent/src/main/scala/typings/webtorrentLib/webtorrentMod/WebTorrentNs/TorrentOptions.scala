package typings
package webtorrentLib.webtorrentMod.WebTorrentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TorrentOptions extends js.Object {
  var announce: js.UndefOr[js.Array[_]] = js.undefined
  var getAnnounceOpts: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var maxWebConns: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var store: js.UndefOr[
    js.Function2[/* chunkLength */ scala.Double, /* storeOpts */ webtorrentLib.Anon_Files, _]
  ] = js.undefined
}

