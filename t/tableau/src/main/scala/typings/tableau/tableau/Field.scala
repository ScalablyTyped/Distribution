package typings.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Field extends js.Object {
  def getAggregation(): FieldAggregationType = js.native
  /** Gets the data source to which this field belongs. */
  def getDataSource(): DataSource = js.native
  /** Gets the field name (i.e. caption). */
  def getName(): String = js.native
  /** One of the following values: DIMENSION, MEASURE, UKNOWN */
  def getRole(): FieldRoleType = js.native
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
  @scala.inline
  implicit class FieldOps[Self <: Field] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetAggregation(value: () => FieldAggregationType): Self = this.set("getAggregation", js.Any.fromFunction0(value))
    @scala.inline
    def setGetDataSource(value: () => DataSource): Self = this.set("getDataSource", js.Any.fromFunction0(value))
    @scala.inline
    def setGetName(value: () => String): Self = this.set("getName", js.Any.fromFunction0(value))
    @scala.inline
    def setGetRole(value: () => FieldRoleType): Self = this.set("getRole", js.Any.fromFunction0(value))
  }
  
}

