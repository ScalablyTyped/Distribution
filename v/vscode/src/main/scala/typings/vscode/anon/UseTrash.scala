package typings.vscode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseTrash extends StObject {
  
  var recursive: js.UndefOr[Boolean] = js.undefined
  
  var useTrash: js.UndefOr[Boolean] = js.undefined
}
object UseTrash {
  
  inline def apply(): UseTrash = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseTrash]
  }
  
  extension [Self <: UseTrash](x: Self) {
    
    inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    
    inline def setUseTrash(value: Boolean): Self = StObject.set(x, "useTrash", value.asInstanceOf[js.Any])
    
    inline def setUseTrashUndefined: Self = StObject.set(x, "useTrash", js.undefined)
  }
}
