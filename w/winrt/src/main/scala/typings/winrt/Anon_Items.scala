package typings.winrt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Items[T] extends js.Object {
  var items: js.Array[T]
  var returnValue: Double
}

object Anon_Items {
  @scala.inline
  def apply[T](items: js.Array[T], returnValue: Double): Anon_Items[T] = {
    val __obj = js.Dynamic.literal(items = items, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_Items[T]]
  }
}

