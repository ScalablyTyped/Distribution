package typings.tabrisPluginFirebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClearAll extends js.Object {
  def clearAll(): Unit
  def getAll(): js.Array[js.Object]
}

object AnonClearAll {
  @scala.inline
  def apply(clearAll: () => Unit, getAll: () => js.Array[js.Object]): AnonClearAll = {
    val __obj = js.Dynamic.literal(clearAll = js.Any.fromFunction0(clearAll), getAll = js.Any.fromFunction0(getAll))
    __obj.asInstanceOf[AnonClearAll]
  }
}

