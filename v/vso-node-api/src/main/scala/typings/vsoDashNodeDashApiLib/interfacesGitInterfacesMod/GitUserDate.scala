package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitUserDate extends js.Object {
  /**
    * Date of the Git operation.
    */
  var date: stdLib.Date
  /**
    * Email address of the user performing the Git operation.
    */
  var email: java.lang.String
  /**
    * Name of the user performing the Git operation.
    */
  var name: java.lang.String
}

object GitUserDate {
  @scala.inline
  def apply(date: stdLib.Date, email: java.lang.String, name: java.lang.String): GitUserDate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("date")(date)
    __obj.updateDynamic("email")(email)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[GitUserDate]
  }
}

