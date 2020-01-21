package typings.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HelpLink extends js.Object {
  var text: String
  var url: String
}

object HelpLink {
  @scala.inline
  def apply(text: String, url: String): HelpLink = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HelpLink]
  }
}

