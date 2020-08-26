package typings.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filter extends js.Object {
  /** Gets the field that is currently being filtered. */
  def getFieldAsync(): js.Promise[Field] = js.native
  /** Gets the name of the field being filtered. Note that this is the caption as shown in the UI and not the actual database field name. */
  def getFieldName(): String = js.native
  /** Gets the type of the filter. See FilterType Enum for the values in the enum. */
  def getFilterType(): FilterType = js.native
  /** Gets the parent worksheet */
  def getWorksheet(): Worksheet = js.native
}

object Filter {
  @scala.inline
  def apply(
    getFieldAsync: () => js.Promise[Field],
    getFieldName: () => String,
    getFilterType: () => FilterType,
    getWorksheet: () => Worksheet
  ): Filter = {
    val __obj = js.Dynamic.literal(getFieldAsync = js.Any.fromFunction0(getFieldAsync), getFieldName = js.Any.fromFunction0(getFieldName), getFilterType = js.Any.fromFunction0(getFilterType), getWorksheet = js.Any.fromFunction0(getWorksheet))
    __obj.asInstanceOf[Filter]
  }
  @scala.inline
  implicit class FilterOps[Self <: Filter] (val x: Self) extends AnyVal {
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
    def setGetFieldAsync(value: () => js.Promise[Field]): Self = this.set("getFieldAsync", js.Any.fromFunction0(value))
    @scala.inline
    def setGetFieldName(value: () => String): Self = this.set("getFieldName", js.Any.fromFunction0(value))
    @scala.inline
    def setGetFilterType(value: () => FilterType): Self = this.set("getFilterType", js.Any.fromFunction0(value))
    @scala.inline
    def setGetWorksheet(value: () => Worksheet): Self = this.set("getWorksheet", js.Any.fromFunction0(value))
  }
  
}

