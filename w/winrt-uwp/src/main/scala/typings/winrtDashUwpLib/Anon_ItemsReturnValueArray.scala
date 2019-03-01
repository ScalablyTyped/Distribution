package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueArray extends js.Object {
  /** The file name extensions in the collection that start at startIndex. */ var items: js.Array[java.lang.String]
  /** The number of items retrieved. */ var returnValue: scala.Double
}

object Anon_ItemsReturnValueArray {
  @scala.inline
  def apply(items: js.Array[java.lang.String], returnValue: scala.Double): Anon_ItemsReturnValueArray = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("returnValue")(returnValue)
    __obj.asInstanceOf[Anon_ItemsReturnValueArray]
  }
}

