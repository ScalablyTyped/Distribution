package typings.writeDashFileDashAtomic.writeDashFileDashAtomicMod

import typings.writeDashFileDashAtomic.Anon_Gid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var chown: js.UndefOr[Anon_Gid] = js.undefined
  var encoding: js.UndefOr[String] = js.undefined
  var fsync: js.UndefOr[Boolean] = js.undefined
  var mode: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    chown: Anon_Gid = null,
    encoding: String = null,
    fsync: js.UndefOr[Boolean] = js.undefined,
    mode: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (chown != null) __obj.updateDynamic("chown")(chown)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (!js.isUndefined(fsync)) __obj.updateDynamic("fsync")(fsync)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

