package typings
package yazlLib.yazlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectoryOptions extends js.Object {
  var mode: scala.Double
  var mtime: stdLib.Date
}

object DirectoryOptions {
  @scala.inline
  def apply(mode: scala.Double, mtime: stdLib.Date): DirectoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mode")(mode)
    __obj.updateDynamic("mtime")(mtime)
    __obj.asInstanceOf[DirectoryOptions]
  }
}

