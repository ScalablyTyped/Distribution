package typings
package tailLib.tailMod.TailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TailOptions extends js.Object {
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var follow: js.UndefOr[scala.Boolean] = js.undefined
  var fromBeginning: js.UndefOr[scala.Boolean] = js.undefined
  var fsWatchOptions: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  var logger: js.UndefOr[js.Any] = js.undefined
  var separator: js.UndefOr[java.lang.String | stdLib.RegExp] = js.undefined
  var useWatchFile: js.UndefOr[scala.Boolean] = js.undefined
}

object TailOptions {
  @scala.inline
  def apply(
    encoding: java.lang.String = null,
    follow: js.UndefOr[scala.Boolean] = js.undefined,
    fromBeginning: js.UndefOr[scala.Boolean] = js.undefined,
    fsWatchOptions: stdLib.Record[java.lang.String, _] = null,
    logger: js.Any = null,
    separator: java.lang.String | stdLib.RegExp = null,
    useWatchFile: js.UndefOr[scala.Boolean] = js.undefined
  ): TailOptions = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (!js.isUndefined(follow)) __obj.updateDynamic("follow")(follow)
    if (!js.isUndefined(fromBeginning)) __obj.updateDynamic("fromBeginning")(fromBeginning)
    if (fsWatchOptions != null) __obj.updateDynamic("fsWatchOptions")(fsWatchOptions)
    if (logger != null) __obj.updateDynamic("logger")(logger)
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (!js.isUndefined(useWatchFile)) __obj.updateDynamic("useWatchFile")(useWatchFile)
    __obj.asInstanceOf[TailOptions]
  }
}

