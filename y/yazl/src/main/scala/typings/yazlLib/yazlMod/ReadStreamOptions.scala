package typings
package yazlLib.yazlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadStreamOptions extends Options {
  var size: scala.Double
}

object ReadStreamOptions {
  @scala.inline
  def apply(
    compress: scala.Boolean,
    forceZip64Format: scala.Boolean,
    mode: scala.Double,
    mtime: stdLib.Date,
    size: scala.Double
  ): ReadStreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("compress")(compress)
    __obj.updateDynamic("forceZip64Format")(forceZip64Format)
    __obj.updateDynamic("mode")(mode)
    __obj.updateDynamic("mtime")(mtime)
    __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[ReadStreamOptions]
  }
}

