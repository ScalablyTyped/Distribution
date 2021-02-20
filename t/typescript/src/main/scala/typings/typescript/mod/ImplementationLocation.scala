package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImplementationLocation extends DocumentSpan {
  
  var displayParts: js.Array[SymbolDisplayPart] = js.native
  
  var kind: ScriptElementKind = js.native
}
object ImplementationLocation {
  
  @scala.inline
  def apply(
    displayParts: js.Array[SymbolDisplayPart],
    fileName: java.lang.String,
    kind: ScriptElementKind,
    textSpan: TextSpan
  ): ImplementationLocation = {
    val __obj = js.Dynamic.literal(displayParts = displayParts.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], textSpan = textSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImplementationLocation]
  }
  
  @scala.inline
  implicit class ImplementationLocationMutableBuilder[Self <: ImplementationLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayParts(value: js.Array[SymbolDisplayPart]): Self = StObject.set(x, "displayParts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayPartsVarargs(value: SymbolDisplayPart*): Self = StObject.set(x, "displayParts", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: ScriptElementKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
