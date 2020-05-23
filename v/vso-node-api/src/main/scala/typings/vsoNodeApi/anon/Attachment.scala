package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attachment extends js.Object {
  var attachment: scala.Double
  var changeEntry: scala.Double
}

object Attachment {
  @scala.inline
  def apply(attachment: scala.Double, changeEntry: scala.Double): Attachment = {
    val __obj = js.Dynamic.literal(attachment = attachment.asInstanceOf[js.Any], changeEntry = changeEntry.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attachment]
  }
}

