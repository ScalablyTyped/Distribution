package typings.vscode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgnoreIfNotExists extends StObject {
  
  var ignoreIfNotExists: js.UndefOr[Boolean] = js.undefined
  
  var recursive: js.UndefOr[Boolean] = js.undefined
}
object IgnoreIfNotExists {
  
  @scala.inline
  def apply(): IgnoreIfNotExists = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgnoreIfNotExists]
  }
  
  @scala.inline
  implicit class IgnoreIfNotExistsMutableBuilder[Self <: IgnoreIfNotExists] (val x: Self) extends AnyVal {
    
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
