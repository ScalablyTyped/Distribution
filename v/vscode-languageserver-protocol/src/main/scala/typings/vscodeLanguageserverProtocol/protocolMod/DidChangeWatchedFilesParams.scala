package typings.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DidChangeWatchedFilesParams extends StObject {
  
  /**
    * The actual file events.
    */
  var changes: js.Array[FileEvent] = js.native
}
object DidChangeWatchedFilesParams {
  
  @scala.inline
  def apply(changes: js.Array[FileEvent]): DidChangeWatchedFilesParams = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DidChangeWatchedFilesParams]
  }
  
  @scala.inline
  implicit class DidChangeWatchedFilesParamsMutableBuilder[Self <: DidChangeWatchedFilesParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChanges(value: js.Array[FileEvent]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangesVarargs(value: FileEvent*): Self = StObject.set(x, "changes", js.Array(value :_*))
  }
}
