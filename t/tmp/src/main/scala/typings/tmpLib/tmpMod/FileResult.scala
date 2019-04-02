package typings
package tmpLib.tmpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileResult extends js.Object {
  var fd: scala.Double
  var name: java.lang.String
  def removeCallback(): scala.Unit
}

object FileResult {
  @scala.inline
  def apply(fd: scala.Double, name: java.lang.String, removeCallback: () => scala.Unit): FileResult = {
    val __obj = js.Dynamic.literal(fd = fd, name = name, removeCallback = js.Any.fromFunction0(removeCallback))
  
    __obj.asInstanceOf[FileResult]
  }
}

