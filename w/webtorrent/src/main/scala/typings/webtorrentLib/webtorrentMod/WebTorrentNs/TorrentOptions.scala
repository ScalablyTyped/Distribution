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

object TorrentOptions {
  @scala.inline
  def apply(
    announce: js.Array[_] = null,
    getAnnounceOpts: () => scala.Unit = null,
    maxWebConns: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    path: java.lang.String = null,
    store: (/* chunkLength */ scala.Double, /* storeOpts */ webtorrentLib.Anon_Files) => _ = null
  ): TorrentOptions = {
    val __obj = js.Dynamic.literal()
    if (announce != null) __obj.updateDynamic("announce")(announce)
    if (getAnnounceOpts != null) __obj.updateDynamic("getAnnounceOpts")(js.Any.fromFunction0(getAnnounceOpts))
    if (maxWebConns != null) __obj.updateDynamic("maxWebConns")(maxWebConns.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (path != null) __obj.updateDynamic("path")(path)
    if (store != null) __obj.updateDynamic("store")(js.Any.fromFunction2(store))
    __obj.asInstanceOf[TorrentOptions]
  }
}

