package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileCreateEvent extends StObject {
  
  /**
    * The files that got created.
    */
  val files: js.Array[Uri] = js.native
}
object FileCreateEvent {
  
  @scala.inline
  def apply(files: js.Array[Uri]): FileCreateEvent = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileCreateEvent]
  }
  
  @scala.inline
  implicit class FileCreateEventMutableBuilder[Self <: FileCreateEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFiles(value: js.Array[Uri]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesVarargs(value: Uri*): Self = StObject.set(x, "files", js.Array(value :_*))
  }
}
