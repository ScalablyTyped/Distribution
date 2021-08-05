package typings.winrtUwp.Windows.UI.ViewManagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationViewTransferContext extends StObject {
  
  /* unmapped type */
  var viewId: js.Any
}
object ApplicationViewTransferContext {
  
  inline def apply(viewId: js.Any): ApplicationViewTransferContext = {
    val __obj = js.Dynamic.literal(viewId = viewId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationViewTransferContext]
  }
  
  extension [Self <: ApplicationViewTransferContext](x: Self) {
    
    inline def setViewId(value: js.Any): Self = StObject.set(x, "viewId", value.asInstanceOf[js.Any])
  }
}
