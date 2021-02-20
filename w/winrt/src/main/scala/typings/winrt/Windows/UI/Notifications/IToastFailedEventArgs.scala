package typings.winrt.Windows.UI.Notifications

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IToastFailedEventArgs extends StObject {
  
  var errorCode: Double = js.native
}
object IToastFailedEventArgs {
  
  @scala.inline
  def apply(errorCode: Double): IToastFailedEventArgs = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IToastFailedEventArgs]
  }
  
  @scala.inline
  implicit class IToastFailedEventArgsMutableBuilder[Self <: IToastFailedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
  }
}
