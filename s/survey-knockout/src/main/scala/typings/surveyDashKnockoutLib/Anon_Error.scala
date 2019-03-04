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
    val __obj = js.Dynamic.literal(error = error, root = root, saveAgainButton = saveAgainButton, saving = saving, success = success)
  
    __obj.asInstanceOf[Anon_Error]
  }
}

