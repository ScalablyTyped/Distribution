package typings.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSource extends js.Object {
  /** Gets an array of Fields associated with the DataSource. */
  def getFields(): js.Array[Field]
  /** Indicates whether this DataSource is a primary or a secondary data source. */
  def getIsPrimary(): Boolean
  /** The name of the DataSource as seen in the UI. */
  def getName(): String
}

object DataSource {
  @scala.inline
  def apply(getFields: () => js.Array[Field], getIsPrimary: () => Boolean, getName: () => String): DataSource = {
    val __obj = js.Dynamic.literal(getFields = js.Any.fromFunction0(getFields), getIsPrimary = js.Any.fromFunction0(getIsPrimary), getName = js.Any.fromFunction0(getName))
    __obj.asInstanceOf[DataSource]
  }
}

