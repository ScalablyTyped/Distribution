package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteFileOptions extends StObject {
  
  /**
    * Ignore the operation if the file doesn't exist.
    */
  var ignoreIfNotExists: js.UndefOr[Boolean] = js.native
  
  /**
    * Delete the content recursively if a folder is denoted.
    */
  var recursive: js.UndefOr[Boolean] = js.native
}
object DeleteFileOptions {
  
  @scala.inline
  def apply(): DeleteFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteFileOptions]
  }
  
  @scala.inline
  implicit class DeleteFileOptionsMutableBuilder[Self <: DeleteFileOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIgnoreIfNotExists(value: Boolean): Self = StObject.set(x, "ignoreIfNotExists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreIfNotExistsUndefined: Self = StObject.set(x, "ignoreIfNotExists", js.undefined)
    
    @scala.inline
    def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
  }
}
