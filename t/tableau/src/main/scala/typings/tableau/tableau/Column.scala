package typings.tableau.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Column extends StObject {
  
  /** The data type of the column. Possible values are float, integer, string, boolean, date, and datetime. */
  def getDataType(): String
  
  /** The name of the column. */
  def getFieldName(): String
  
  /** The number of rows in the returned data. */
  def getIndex(): Double
  
  /** Whether the column data is referenced in the visualization. */
  def getIsReferenced(): Boolean
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
  implicit class ColumnMutableBuilder[Self <: Column] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetDataType(value: () => String): Self = StObject.set(x, "getDataType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFieldName(value: () => String): Self = StObject.set(x, "getFieldName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIndex(value: () => Double): Self = StObject.set(x, "getIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIsReferenced(value: () => Boolean): Self = StObject.set(x, "getIsReferenced", js.Any.fromFunction0(value))
  }
}
