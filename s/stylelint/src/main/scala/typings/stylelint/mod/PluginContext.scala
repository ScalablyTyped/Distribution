package typings.stylelint.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginContext extends StObject {
  
  var fix: js.UndefOr[Boolean] = js.undefined
  
  var newline: js.UndefOr[String] = js.undefined
}
object PluginContext {
  
  inline def apply(): PluginContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PluginContext]
  }
  
  extension [Self <: PluginContext](x: Self) {
    
    inline def setFix(value: Boolean): Self = StObject.set(x, "fix", value.asInstanceOf[js.Any])
    
    inline def setFixUndefined: Self = StObject.set(x, "fix", js.undefined)
    
    inline def setNewline(value: String): Self = StObject.set(x, "newline", value.asInstanceOf[js.Any])
    
    inline def setNewlineUndefined: Self = StObject.set(x, "newline", js.undefined)
  }
}
