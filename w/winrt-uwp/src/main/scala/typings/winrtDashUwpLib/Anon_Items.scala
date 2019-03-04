package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Items[T] extends js.Object {
  /** The items in the collection. */ var items: T
  /** The number of items in the collection. */ var returnValue: scala.Double
}

object Anon_Items {
  @scala.inline
  def apply[T](items: T, returnValue: scala.Double): Anon_Items[T] = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_Items[T]]
  }
}

