package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Issue extends js.Object {
  var issueType: String
  var message: String
}

object Issue {
  @scala.inline
  def apply(issueType: String, message: String): Issue = {
    val __obj = js.Dynamic.literal(issueType = issueType.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Issue]
  }
}

