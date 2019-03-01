package typings
package winrtLib.WindowsNs.StorageNs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortEntry extends js.Object {
  var ascendingOrder: scala.Boolean
  var propertyName: java.lang.String
}

object SortEntry {
  @scala.inline
  def apply(ascendingOrder: scala.Boolean, propertyName: java.lang.String): SortEntry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ascendingOrder")(ascendingOrder)
    __obj.updateDynamic("propertyName")(propertyName)
    __obj.asInstanceOf[SortEntry]
  }
}

