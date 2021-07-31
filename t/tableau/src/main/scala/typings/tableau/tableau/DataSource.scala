package typings.tableau.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSource extends StObject {
  
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
  
  @scala.inline
  implicit class DataSourceMutableBuilder[Self <: DataSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetFields(value: () => js.Array[Field]): Self = StObject.set(x, "getFields", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIsPrimary(value: () => Boolean): Self = StObject.set(x, "getIsPrimary", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
  }
}
