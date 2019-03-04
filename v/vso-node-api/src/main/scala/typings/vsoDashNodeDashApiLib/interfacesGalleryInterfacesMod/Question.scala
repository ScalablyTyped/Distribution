package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Question extends QnAItem {
  /**
    * List of answers in for the question / thread
    */
  var responses: js.Array[Response]
}

object Question {
  @scala.inline
  def apply(
    createdDate: stdLib.Date,
    id: scala.Double,
    responses: js.Array[Response],
    status: QnAItemStatus,
    text: java.lang.String,
    updatedDate: stdLib.Date,
    user: UserIdentityRef
  ): Question = {
    val __obj = js.Dynamic.literal(createdDate = createdDate, id = id, responses = responses, status = status, text = text, updatedDate = updatedDate, user = user)
  
    __obj.asInstanceOf[Question]
  }
}

