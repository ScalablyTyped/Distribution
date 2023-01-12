package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileDeleteEvent extends StObject {
  
  /**
    * The files that got deleted.
    */
  val files: js.Array[Uri]
}
object FileDeleteEvent {
  
  inline def apply(files: js.Array[Uri]): FileDeleteEvent = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileDeleteEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileDeleteEvent] (val x: Self) extends AnyVal {
    
    inline def setFiles(value: js.Array[Uri]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesVarargs(value: Uri*): Self = StObject.set(x, "files", js.Array(value*))
  }
}
