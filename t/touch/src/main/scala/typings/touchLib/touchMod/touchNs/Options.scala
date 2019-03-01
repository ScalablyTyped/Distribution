package typings
package touchLib.touchMod.touchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var atime: js.UndefOr[scala.Boolean | stdLib.Date] = js.undefined
  var closeAfter: js.UndefOr[scala.Boolean] = js.undefined
  var force: js.UndefOr[scala.Boolean] = js.undefined
  var mtime: js.UndefOr[scala.Boolean | stdLib.Date] = js.undefined
  var nocreate: js.UndefOr[scala.Boolean] = js.undefined
  var ref: js.UndefOr[java.lang.String] = js.undefined
  var time: js.UndefOr[stdLib.Date | java.lang.String | scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    atime: scala.Boolean | stdLib.Date = null,
    closeAfter: js.UndefOr[scala.Boolean] = js.undefined,
    force: js.UndefOr[scala.Boolean] = js.undefined,
    mtime: scala.Boolean | stdLib.Date = null,
    nocreate: js.UndefOr[scala.Boolean] = js.undefined,
    ref: java.lang.String = null,
    time: stdLib.Date | java.lang.String | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (atime != null) __obj.updateDynamic("atime")(atime.asInstanceOf[js.Any])
    if (!js.isUndefined(closeAfter)) __obj.updateDynamic("closeAfter")(closeAfter)
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    if (mtime != null) __obj.updateDynamic("mtime")(mtime.asInstanceOf[js.Any])
    if (!js.isUndefined(nocreate)) __obj.updateDynamic("nocreate")(nocreate)
    if (ref != null) __obj.updateDynamic("ref")(ref)
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

