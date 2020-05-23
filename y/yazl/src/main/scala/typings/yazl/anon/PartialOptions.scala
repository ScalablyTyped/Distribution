package typings.yazl.anon

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<yazl.yazl.Options> */
trait PartialOptions extends js.Object {
  var compress: js.UndefOr[Boolean] = js.undefined
  var forceZip64Format: js.UndefOr[Boolean] = js.undefined
  var mode: js.UndefOr[Double] = js.undefined
  var mtime: js.UndefOr[Date] = js.undefined
}

object PartialOptions {
  @scala.inline
  def apply(
    compress: js.UndefOr[Boolean] = js.undefined,
    forceZip64Format: js.UndefOr[Boolean] = js.undefined,
    mode: js.UndefOr[Double] = js.undefined,
    mtime: Date = null
  ): PartialOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compress)) __obj.updateDynamic("compress")(compress.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceZip64Format)) __obj.updateDynamic("forceZip64Format")(forceZip64Format.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mode)) __obj.updateDynamic("mode")(mode.get.asInstanceOf[js.Any])
    if (mtime != null) __obj.updateDynamic("mtime")(mtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOptions]
  }
}

