package typings.winrtUwp.Windows.UI.ViewManagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationViewTransferContext extends StObject {
  
  /* unmapped type */
  var viewId: js.Any = js.native
}
object ApplicationViewTransferContext {
  
  @scala.inline
  def apply(viewId: js.Any): ApplicationViewTransferContext = {
    val __obj = js.Dynamic.literal(viewId = viewId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationViewTransferContext]
  }
  
  @scala.inline
  implicit class ApplicationViewTransferContextMutableBuilder[Self <: ApplicationViewTransferContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setViewId(value: js.Any): Self = StObject.set(x, "viewId", value.asInstanceOf[js.Any])
  }
}
