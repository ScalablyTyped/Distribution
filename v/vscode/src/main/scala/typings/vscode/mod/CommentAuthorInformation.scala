package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentAuthorInformation extends StObject {
  
  /**
  		 * The optional icon path for the author
  		 */
  var iconPath: js.UndefOr[Uri] = js.undefined
  
  /**
  		 * The display name of the author of the comment
  		 */
  var name: String
}
object CommentAuthorInformation {
  
  inline def apply(name: String): CommentAuthorInformation = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentAuthorInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommentAuthorInformation] (val x: Self) extends AnyVal {
    
    inline def setIconPath(value: Uri): Self = StObject.set(x, "iconPath", value.asInstanceOf[js.Any])
    
    inline def setIconPathUndefined: Self = StObject.set(x, "iconPath", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
