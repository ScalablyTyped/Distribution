package typings.typescript.mod

import typings.typescript.typescriptBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenameInfoFailure
  extends StObject
     with RenameInfo {
  
  var canRename: `false`
  
  var localizedErrorMessage: java.lang.String
}
object RenameInfoFailure {
  
  inline def apply(localizedErrorMessage: java.lang.String): RenameInfoFailure = {
    val __obj = js.Dynamic.literal(canRename = false, localizedErrorMessage = localizedErrorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenameInfoFailure]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RenameInfoFailure] (val x: Self) extends AnyVal {
    
    inline def setCanRename(value: `false`): Self = StObject.set(x, "canRename", value.asInstanceOf[js.Any])
    
    inline def setLocalizedErrorMessage(value: java.lang.String): Self = StObject.set(x, "localizedErrorMessage", value.asInstanceOf[js.Any])
  }
}
