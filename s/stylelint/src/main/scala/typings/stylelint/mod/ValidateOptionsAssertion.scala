package typings.stylelint.mod

import typings.stylelint.stylelintBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.stylelint.anon.Actual
  - typings.stylelint.anon.Optional
*/
trait ValidateOptionsAssertion extends js.Object
object ValidateOptionsAssertion {
  
  @scala.inline
  def Actual(actual: js.Any): ValidateOptionsAssertion = {
    val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateOptionsAssertion]
  }
  
  @scala.inline
  def Optional(optional: `true`, possible: js.Any): ValidateOptionsAssertion = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], possible = possible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateOptionsAssertion]
  }
}
