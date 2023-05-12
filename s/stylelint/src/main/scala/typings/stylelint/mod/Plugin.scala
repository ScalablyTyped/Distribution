package typings.stylelint.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * A Stylelint plugin.
	 */
/* Rewritten from type alias, can be one of: 
  - typings.stylelint.anon.Default
  - typings.stylelint.anon.Rule
*/
trait Plugin extends StObject
object Plugin {
  
  inline def Default(): typings.stylelint.anon.Default = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.stylelint.anon.Default]
  }
  
  inline def Rule(rule: typings.stylelint.mod.Rule[Any, Any], ruleName: String): typings.stylelint.anon.Rule = {
    val __obj = js.Dynamic.literal(rule = rule.asInstanceOf[js.Any], ruleName = ruleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.stylelint.anon.Rule]
  }
}
