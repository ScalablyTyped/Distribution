package typings
package tempLib.tempMod

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
    val __obj = js.Dynamic.literal(fd = fd, path = path)
  
    __obj.asInstanceOf[OpenFile]
  }
}

