package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAttachment extends js.Object {
  var attachment: Double
  var changeEntry: Double
}

object AnonAttachment {
  @scala.inline
  def apply(attachment: Double, changeEntry: Double): AnonAttachment = {
    val __obj = js.Dynamic.literal(attachment = attachment.asInstanceOf[js.Any], changeEntry = changeEntry.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAttachment]
  }
}

