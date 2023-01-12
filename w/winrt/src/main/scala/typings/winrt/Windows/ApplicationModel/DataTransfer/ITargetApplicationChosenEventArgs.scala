package typings.winrt.Windows.ApplicationModel.DataTransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITargetApplicationChosenEventArgs extends StObject {
  
  var applicationName: String
}
object ITargetApplicationChosenEventArgs {
  
  inline def apply(applicationName: String): ITargetApplicationChosenEventArgs = {
    val __obj = js.Dynamic.literal(applicationName = applicationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITargetApplicationChosenEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ITargetApplicationChosenEventArgs] (val x: Self) extends AnyVal {
    
    inline def setApplicationName(value: String): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
  }
}
