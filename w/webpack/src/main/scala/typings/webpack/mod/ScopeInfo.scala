package typings.webpack.mod

import typings.webpack.webpackStrings.arrow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScopeInfo
  extends StObject
     with _ExportedVariableInfo {
  
  var definitions: StackedMap[String, ScopeInfo | VariableInfo]
  
  var inShorthand: Boolean
  
  var inTry: Boolean
  
  var isAsmJs: Boolean
  
  var isStrict: Boolean
  
  var topLevelScope: Boolean | arrow
}
object ScopeInfo {
  
  inline def apply(
    definitions: StackedMap[String, ScopeInfo | VariableInfo],
    inShorthand: Boolean,
    inTry: Boolean,
    isAsmJs: Boolean,
    isStrict: Boolean,
    topLevelScope: Boolean | arrow
  ): ScopeInfo = {
    val __obj = js.Dynamic.literal(definitions = definitions.asInstanceOf[js.Any], inShorthand = inShorthand.asInstanceOf[js.Any], inTry = inTry.asInstanceOf[js.Any], isAsmJs = isAsmJs.asInstanceOf[js.Any], isStrict = isStrict.asInstanceOf[js.Any], topLevelScope = topLevelScope.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScopeInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScopeInfo] (val x: Self) extends AnyVal {
    
    inline def setDefinitions(value: StackedMap[String, ScopeInfo | VariableInfo]): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
    
    inline def setInShorthand(value: Boolean): Self = StObject.set(x, "inShorthand", value.asInstanceOf[js.Any])
    
    inline def setInTry(value: Boolean): Self = StObject.set(x, "inTry", value.asInstanceOf[js.Any])
    
    inline def setIsAsmJs(value: Boolean): Self = StObject.set(x, "isAsmJs", value.asInstanceOf[js.Any])
    
    inline def setIsStrict(value: Boolean): Self = StObject.set(x, "isStrict", value.asInstanceOf[js.Any])
    
    inline def setTopLevelScope(value: Boolean | arrow): Self = StObject.set(x, "topLevelScope", value.asInstanceOf[js.Any])
  }
}
