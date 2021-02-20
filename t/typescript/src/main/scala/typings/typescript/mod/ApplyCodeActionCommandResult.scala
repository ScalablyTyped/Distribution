package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplyCodeActionCommandResult extends StObject {
  
  var successMessage: java.lang.String = js.native
}
object ApplyCodeActionCommandResult {
  
  @scala.inline
  def apply(successMessage: java.lang.String): ApplyCodeActionCommandResult = {
    val __obj = js.Dynamic.literal(successMessage = successMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyCodeActionCommandResult]
  }
  
  @scala.inline
  implicit class ApplyCodeActionCommandResultMutableBuilder[Self <: ApplyCodeActionCommandResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccessMessage(value: java.lang.String): Self = StObject.set(x, "successMessage", value.asInstanceOf[js.Any])
  }
}
