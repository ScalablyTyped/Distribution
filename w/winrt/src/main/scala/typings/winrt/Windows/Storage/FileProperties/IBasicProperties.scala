package typings.winrt.Windows.Storage.FileProperties

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBasicProperties extends StObject {
  
  var dateModified: Date
  
  var itemDate: Date
  
  var size: Double
}
object IBasicProperties {
  
  inline def apply(dateModified: Date, itemDate: Date, size: Double): IBasicProperties = {
    val __obj = js.Dynamic.literal(dateModified = dateModified.asInstanceOf[js.Any], itemDate = itemDate.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBasicProperties]
  }
  
  extension [Self <: IBasicProperties](x: Self) {
    
    inline def setDateModified(value: Date): Self = StObject.set(x, "dateModified", value.asInstanceOf[js.Any])
    
    inline def setItemDate(value: Date): Self = StObject.set(x, "itemDate", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
