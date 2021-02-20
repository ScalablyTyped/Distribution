package typings.wegameApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SavedFilePath extends StObject {
  
  var savedFilePath: String = js.native
}
object SavedFilePath {
  
  @scala.inline
  def apply(savedFilePath: String): SavedFilePath = {
    val __obj = js.Dynamic.literal(savedFilePath = savedFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedFilePath]
  }
  
  @scala.inline
  implicit class SavedFilePathMutableBuilder[Self <: SavedFilePath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSavedFilePath(value: String): Self = StObject.set(x, "savedFilePath", value.asInstanceOf[js.Any])
  }
}
