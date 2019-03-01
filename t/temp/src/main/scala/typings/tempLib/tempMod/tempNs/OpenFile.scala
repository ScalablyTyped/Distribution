package typings
package tempLib.tempMod.tempNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenFile extends js.Object {
  var fd: scala.Double
  var path: java.lang.String
}

object OpenFile {
  @scala.inline
  def apply(fd: scala.Double, path: java.lang.String): OpenFile = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fd")(fd)
    __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[OpenFile]
  }
}

