package typings.winrtDashUwp.WindowsNs.StorageNs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An entry in the SortOrder list the specifies a property and ordering that is used to sort query results. */
trait SortEntry extends js.Object {
  /** True to sort content in the query results in ascending order based on the property name, or false to sort content in descending order. */
  var ascendingOrder: Boolean
  /** The name of the property to use for sorting, like System.Author. The property must be registered on the system. */
  var propertyName: String
}

object SortEntry {
  @scala.inline
  def apply(ascendingOrder: Boolean, propertyName: String): SortEntry = {
    val __obj = js.Dynamic.literal(ascendingOrder = ascendingOrder, propertyName = propertyName)
  
    __obj.asInstanceOf[SortEntry]
  }
}

