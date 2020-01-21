package typings.typedGithubApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHtml extends js.Object {
  var html: String
  var self: String
}

object AnonHtml {
  @scala.inline
  def apply(html: String, self: String): AnonHtml = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHtml]
  }
}

