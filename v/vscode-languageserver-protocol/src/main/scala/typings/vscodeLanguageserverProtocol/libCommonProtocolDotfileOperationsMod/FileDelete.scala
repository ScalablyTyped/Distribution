package typings.vscodeLanguageserverProtocol.libCommonProtocolDotfileOperationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileDelete extends StObject {
  
  /**
    * A file:// URI for the location of the file/folder being deleted.
    */
  var uri: String
}
object FileDelete {
  
  inline def apply(uri: String): FileDelete = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileDelete]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileDelete] (val x: Self) extends AnyVal {
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
