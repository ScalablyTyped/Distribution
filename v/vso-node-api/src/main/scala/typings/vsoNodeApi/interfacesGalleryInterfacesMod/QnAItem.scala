package typings.vsoNodeApi.interfacesGalleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QnAItem extends StObject {
  
  /**
    * Time when the review was first created
    */
  var createdDate: js.Date
  
  /**
    * Unique identifier of a QnA item
    */
  var id: Double
  
  /**
    * Get status of item
    */
  var status: QnAItemStatus
  
  /**
    * Text description of the QnA item
    */
  var text: String
  
  /**
    * Time when the review was edited/updated
    */
  var updatedDate: js.Date
  
  /**
    * User details for the item.
    */
  var user: UserIdentityRef
}
object QnAItem {
  
  inline def apply(
    createdDate: js.Date,
    id: Double,
    status: QnAItemStatus,
    text: String,
    updatedDate: js.Date,
    user: UserIdentityRef
  ): QnAItem = {
    val __obj = js.Dynamic.literal(createdDate = createdDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], updatedDate = updatedDate.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[QnAItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QnAItem] (val x: Self) extends AnyVal {
    
    inline def setCreatedDate(value: js.Date): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: QnAItemStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setUpdatedDate(value: js.Date): Self = StObject.set(x, "updatedDate", value.asInstanceOf[js.Any])
    
    inline def setUser(value: UserIdentityRef): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
