package typings.tmp.mod

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
    val __obj = js.Dynamic.literal(fd = fd.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], removeCallback = js.Any.fromFunction0(removeCallback))
    __obj.asInstanceOf[FileResult]
  }
}

