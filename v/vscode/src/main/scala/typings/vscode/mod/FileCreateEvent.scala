package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileCreateEvent extends StObject {
  
  /**
    * The files that got created.
    */
  val files: js.Array[Uri]
}
object FileCreateEvent {
  
  inline def apply(files: js.Array[Uri]): FileCreateEvent = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileCreateEvent]
  }
  
  extension [Self <: FileCreateEvent](x: Self) {
    
    inline def setFiles(value: js.Array[Uri]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesVarargs(value: Uri*): Self = StObject.set(x, "files", js.Array(value :_*))
  }
}
