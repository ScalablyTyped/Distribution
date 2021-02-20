package typings.winrt.Windows.Storage.FileProperties

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBasicProperties extends StObject {
  
  var dateModified: Date = js.native
  
  var itemDate: Date = js.native
  
  var size: Double = js.native
}
object IBasicProperties {
  
  @scala.inline
  def apply(dateModified: Date, itemDate: Date, size: Double): IBasicProperties = {
    val __obj = js.Dynamic.literal(dateModified = dateModified.asInstanceOf[js.Any], itemDate = itemDate.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBasicProperties]
  }
  
  @scala.inline
  implicit class IBasicPropertiesMutableBuilder[Self <: IBasicProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDateModified(value: Date): Self = StObject.set(x, "dateModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemDate(value: Date): Self = StObject.set(x, "itemDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
