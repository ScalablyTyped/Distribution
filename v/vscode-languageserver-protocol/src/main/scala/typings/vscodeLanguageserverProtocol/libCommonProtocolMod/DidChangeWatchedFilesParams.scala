package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DidChangeWatchedFilesParams extends StObject {
  
  /**
    * The actual file events.
    */
  var changes: js.Array[FileEvent]
}
object DidChangeWatchedFilesParams {
  
  inline def apply(changes: js.Array[FileEvent]): DidChangeWatchedFilesParams = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DidChangeWatchedFilesParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DidChangeWatchedFilesParams] (val x: Self) extends AnyVal {
    
    inline def setChanges(value: js.Array[FileEvent]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    inline def setChangesVarargs(value: FileEvent*): Self = StObject.set(x, "changes", js.Array(value*))
  }
}
