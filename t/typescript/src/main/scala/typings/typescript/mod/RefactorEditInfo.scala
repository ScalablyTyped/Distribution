package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A set of edits to make in response to a refactor action, plus an optional
  * location where renaming should be invoked from
  */
trait RefactorEditInfo extends StObject {
  
  var commands: js.UndefOr[js.Array[CodeActionCommand]] = js.undefined
  
  var edits: js.Array[FileTextChanges]
  
  var renameFilename: js.UndefOr[java.lang.String] = js.undefined
  
  var renameLocation: js.UndefOr[Double] = js.undefined
}
object RefactorEditInfo {
  
  inline def apply(edits: js.Array[FileTextChanges]): RefactorEditInfo = {
    val __obj = js.Dynamic.literal(edits = edits.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefactorEditInfo]
  }
  
  extension [Self <: RefactorEditInfo](x: Self) {
    
    inline def setCommands(value: js.Array[CodeActionCommand]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    
    inline def setCommandsUndefined: Self = StObject.set(x, "commands", js.undefined)
    
    inline def setCommandsVarargs(value: CodeActionCommand*): Self = StObject.set(x, "commands", js.Array(value :_*))
    
    inline def setEdits(value: js.Array[FileTextChanges]): Self = StObject.set(x, "edits", value.asInstanceOf[js.Any])
    
    inline def setEditsVarargs(value: FileTextChanges*): Self = StObject.set(x, "edits", js.Array(value :_*))
    
    inline def setRenameFilename(value: java.lang.String): Self = StObject.set(x, "renameFilename", value.asInstanceOf[js.Any])
    
    inline def setRenameFilenameUndefined: Self = StObject.set(x, "renameFilename", js.undefined)
    
    inline def setRenameLocation(value: Double): Self = StObject.set(x, "renameLocation", value.asInstanceOf[js.Any])
    
    inline def setRenameLocationUndefined: Self = StObject.set(x, "renameLocation", js.undefined)
  }
}
