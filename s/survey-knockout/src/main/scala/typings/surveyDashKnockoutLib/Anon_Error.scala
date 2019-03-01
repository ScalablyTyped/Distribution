package typings
package surveyDashKnockoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error extends js.Object {
  var error: java.lang.String
  var root: java.lang.String
  var saveAgainButton: java.lang.String
  var saving: java.lang.String
  var success: java.lang.String
}

object Anon_Error {
  @scala.inline
  def apply(
    error: java.lang.String,
    root: java.lang.String,
    saveAgainButton: java.lang.String,
    saving: java.lang.String,
    success: java.lang.String
  ): Anon_Error = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("root")(root)
    __obj.updateDynamic("saveAgainButton")(saveAgainButton)
    __obj.updateDynamic("saving")(saving)
    __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[Anon_Error]
  }
}

