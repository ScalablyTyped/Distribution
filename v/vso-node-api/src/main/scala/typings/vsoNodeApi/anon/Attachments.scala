package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attachments extends js.Object {
  var attachments: scala.Double
  var custom: scala.Double
  var history: scala.Double
  var links: scala.Double
}

object Attachments {
  @scala.inline
  def apply(attachments: scala.Double, custom: scala.Double, history: scala.Double, links: scala.Double): Attachments = {
    val __obj = js.Dynamic.literal(attachments = attachments.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], history = history.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attachments]
  }
}

