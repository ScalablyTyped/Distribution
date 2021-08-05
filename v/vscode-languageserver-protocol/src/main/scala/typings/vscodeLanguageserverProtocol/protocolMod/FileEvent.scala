package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverTypes.mod.DocumentUri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileEvent extends StObject {
  
  /**
    * The change type.
    */
  var `type`: FileChangeType
  
  /**
    * The file's uri.
    */
  var uri: DocumentUri
}
object FileEvent {
  
  inline def apply(`type`: FileChangeType, uri: DocumentUri): FileEvent = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileEvent]
  }
  
  extension [Self <: FileEvent](x: Self) {
    
    inline def setType(value: FileChangeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUri(value: DocumentUri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
