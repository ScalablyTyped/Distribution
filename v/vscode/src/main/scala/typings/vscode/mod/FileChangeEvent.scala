package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileChangeEvent extends StObject {
  
  /**
    * The type of change.
    */
  val `type`: FileChangeType
  
  /**
    * The uri of the file that has changed.
    */
  val uri: Uri
}
object FileChangeEvent {
  
  inline def apply(`type`: FileChangeType, uri: Uri): FileChangeEvent = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileChangeEvent]
  }
  
  extension [Self <: FileChangeEvent](x: Self) {
    
    inline def setType(value: FileChangeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUri(value: Uri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
