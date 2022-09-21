package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vscodeLanguageserverTypes.mod.InlineValueText
  - typings.vscodeLanguageserverTypes.mod.InlineValueVariableLookup
  - typings.vscodeLanguageserverTypes.mod.InlineValueEvaluatableExpression
*/
trait InlineValue extends StObject
object InlineValue {
  
  inline def InlineValueEvaluatableExpression(range: Range): typings.vscodeLanguageserverTypes.mod.InlineValueEvaluatableExpression = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vscodeLanguageserverTypes.mod.InlineValueEvaluatableExpression]
  }
  
  inline def InlineValueText(range: Range, text: String): typings.vscodeLanguageserverTypes.mod.InlineValueText = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vscodeLanguageserverTypes.mod.InlineValueText]
  }
  
  inline def InlineValueVariableLookup(caseSensitiveLookup: Boolean, range: Range): typings.vscodeLanguageserverTypes.mod.InlineValueVariableLookup = {
    val __obj = js.Dynamic.literal(caseSensitiveLookup = caseSensitiveLookup.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vscodeLanguageserverTypes.mod.InlineValueVariableLookup]
  }
}
