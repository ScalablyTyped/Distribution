package typings.winrt.Windows.ApplicationModel.Contacts

import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Storage.Streams.IRandomAccessStreamReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IContact extends StObject {
  
  var fields: IVector[IContactField]
  
  var name: String
  
  var thumbnail: IRandomAccessStreamReference
}
object IContact {
  
  @scala.inline
  def apply(fields: IVector[IContactField], name: String, thumbnail: IRandomAccessStreamReference): IContact = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContact]
  }
  
  @scala.inline
  implicit class IContactMutableBuilder[Self <: IContact] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: IVector[IContactField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnail(value: IRandomAccessStreamReference): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
  }
}
