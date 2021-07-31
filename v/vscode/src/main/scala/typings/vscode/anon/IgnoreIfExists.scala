package typings.vscode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgnoreIfExists extends StObject {
  
  var ignoreIfExists: js.UndefOr[Boolean] = js.undefined
  
  var overwrite: js.UndefOr[Boolean] = js.undefined
}
object IgnoreIfExists {
  
  @scala.inline
  def apply(): IgnoreIfExists = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgnoreIfExists]
  }
  
  @scala.inline
  implicit class IgnoreIfExistsMutableBuilder[Self <: IgnoreIfExists] (val x: Self) extends AnyVal {
    
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
