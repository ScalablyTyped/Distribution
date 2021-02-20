package typings.vscode.anon

import typings.vscode.mod.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewUri extends StObject {
  
  var newUri: Uri = js.native
  
  var oldUri: Uri = js.native
}
object NewUri {
  
  @scala.inline
  def apply(newUri: Uri, oldUri: Uri): NewUri = {
    val __obj = js.Dynamic.literal(newUri = newUri.asInstanceOf[js.Any], oldUri = oldUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewUri]
  }
  
  @scala.inline
  implicit class NewUriMutableBuilder[Self <: NewUri] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewUri(value: Uri): Self = StObject.set(x, "newUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldUri(value: Uri): Self = StObject.set(x, "oldUri", value.asInstanceOf[js.Any])
  }
}
