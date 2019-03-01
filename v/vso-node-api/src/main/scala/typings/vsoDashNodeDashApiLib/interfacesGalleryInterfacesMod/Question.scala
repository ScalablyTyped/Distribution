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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createdDate")(createdDate)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("responses")(responses)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("text")(text)
    __obj.updateDynamic("updatedDate")(updatedDate)
    __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[Question]
  }
}

