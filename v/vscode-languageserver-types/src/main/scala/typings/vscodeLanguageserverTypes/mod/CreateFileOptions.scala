package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateFileOptions extends StObject {
  
  /**
    * Ignore if exists.
    */
  var ignoreIfExists: js.UndefOr[Boolean] = js.native
  
  /**
    * Overwrite existing file. Overwrite wins over `ignoreIfExists`
    */
  var overwrite: js.UndefOr[Boolean] = js.native
}
object CreateFileOptions {
  
  @scala.inline
  def apply(): CreateFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFileOptions]
  }
  
  @scala.inline
  implicit class CreateFileOptionsMutableBuilder[Self <: CreateFileOptions] (val x: Self) extends AnyVal {
    
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
