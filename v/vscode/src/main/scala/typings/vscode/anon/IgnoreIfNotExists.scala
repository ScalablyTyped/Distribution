package typings.vscode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgnoreIfNotExists extends StObject {
  
  val ignoreIfNotExists: js.UndefOr[Boolean] = js.undefined
  
  val recursive: js.UndefOr[Boolean] = js.undefined
}
object IgnoreIfNotExists {
  
  inline def apply(): IgnoreIfNotExists = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgnoreIfNotExists]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IgnoreIfNotExists] (val x: Self) extends AnyVal {
    
    inline def setIgnoreIfNotExists(value: Boolean): Self = StObject.set(x, "ignoreIfNotExists", value.asInstanceOf[js.Any])
    
    inline def setIgnoreIfNotExistsUndefined: Self = StObject.set(x, "ignoreIfNotExists", js.undefined)
    
    inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
  }
}
