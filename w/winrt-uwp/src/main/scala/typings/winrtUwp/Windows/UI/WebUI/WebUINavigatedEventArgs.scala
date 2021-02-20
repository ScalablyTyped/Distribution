package typings.winrtUwp.Windows.UI.WebUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for an app navigation event. */
@js.native
trait WebUINavigatedEventArgs extends StObject {
  
  /** Gets the app navigation operation. */
  var navigatedOperation: WebUINavigatedOperation = js.native
}
object WebUINavigatedEventArgs {
  
  @scala.inline
  def apply(navigatedOperation: WebUINavigatedOperation): WebUINavigatedEventArgs = {
    val __obj = js.Dynamic.literal(navigatedOperation = navigatedOperation.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebUINavigatedEventArgs]
  }
  
  @scala.inline
  implicit class WebUINavigatedEventArgsMutableBuilder[Self <: WebUINavigatedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNavigatedOperation(value: WebUINavigatedOperation): Self = StObject.set(x, "navigatedOperation", value.asInstanceOf[js.Any])
  }
}
