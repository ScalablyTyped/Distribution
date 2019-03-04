package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailRecipients extends js.Object {
  var emailAddresses: js.Array[java.lang.String]
  var tfsIds: js.Array[java.lang.String]
}

object EmailRecipients {
  @scala.inline
  def apply(emailAddresses: js.Array[java.lang.String], tfsIds: js.Array[java.lang.String]): EmailRecipients = {
    val __obj = js.Dynamic.literal(emailAddresses = emailAddresses, tfsIds = tfsIds)
  
    __obj.asInstanceOf[EmailRecipients]
  }
}

