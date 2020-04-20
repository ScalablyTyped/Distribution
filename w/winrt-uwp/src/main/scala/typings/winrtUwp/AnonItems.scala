package typings.winrtUwp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItems[T] extends js.Object {
  /** The items in the collection. */ var items: T
  /** The number of items in the collection. */ var returnValue: Double
}

object AnonItems {
  @scala.inline
  def apply[T](items: T, returnValue: Double): AnonItems[T] = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItems[T]]
  }
}

