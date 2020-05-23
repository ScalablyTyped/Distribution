package typings.winrtUwp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Items[T] extends js.Object {
  /** The items in the collection. */ var items: T
  /** The number of items in the collection. */ var returnValue: Double
}

object Items {
  @scala.inline
  def apply[T](items: T, returnValue: Double): Items[T] = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Items[T]]
  }
}

