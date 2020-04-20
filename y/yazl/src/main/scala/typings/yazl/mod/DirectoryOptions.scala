package typings.yazl.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectoryOptions extends js.Object {
  var mode: Double
  var mtime: Date
}

object DirectoryOptions {
  @scala.inline
  def apply(mode: Double, mtime: Date): DirectoryOptions = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryOptions]
  }
}

