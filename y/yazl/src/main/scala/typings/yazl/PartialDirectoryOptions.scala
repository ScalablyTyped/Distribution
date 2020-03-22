package typings.yazl

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<yazl.yazl.DirectoryOptions> */
trait PartialDirectoryOptions extends js.Object {
  var mode: js.UndefOr[Double] = js.undefined
  var mtime: js.UndefOr[Date] = js.undefined
}

object PartialDirectoryOptions {
  @scala.inline
  def apply(mode: Int | Double = null, mtime: Date = null): PartialDirectoryOptions = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (mtime != null) __obj.updateDynamic("mtime")(mtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialDirectoryOptions]
  }
}

