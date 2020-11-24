package typings.stylelint.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stylelint", "formatters")
@js.native
object formatters extends js.Object {
  
  def compact(results: js.Array[LintResult]): String = js.native
  
  def json(results: js.Array[LintResult]): String = js.native
  
  def string(results: js.Array[LintResult]): String = js.native
  
  def unix(results: js.Array[LintResult]): String = js.native
  
  def verbose(results: js.Array[LintResult]): String = js.native
}
