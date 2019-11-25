package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attachments extends js.Object {
  var attachments: Double
  var custom: Double
  var history: Double
  var links: Double
}

object Anon_Attachments {
  @scala.inline
  def apply(attachments: Double, custom: Double, history: Double, links: Double): Anon_Attachments = {
    val __obj = js.Dynamic.literal(attachments = attachments.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], history = history.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Attachments]
  }
}

