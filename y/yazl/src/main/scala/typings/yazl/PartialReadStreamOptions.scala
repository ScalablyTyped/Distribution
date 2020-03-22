package typings.yazl

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<yazl.yazl.ReadStreamOptions> */
trait PartialReadStreamOptions extends js.Object {
  var compress: js.UndefOr[Boolean] = js.undefined
  var forceZip64Format: js.UndefOr[Boolean] = js.undefined
  var mode: js.UndefOr[Double] = js.undefined
  var mtime: js.UndefOr[Date] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
}

object PartialReadStreamOptions {
  @scala.inline
  def apply(
    compress: js.UndefOr[Boolean] = js.undefined,
    forceZip64Format: js.UndefOr[Boolean] = js.undefined,
    mode: Int | Double = null,
    mtime: Date = null,
    size: Int | Double = null
  ): PartialReadStreamOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compress)) __obj.updateDynamic("compress")(compress.asInstanceOf[js.Any])
    if (!js.isUndefined(forceZip64Format)) __obj.updateDynamic("forceZip64Format")(forceZip64Format.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (mtime != null) __obj.updateDynamic("mtime")(mtime.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialReadStreamOptions]
  }
}

