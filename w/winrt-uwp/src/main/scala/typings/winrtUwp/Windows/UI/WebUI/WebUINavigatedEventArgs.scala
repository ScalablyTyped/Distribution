package typings.winrtUwp.Windows.UI.WebUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for an app navigation event. */
trait WebUINavigatedEventArgs extends StObject {
  
  /** Gets the app navigation operation. */
  var navigatedOperation: WebUINavigatedOperation
}
object WebUINavigatedEventArgs {
  
  inline def apply(navigatedOperation: WebUINavigatedOperation): WebUINavigatedEventArgs = {
    val __obj = js.Dynamic.literal(navigatedOperation = navigatedOperation.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebUINavigatedEventArgs]
  }
  
  extension [Self <: WebUINavigatedEventArgs](x: Self) {
    
    inline def setNavigatedOperation(value: WebUINavigatedOperation): Self = StObject.set(x, "navigatedOperation", value.asInstanceOf[js.Any])
  }
}
