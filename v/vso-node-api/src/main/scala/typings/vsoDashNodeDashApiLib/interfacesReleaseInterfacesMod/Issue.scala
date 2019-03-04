package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Issue extends js.Object {
  var issueType: java.lang.String
  var message: java.lang.String
}

object Issue {
  @scala.inline
  def apply(issueType: java.lang.String, message: java.lang.String): Issue = {
    val __obj = js.Dynamic.literal(issueType = issueType, message = message)
  
    __obj.asInstanceOf[Issue]
  }
}

