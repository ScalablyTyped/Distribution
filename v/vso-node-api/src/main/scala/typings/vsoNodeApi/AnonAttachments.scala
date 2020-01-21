package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAttachments extends js.Object {
  var attachments: Double
  var custom: Double
  var history: Double
  var links: Double
}

object AnonAttachments {
  @scala.inline
  def apply(attachments: Double, custom: Double, history: Double, links: Double): AnonAttachments = {
    val __obj = js.Dynamic.literal(attachments = attachments.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], history = history.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAttachments]
  }
}

