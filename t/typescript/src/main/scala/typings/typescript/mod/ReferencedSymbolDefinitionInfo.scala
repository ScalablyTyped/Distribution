package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReferencedSymbolDefinitionInfo
  extends StObject
     with DefinitionInfo {
  
  var displayParts: js.Array[SymbolDisplayPart]
}
object ReferencedSymbolDefinitionInfo {
  
  @scala.inline
  def apply(
    containerKind: ScriptElementKind,
    containerName: java.lang.String,
    displayParts: js.Array[SymbolDisplayPart],
    fileName: java.lang.String,
    kind: ScriptElementKind,
    name: java.lang.String,
    textSpan: TextSpan
  ): ReferencedSymbolDefinitionInfo = {
    val __obj = js.Dynamic.literal(containerKind = containerKind.asInstanceOf[js.Any], containerName = containerName.asInstanceOf[js.Any], displayParts = displayParts.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], textSpan = textSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferencedSymbolDefinitionInfo]
  }
  
  @scala.inline
  implicit class ReferencedSymbolDefinitionInfoMutableBuilder[Self <: ReferencedSymbolDefinitionInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayParts(value: js.Array[SymbolDisplayPart]): Self = StObject.set(x, "displayParts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayPartsVarargs(value: SymbolDisplayPart*): Self = StObject.set(x, "displayParts", js.Array(value :_*))
  }
}
