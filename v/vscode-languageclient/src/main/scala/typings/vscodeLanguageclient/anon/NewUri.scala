package typings.vscodeLanguageclient.anon

import typings.vscode.mod.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewUri extends StObject {
  
  var newUri: Uri
  
  var oldUri: Uri
}
object NewUri {
  
  inline def apply(newUri: Uri, oldUri: Uri): NewUri = {
    val __obj = js.Dynamic.literal(newUri = newUri.asInstanceOf[js.Any], oldUri = oldUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewUri]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NewUri] (val x: Self) extends AnyVal {
    
    inline def setNewUri(value: Uri): Self = StObject.set(x, "newUri", value.asInstanceOf[js.Any])
    
    inline def setOldUri(value: Uri): Self = StObject.set(x, "oldUri", value.asInstanceOf[js.Any])
  }
}
