package typings.writeFileAtomic.mod

import typings.writeFileAtomic.anon.Gid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var chown: js.UndefOr[Gid] = js.undefined
  var encoding: js.UndefOr[String] = js.undefined
  var fsync: js.UndefOr[Boolean] = js.undefined
  var mode: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    chown: Gid = null,
    encoding: String = null,
    fsync: js.UndefOr[Boolean] = js.undefined,
    mode: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (chown != null) __obj.updateDynamic("chown")(chown.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(fsync)) __obj.updateDynamic("fsync")(fsync.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mode)) __obj.updateDynamic("mode")(mode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

