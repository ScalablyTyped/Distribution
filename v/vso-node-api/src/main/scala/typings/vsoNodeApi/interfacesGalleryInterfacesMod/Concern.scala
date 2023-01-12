package typings.vsoNodeApi.interfacesGalleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Concern
  extends StObject
     with QnAItem {
  
  /**
    * Category of the concern
    */
  var category: ConcernCategory
}
object Concern {
  
  inline def apply(
    category: ConcernCategory,
    createdDate: js.Date,
    id: Double,
    status: QnAItemStatus,
    text: String,
    updatedDate: js.Date,
    user: UserIdentityRef
  ): Concern = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], updatedDate = updatedDate.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Concern]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Concern] (val x: Self) extends AnyVal {
    
    inline def setCategory(value: ConcernCategory): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
  }
}
