package typings.winrt.Windows.Storage.Search

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SortEntry extends StObject {
  
  var ascendingOrder: Boolean
  
  var propertyName: String
}
object SortEntry {
  
  @scala.inline
  def apply(ascendingOrder: Boolean, propertyName: String): SortEntry = {
    val __obj = js.Dynamic.literal(ascendingOrder = ascendingOrder.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortEntry]
  }
  
  @scala.inline
  implicit class SortEntryMutableBuilder[Self <: SortEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAscendingOrder(value: Boolean): Self = StObject.set(x, "ascendingOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
  }
}
