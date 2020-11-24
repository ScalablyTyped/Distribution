package typings.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Column extends js.Object {
  
  /** The data type of the column. Possible values are float, integer, string, boolean, date, and datetime. */
  def getDataType(): String = js.native
  
  /** The name of the column. */
  def getFieldName(): String = js.native
  
  /** The number of rows in the returned data. */
  def getIndex(): Double = js.native
  
  /** Whether the column data is referenced in the visualization. */
  def getIsReferenced(): Boolean = js.native
}
object Column {
  
  @scala.inline
  def apply(
    getDataType: () => String,
    getFieldName: () => String,
    getIndex: () => Double,
    getIsReferenced: () => Boolean
  ): Column = {
    val __obj = js.Dynamic.literal(getDataType = js.Any.fromFunction0(getDataType), getFieldName = js.Any.fromFunction0(getFieldName), getIndex = js.Any.fromFunction0(getIndex), getIsReferenced = js.Any.fromFunction0(getIsReferenced))
    __obj.asInstanceOf[Column]
  }
  
  @scala.inline
  implicit class ColumnOps[Self <: Column] (val x: Self) extends AnyVal {
    
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
    def setGetDataType(value: () => String): Self = this.set("getDataType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFieldName(value: () => String): Self = this.set("getFieldName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIndex(value: () => Double): Self = this.set("getIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIsReferenced(value: () => Boolean): Self = this.set("getIsReferenced", js.Any.fromFunction0(value))
  }
}
