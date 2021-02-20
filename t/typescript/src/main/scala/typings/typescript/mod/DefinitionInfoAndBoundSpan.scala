package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefinitionInfoAndBoundSpan extends StObject {
  
  var definitions: js.UndefOr[js.Array[DefinitionInfo]] = js.native
  
  var textSpan: TextSpan = js.native
}
object DefinitionInfoAndBoundSpan {
  
  @scala.inline
  def apply(textSpan: TextSpan): DefinitionInfoAndBoundSpan = {
    val __obj = js.Dynamic.literal(textSpan = textSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionInfoAndBoundSpan]
  }
  
  @scala.inline
  implicit class DefinitionInfoAndBoundSpanMutableBuilder[Self <: DefinitionInfoAndBoundSpan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefinitions(value: js.Array[DefinitionInfo]): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionsUndefined: Self = StObject.set(x, "definitions", js.undefined)
    
    @scala.inline
    def setDefinitionsVarargs(value: DefinitionInfo*): Self = StObject.set(x, "definitions", js.Array(value :_*))
    
    @scala.inline
    def setTextSpan(value: TextSpan): Self = StObject.set(x, "textSpan", value.asInstanceOf[js.Any])
  }
}
