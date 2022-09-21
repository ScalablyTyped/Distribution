package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Question
  extends StObject
     with QnAItem {
  
  /**
    * List of answers in for the question / thread
    */
  var responses: js.Array[Response]
}
object Question {
  
  inline def apply(
    createdDate: js.Date,
    id: Double,
    responses: js.Array[Response],
    status: QnAItemStatus,
    text: String,
    updatedDate: js.Date,
    user: UserIdentityRef
  ): Question = {
    val __obj = js.Dynamic.literal(createdDate = createdDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], updatedDate = updatedDate.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Question]
  }
  
  extension [Self <: Question](x: Self) {
    
    inline def setResponses(value: js.Array[Response]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    inline def setResponsesVarargs(value: Response*): Self = StObject.set(x, "responses", js.Array(value*))
  }
}
