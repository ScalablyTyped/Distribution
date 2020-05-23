package typings.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Field extends js.Object {
  def getAggregation(): FieldAggregationType
  /** Gets the data source to which this field belongs. */
  def getDataSource(): DataSource
  /** Gets the field name (i.e. caption). */
  def getName(): String
  /** One of the following values: DIMENSION, MEASURE, UKNOWN */
  def getRole(): FieldRoleType
}

object Field {
  @scala.inline
  def apply(
    getAggregation: () => FieldAggregationType,
    getDataSource: () => DataSource,
    getName: () => String,
    getRole: () => FieldRoleType
  ): Field = {
    val __obj = js.Dynamic.literal(getAggregation = js.Any.fromFunction0(getAggregation), getDataSource = js.Any.fromFunction0(getDataSource), getName = js.Any.fromFunction0(getName), getRole = js.Any.fromFunction0(getRole))
    __obj.asInstanceOf[Field]
  }
}

