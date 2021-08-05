package typings.winrt.Windows.UI.Notifications

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IToastFailedEventArgs extends StObject {
  
  var errorCode: Double
}
object IToastFailedEventArgs {
  
  inline def apply(errorCode: Double): IToastFailedEventArgs = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IToastFailedEventArgs]
  }
  
  extension [Self <: IToastFailedEventArgs](x: Self) {
    
    inline def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
  }
}
