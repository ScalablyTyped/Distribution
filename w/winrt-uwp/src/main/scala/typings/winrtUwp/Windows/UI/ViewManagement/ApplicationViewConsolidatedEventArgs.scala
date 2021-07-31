package typings.winrtUwp.Windows.UI.ViewManagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains the results of a window (app view) consolidation operation. */
trait ApplicationViewConsolidatedEventArgs extends StObject {
  
  /** Indicates whether the window consolidation was user- or system-initiated. */
  var isUserInitiated: Boolean
}
object ApplicationViewConsolidatedEventArgs {
  
  @scala.inline
  def apply(isUserInitiated: Boolean): ApplicationViewConsolidatedEventArgs = {
    val __obj = js.Dynamic.literal(isUserInitiated = isUserInitiated.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationViewConsolidatedEventArgs]
  }
  
  @scala.inline
  implicit class ApplicationViewConsolidatedEventArgsMutableBuilder[Self <: ApplicationViewConsolidatedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsUserInitiated(value: Boolean): Self = StObject.set(x, "isUserInitiated", value.asInstanceOf[js.Any])
  }
}
