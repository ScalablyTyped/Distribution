package typings.winrt.Windows.UI.WebUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWebUINavigatedEventArgs extends StObject {
  
  var navigatedOperation: WebUINavigatedOperation
}
object IWebUINavigatedEventArgs {
  
  @scala.inline
  def apply(navigatedOperation: WebUINavigatedOperation): IWebUINavigatedEventArgs = {
    val __obj = js.Dynamic.literal(navigatedOperation = navigatedOperation.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebUINavigatedEventArgs]
  }
  
  @scala.inline
  implicit class IWebUINavigatedEventArgsMutableBuilder[Self <: IWebUINavigatedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNavigatedOperation(value: WebUINavigatedOperation): Self = StObject.set(x, "navigatedOperation", value.asInstanceOf[js.Any])
  }
}
