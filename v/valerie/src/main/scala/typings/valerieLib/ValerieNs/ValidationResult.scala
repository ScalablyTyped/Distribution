package typings
package valerieLib.ValerieNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationResult extends js.Object {
   // the result state
  var failed: scala.Boolean = js.native
  	//true if the activity hasn't yet completed
  var message: java.lang.String = js.native
  	//true if the activity failed validation
  var passed: scala.Boolean = js.native
  	//true if the activity passed validation
  var pending: scala.Boolean = js.native
  var state: js.Any = js.native
  	//a message from the activity
  def `new`(state: js.Any): ValidationResult = js.native
  def `new`(state: js.Any, message: java.lang.String): ValidationResult = js.native
}

