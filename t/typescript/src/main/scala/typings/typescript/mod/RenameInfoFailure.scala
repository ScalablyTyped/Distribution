package typings.typescript.mod

import typings.typescript.typescriptBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenameInfoFailure extends RenameInfo {
  
  var canRename: `false` = js.native
  
  var localizedErrorMessage: java.lang.String = js.native
}
object RenameInfoFailure {
  
  @scala.inline
  def apply(canRename: `false`, localizedErrorMessage: java.lang.String): RenameInfoFailure = {
    val __obj = js.Dynamic.literal(canRename = canRename.asInstanceOf[js.Any], localizedErrorMessage = localizedErrorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenameInfoFailure]
  }
  
  @scala.inline
  implicit class RenameInfoFailureMutableBuilder[Self <: RenameInfoFailure] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanRename(value: `false`): Self = StObject.set(x, "canRename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalizedErrorMessage(value: java.lang.String): Self = StObject.set(x, "localizedErrorMessage", value.asInstanceOf[js.Any])
  }
}
