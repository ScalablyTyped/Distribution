package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolvedProjectReference extends StObject {
  
  var commandLine: ParsedCommandLine
  
  var references: js.UndefOr[js.Array[js.UndefOr[ResolvedProjectReference]]] = js.undefined
  
  var sourceFile: SourceFile
}
object ResolvedProjectReference {
  
  inline def apply(commandLine: ParsedCommandLine, sourceFile: SourceFile): ResolvedProjectReference = {
    val __obj = js.Dynamic.literal(commandLine = commandLine.asInstanceOf[js.Any], sourceFile = sourceFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedProjectReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResolvedProjectReference] (val x: Self) extends AnyVal {
    
    inline def setCommandLine(value: ParsedCommandLine): Self = StObject.set(x, "commandLine", value.asInstanceOf[js.Any])
    
    inline def setReferences(value: js.Array[js.UndefOr[ResolvedProjectReference]]): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
    
    inline def setReferencesUndefined: Self = StObject.set(x, "references", js.undefined)
    
    inline def setReferencesVarargs(value: js.UndefOr[ResolvedProjectReference]*): Self = StObject.set(x, "references", js.Array(value*))
    
    inline def setSourceFile(value: SourceFile): Self = StObject.set(x, "sourceFile", value.asInstanceOf[js.Any])
  }
}
