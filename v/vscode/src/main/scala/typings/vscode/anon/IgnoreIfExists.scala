package typings.vscode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgnoreIfExists extends StObject {
  
  var ignoreIfExists: js.UndefOr[Boolean] = js.undefined
  
  var overwrite: js.UndefOr[Boolean] = js.undefined
}
object IgnoreIfExists {
  
  inline def apply(): IgnoreIfExists = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgnoreIfExists]
  }
  
  extension [Self <: IgnoreIfExists](x: Self) {
    
    inline def setIgnoreIfExists(value: Boolean): Self = StObject.set(x, "ignoreIfExists", value.asInstanceOf[js.Any])
    
    inline def setIgnoreIfExistsUndefined: Self = StObject.set(x, "ignoreIfExists", js.undefined)
    
    inline def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
    
    inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
  }
}
