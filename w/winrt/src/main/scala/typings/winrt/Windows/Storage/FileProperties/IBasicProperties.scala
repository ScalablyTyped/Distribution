package typings.winrt.Windows.Storage.FileProperties

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBasicProperties extends StObject {
  
  var dateModified: js.Date
  
  var itemDate: js.Date
  
  var size: Double
}
object IBasicProperties {
  
  inline def apply(dateModified: js.Date, itemDate: js.Date, size: Double): IBasicProperties = {
    val __obj = js.Dynamic.literal(dateModified = dateModified.asInstanceOf[js.Any], itemDate = itemDate.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBasicProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IBasicProperties] (val x: Self) extends AnyVal {
    
    inline def setDateModified(value: js.Date): Self = StObject.set(x, "dateModified", value.asInstanceOf[js.Any])
    
    inline def setItemDate(value: js.Date): Self = StObject.set(x, "itemDate", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
