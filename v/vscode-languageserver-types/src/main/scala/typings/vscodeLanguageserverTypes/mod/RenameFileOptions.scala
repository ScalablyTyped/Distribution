package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenameFileOptions extends StObject {
  
  /**
    * Ignores if target exists.
    */
  var ignoreIfExists: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Overwrite target if existing. Overwrite wins over `ignoreIfExists`
    */
  var overwrite: js.UndefOr[Boolean] = js.undefined
}
object RenameFileOptions {
  
  @scala.inline
  def apply(): RenameFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenameFileOptions]
  }
  
  @scala.inline
  implicit class RenameFileOptionsMutableBuilder[Self <: RenameFileOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIgnoreIfExists(value: Boolean): Self = StObject.set(x, "ignoreIfExists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreIfExistsUndefined: Self = StObject.set(x, "ignoreIfExists", js.undefined)
    
    @scala.inline
    def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
  }
}
