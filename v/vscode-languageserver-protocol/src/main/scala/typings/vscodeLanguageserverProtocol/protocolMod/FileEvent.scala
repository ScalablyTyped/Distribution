package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverTypes.mod.DocumentUri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileEvent extends StObject {
  
  /**
    * The change type.
    */
  var `type`: FileChangeType = js.native
  
  /**
    * The file's uri.
    */
  var uri: DocumentUri = js.native
}
object FileEvent {
  
  @scala.inline
  def apply(`type`: FileChangeType, uri: DocumentUri): FileEvent = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileEvent]
  }
  
  @scala.inline
  implicit class FileEventMutableBuilder[Self <: FileEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: FileChangeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: DocumentUri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
