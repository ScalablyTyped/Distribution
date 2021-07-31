package typings.winrt.Windows.UI.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IIdleDispatchedHandlerArgs extends StObject {
  
  var isDispatcherIdle: Boolean
}
object IIdleDispatchedHandlerArgs {
  
  @scala.inline
  def apply(isDispatcherIdle: Boolean): IIdleDispatchedHandlerArgs = {
    val __obj = js.Dynamic.literal(isDispatcherIdle = isDispatcherIdle.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIdleDispatchedHandlerArgs]
  }
  
  @scala.inline
  implicit class IIdleDispatchedHandlerArgsMutableBuilder[Self <: IIdleDispatchedHandlerArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsDispatcherIdle(value: Boolean): Self = StObject.set(x, "isDispatcherIdle", value.asInstanceOf[js.Any])
  }
}
