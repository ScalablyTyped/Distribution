package typings.vsoNodeApi.galleryInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class QuestionOps[Self <: Question] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setResponsesVarargs(value: Response*): Self = this.set("responses", js.Array(value :_*))
    @scala.inline
    def setResponses(value: js.Array[Response]): Self = this.set("responses", value.asInstanceOf[js.Any])
  }
  
}

