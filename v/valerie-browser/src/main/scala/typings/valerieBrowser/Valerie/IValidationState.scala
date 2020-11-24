package typings.valerieBrowser.Valerie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// The interface for a validation state.
@js.native
trait IValidationState extends js.Object {
  
  def failed(): Boolean = js.native
  
  def getName(): String = js.native
  
  def isApplicable(): Boolean = js.native
  
  def message(): String = js.native
  
  def passed(): Boolean = js.native
  
  def pending(): Boolean = js.native
  
  def result(): ValidationResult = js.native
  
  def touched(): Boolean = js.native
  def touched(value: Boolean): Boolean = js.native
}
