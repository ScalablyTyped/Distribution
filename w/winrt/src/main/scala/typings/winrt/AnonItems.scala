package typings.winrt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItems[T] extends js.Object {
  var items: js.Array[T]
  var returnValue: Double
}

object AnonItems {
  @scala.inline
  def apply[T](items: js.Array[T], returnValue: Double): AnonItems[T] = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItems[T]]
  }
}

