package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailRecipients extends js.Object {
  var emailAddresses: js.Array[String]
  var tfsIds: js.Array[String]
}

object EmailRecipients {
  @scala.inline
  def apply(emailAddresses: js.Array[String], tfsIds: js.Array[String]): EmailRecipients = {
    val __obj = js.Dynamic.literal(emailAddresses = emailAddresses, tfsIds = tfsIds)
  
    __obj.asInstanceOf[EmailRecipients]
  }
}

