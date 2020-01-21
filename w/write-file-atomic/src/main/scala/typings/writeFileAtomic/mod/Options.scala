package typings.writeFileAtomic.mod

import typings.writeFileAtomic.AnonGid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var chown: js.UndefOr[AnonGid] = js.undefined
  var encoding: js.UndefOr[String] = js.undefined
  var fsync: js.UndefOr[Boolean] = js.undefined
  var mode: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    chown: AnonGid = null,
    encoding: String = null,
    fsync: js.UndefOr[Boolean] = js.undefined,
    mode: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (chown != null) __obj.updateDynamic("chown")(chown.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(fsync)) __obj.updateDynamic("fsync")(fsync.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

