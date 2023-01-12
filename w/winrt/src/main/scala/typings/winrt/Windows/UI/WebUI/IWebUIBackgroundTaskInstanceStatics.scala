package typings.winrt.Windows.UI.WebUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWebUIBackgroundTaskInstanceStatics extends StObject {
  
  var current: IWebUIBackgroundTaskInstance
}
object IWebUIBackgroundTaskInstanceStatics {
  
  inline def apply(current: IWebUIBackgroundTaskInstance): IWebUIBackgroundTaskInstanceStatics = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebUIBackgroundTaskInstanceStatics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IWebUIBackgroundTaskInstanceStatics] (val x: Self) extends AnyVal {
    
    inline def setCurrent(value: IWebUIBackgroundTaskInstance): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
  }
}
