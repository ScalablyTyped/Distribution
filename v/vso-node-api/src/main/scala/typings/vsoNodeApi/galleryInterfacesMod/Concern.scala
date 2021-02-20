package typings.vsoNodeApi.galleryInterfacesMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Concern extends QnAItem {
  
  /**
    * Category of the concern
    */
  var category: ConcernCategory = js.native
}
object Concern {
  
  @scala.inline
  def apply(
    category: ConcernCategory,
    createdDate: Date,
    id: Double,
    status: QnAItemStatus,
    text: String,
    updatedDate: Date,
    user: UserIdentityRef
  ): Concern = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], updatedDate = updatedDate.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Concern]
  }
  
  @scala.inline
  implicit class ConcernMutableBuilder[Self <: Concern] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: ConcernCategory): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
  }
}
