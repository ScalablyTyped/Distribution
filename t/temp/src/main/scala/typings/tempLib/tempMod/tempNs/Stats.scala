package typings
package tempLib.tempMod.tempNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stats extends js.Object {
  var dirs: scala.Double
  var files: scala.Double
}

object Stats {
  @scala.inline
  def apply(dirs: scala.Double, files: scala.Double): Stats = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dirs")(dirs)
    __obj.updateDynamic("files")(files)
    __obj.asInstanceOf[Stats]
  }
}

