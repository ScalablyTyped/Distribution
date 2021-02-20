package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommentAuthorInformation extends StObject {
  
  /**
    * The optional icon path for the author
    */
  var iconPath: js.UndefOr[Uri] = js.native
  
  /**
    * The display name of the author of the comment
    */
  var name: String = js.native
}
object CommentAuthorInformation {
  
  @scala.inline
  def apply(name: String): CommentAuthorInformation = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentAuthorInformation]
  }
  
  @scala.inline
  implicit class CommentAuthorInformationMutableBuilder[Self <: CommentAuthorInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIconPath(value: Uri): Self = StObject.set(x, "iconPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconPathUndefined: Self = StObject.set(x, "iconPath", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
