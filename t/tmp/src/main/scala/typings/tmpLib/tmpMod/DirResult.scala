package typings
package tmpLib.tmpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirResult extends js.Object {
  var name: java.lang.String
  def removeCallback(): scala.Unit
}

object DirResult {
  @scala.inline
  def apply(name: java.lang.String, removeCallback: () => scala.Unit): DirResult = {
    val __obj = js.Dynamic.literal(name = name, removeCallback = js.Any.fromFunction0(removeCallback))
  
    __obj.asInstanceOf[DirResult]
  }
}

