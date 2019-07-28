package typings.temp.tempMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenFile extends js.Object {
  var fd: Double
  var path: String
}

object OpenFile {
  @scala.inline
  def apply(fd: Double, path: String): OpenFile = {
    val __obj = js.Dynamic.literal(fd = fd, path = path)
  
    __obj.asInstanceOf[OpenFile]
  }
}

