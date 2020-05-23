package typings.webtorrent.mod

import typings.webtorrent.anon.Files
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TorrentOptions extends js.Object {
  var announce: js.UndefOr[js.Array[_]] = js.undefined
  var getAnnounceOpts: js.UndefOr[js.Function0[Unit]] = js.undefined
  var maxWebConns: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var store: js.UndefOr[js.Function2[/* chunkLength */ Double, /* storeOpts */ Files, _]] = js.undefined
}

object TorrentOptions {
  @scala.inline
  def apply(
    announce: js.Array[_] = null,
    getAnnounceOpts: () => Unit = null,
    maxWebConns: js.UndefOr[Double] = js.undefined,
    name: String = null,
    path: String = null,
    store: (/* chunkLength */ Double, /* storeOpts */ Files) => _ = null
  ): TorrentOptions = {
    val __obj = js.Dynamic.literal()
    if (announce != null) __obj.updateDynamic("announce")(announce.asInstanceOf[js.Any])
    if (getAnnounceOpts != null) __obj.updateDynamic("getAnnounceOpts")(js.Any.fromFunction0(getAnnounceOpts))
    if (!js.isUndefined(maxWebConns)) __obj.updateDynamic("maxWebConns")(maxWebConns.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (store != null) __obj.updateDynamic("store")(js.Any.fromFunction2(store))
    __obj.asInstanceOf[TorrentOptions]
  }
}

