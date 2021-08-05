package typings.winrtUwp.Windows.Storage.Search

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An entry in the SortOrder list the specifies a property and ordering that is used to sort query results. */
trait SortEntry extends StObject {
  
  /** True to sort content in the query results in ascending order based on the property name, or false to sort content in descending order. */
  var ascendingOrder: Boolean
  
  /** The name of the property to use for sorting, like System.Author. The property must be registered on the system. */
  var propertyName: String
}
object SortEntry {
  
  inline def apply(ascendingOrder: Boolean, propertyName: String): SortEntry = {
    val __obj = js.Dynamic.literal(ascendingOrder = ascendingOrder.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortEntry]
  }
  
  extension [Self <: SortEntry](x: Self) {
    
    inline def setAscendingOrder(value: Boolean): Self = StObject.set(x, "ascendingOrder", value.asInstanceOf[js.Any])
    
    inline def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
  }
}
