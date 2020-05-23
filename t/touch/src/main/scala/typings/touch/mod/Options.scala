package typings.touch.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var atime: js.UndefOr[Boolean | Date] = js.undefined
  var closeAfter: js.UndefOr[Boolean] = js.undefined
  var force: js.UndefOr[Boolean] = js.undefined
  var mtime: js.UndefOr[Boolean | Date] = js.undefined
  var nocreate: js.UndefOr[Boolean] = js.undefined
  var ref: js.UndefOr[String] = js.undefined
  var time: js.UndefOr[Date | String | Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    atime: Boolean | Date = null,
    closeAfter: js.UndefOr[Boolean] = js.undefined,
    force: js.UndefOr[Boolean] = js.undefined,
    mtime: Boolean | Date = null,
    nocreate: js.UndefOr[Boolean] = js.undefined,
    ref: String = null,
    time: Date | String | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (atime != null) __obj.updateDynamic("atime")(atime.asInstanceOf[js.Any])
    if (!js.isUndefined(closeAfter)) __obj.updateDynamic("closeAfter")(closeAfter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.get.asInstanceOf[js.Any])
    if (mtime != null) __obj.updateDynamic("mtime")(mtime.asInstanceOf[js.Any])
    if (!js.isUndefined(nocreate)) __obj.updateDynamic("nocreate")(nocreate.get.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

