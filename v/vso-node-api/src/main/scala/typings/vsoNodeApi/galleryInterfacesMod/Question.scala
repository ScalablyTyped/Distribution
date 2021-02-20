package typings.vsoNodeApi.galleryInterfacesMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Question extends QnAItem {
  
  /**
    * List of answers in for the question / thread
    */
  var responses: js.Array[Response] = js.native
}
object Question {
  
  @scala.inline
  def apply(
    createdDate: Date,
    id: Double,
    responses: js.Array[Response],
    status: QnAItemStatus,
    text: String,
    updatedDate: Date,
    user: UserIdentityRef
  ): Question = {
    val __obj = js.Dynamic.literal(createdDate = createdDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], updatedDate = updatedDate.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Question]
  }
  
  @scala.inline
  implicit class QuestionMutableBuilder[Self <: Question] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResponses(value: js.Array[Response]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsesVarargs(value: Response*): Self = StObject.set(x, "responses", js.Array(value :_*))
  }
}
