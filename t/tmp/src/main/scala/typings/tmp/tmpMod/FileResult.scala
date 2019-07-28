package typings.tmp.tmpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileResult extends js.Object {
  var fd: Double
  var name: String
  def removeCallback(): Unit
}

object FileResult {
  @scala.inline
  def apply(fd: Double, name: String, removeCallback: () => Unit): FileResult = {
    val __obj = js.Dynamic.literal(fd = fd, name = name, removeCallback = js.Any.fromFunction0(removeCallback))
  
    __obj.asInstanceOf[FileResult]
  }
}

