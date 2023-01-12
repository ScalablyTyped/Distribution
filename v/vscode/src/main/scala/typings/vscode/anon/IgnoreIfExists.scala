package typings.vscode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgnoreIfExists extends StObject {
  
  val ignoreIfExists: js.UndefOr[Boolean] = js.undefined
  
  val overwrite: js.UndefOr[Boolean] = js.undefined
}
object IgnoreIfExists {
  
  inline def apply(): IgnoreIfExists = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgnoreIfExists]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IgnoreIfExists] (val x: Self) extends AnyVal {
    
    inline def setIgnoreIfExists(value: Boolean): Self = StObject.set(x, "ignoreIfExists", value.asInstanceOf[js.Any])
    
    inline def setIgnoreIfExistsUndefined: Self = StObject.set(x, "ignoreIfExists", js.undefined)
    
    inline def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
    
    inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
  }
}
