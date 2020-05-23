package typings.winrt.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Items[T] extends js.Object {
  var items: js.Array[T]
  var returnValue: Double
}

object Items {
  @scala.inline
  def apply[T](items: js.Array[T], returnValue: Double): Items[T] = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Items[T]]
  }
}

