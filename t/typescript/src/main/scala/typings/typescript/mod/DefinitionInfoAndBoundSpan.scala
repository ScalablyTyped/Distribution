package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefinitionInfoAndBoundSpan extends StObject {
  
  var definitions: js.UndefOr[js.Array[DefinitionInfo]] = js.undefined
  
  var textSpan: TextSpan
}
object DefinitionInfoAndBoundSpan {
  
  inline def apply(textSpan: TextSpan): DefinitionInfoAndBoundSpan = {
    val __obj = js.Dynamic.literal(textSpan = textSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionInfoAndBoundSpan]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefinitionInfoAndBoundSpan] (val x: Self) extends AnyVal {
    
    inline def setDefinitions(value: js.Array[DefinitionInfo]): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
    
    inline def setDefinitionsUndefined: Self = StObject.set(x, "definitions", js.undefined)
    
    inline def setDefinitionsVarargs(value: DefinitionInfo*): Self = StObject.set(x, "definitions", js.Array(value*))
    
    inline def setTextSpan(value: TextSpan): Self = StObject.set(x, "textSpan", value.asInstanceOf[js.Any])
  }
}
