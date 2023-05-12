package typings.stylelint.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * A rule context.
	 */
trait RuleContext extends StObject {
  
  var configurationComment: js.UndefOr[String] = js.undefined
  
  var fix: js.UndefOr[Boolean] = js.undefined
  
  var newline: js.UndefOr[String] = js.undefined
}
object RuleContext {
  
  inline def apply(): RuleContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RuleContext] (val x: Self) extends AnyVal {
    
    inline def setConfigurationComment(value: String): Self = StObject.set(x, "configurationComment", value.asInstanceOf[js.Any])
    
    inline def setConfigurationCommentUndefined: Self = StObject.set(x, "configurationComment", js.undefined)
    
    inline def setFix(value: Boolean): Self = StObject.set(x, "fix", value.asInstanceOf[js.Any])
    
    inline def setFixUndefined: Self = StObject.set(x, "fix", js.undefined)
    
    inline def setNewline(value: String): Self = StObject.set(x, "newline", value.asInstanceOf[js.Any])
    
    inline def setNewlineUndefined: Self = StObject.set(x, "newline", js.undefined)
  }
}
