package typings
package winrtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Items[T] extends js.Object {
  var items: js.Array[T]
  var returnValue: scala.Double
}

object Anon_Items {
  @scala.inline
  def apply[T](items: js.Array[T], returnValue: scala.Double): Anon_Items[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("returnValue")(returnValue)
    __obj.asInstanceOf[Anon_Items[T]]
  }
}

