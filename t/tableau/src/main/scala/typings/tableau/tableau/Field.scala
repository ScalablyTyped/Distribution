package typings.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("tableau.Field")
@js.native
class Field () extends js.Object {
  def getAggregation(): FieldAggregationType = js.native
  /** Gets the data source to which this field belongs. */
  def getDataSource(): DataSource = js.native
  /** Gets the field name (i.e. caption). */
  def getName(): String = js.native
  /** One of the following values: DIMENSION, MEASURE, UKNOWN */
  def getRole(): FieldRoleType = js.native
}

