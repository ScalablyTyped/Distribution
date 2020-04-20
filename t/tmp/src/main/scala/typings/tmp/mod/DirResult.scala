package typings.tmp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirResult extends js.Object {
  var name: String
  def removeCallback(): Unit
}

object DirResult {
  @scala.inline
  def apply(name: String, removeCallback: () => Unit): DirResult = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], removeCallback = js.Any.fromFunction0(removeCallback))
    __obj.asInstanceOf[DirResult]
  }
}

