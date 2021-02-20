package typings.vsoNodeApi.galleryInterfacesMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QnAItem extends StObject {
  
  /**
    * Time when the review was first created
    */
  var createdDate: Date = js.native
  
  /**
    * Unique identifier of a QnA item
    */
  var id: Double = js.native
  
  /**
    * Get status of item
    */
  var status: QnAItemStatus = js.native
  
  /**
    * Text description of the QnA item
    */
  var text: String = js.native
  
  /**
    * Time when the review was edited/updated
    */
  var updatedDate: Date = js.native
  
  /**
    * User details for the item.
    */
  var user: UserIdentityRef = js.native
}
object QnAItem {
  
  @scala.inline
  def apply(
    createdDate: Date,
    id: Double,
    status: QnAItemStatus,
    text: String,
    updatedDate: Date,
    user: UserIdentityRef
  ): QnAItem = {
    val __obj = js.Dynamic.literal(createdDate = createdDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], updatedDate = updatedDate.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[QnAItem]
  }
  
  @scala.inline
  implicit class QnAItemMutableBuilder[Self <: QnAItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedDate(value: Date): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: QnAItemStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedDate(value: Date): Self = StObject.set(x, "updatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: UserIdentityRef): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
