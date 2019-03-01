package typings
package yazlLib.yazlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var compress: scala.Boolean
  var forceZip64Format: scala.Boolean
  var mode: scala.Double
  var mtime: stdLib.Date
}

object Options {
  @scala.inline
  def apply(compress: scala.Boolean, forceZip64Format: scala.Boolean, mode: scala.Double, mtime: stdLib.Date): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("compress")(compress)
    __obj.updateDynamic("forceZip64Format")(forceZip64Format)
    __obj.updateDynamic("mode")(mode)
    __obj.updateDynamic("mtime")(mtime)
    __obj.asInstanceOf[Options]
  }
}

