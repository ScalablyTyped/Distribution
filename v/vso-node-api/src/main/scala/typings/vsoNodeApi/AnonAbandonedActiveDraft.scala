package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAbandonedActiveDraft extends js.Object {
  var abandoned: Double
  var active: Double
  var draft: Double
  var undefined: Double
}

object AnonAbandonedActiveDraft {
  @scala.inline
  def apply(abandoned: Double, active: Double, draft: Double, undefined: Double): AnonAbandonedActiveDraft = {
    val __obj = js.Dynamic.literal(abandoned = abandoned.asInstanceOf[js.Any], active = active.asInstanceOf[js.Any], draft = draft.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAbandonedActiveDraft]
  }
}

