package typings.vscodeLanguageserverProtocol.libCommonProtocolDotfileOperationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileCreate extends StObject {
  
  /**
    * A file:// URI for the location of the file/folder being created.
    */
  var uri: String
}
object FileCreate {
  
  inline def apply(uri: String): FileCreate = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileCreate]
  }
  
  extension [Self <: FileCreate](x: Self) {
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
