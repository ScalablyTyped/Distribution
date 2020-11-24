package typings.valerieBrowser.Valerie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidationResult extends js.Object {
  
   // the result state
  var failed: Boolean = js.native
  
      //true if the activity hasn't yet completed
  var message: String = js.native
  
      //a message from the activity
  def `new`(state: js.Any): ValidationResult = js.native
  def `new`(state: js.Any, message: String): ValidationResult = js.native
  
      //true if the activity failed validation
  var passed: Boolean = js.native
  
      //true if the activity passed validation
  var pending: Boolean = js.native
  
  var state: js.Any = js.native
}
