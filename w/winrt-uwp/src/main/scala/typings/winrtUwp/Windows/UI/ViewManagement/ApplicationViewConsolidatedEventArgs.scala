package typings.winrtUwp.Windows.UI.ViewManagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains the results of a window (app view) consolidation operation. */
@js.native
trait ApplicationViewConsolidatedEventArgs extends js.Object {
  
  /** Indicates whether the window consolidation was user- or system-initiated. */
  var isUserInitiated: Boolean = js.native
}
object ApplicationViewConsolidatedEventArgs {
  
  @scala.inline
  def apply(isUserInitiated: Boolean): ApplicationViewConsolidatedEventArgs = {
    val __obj = js.Dynamic.literal(isUserInitiated = isUserInitiated.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationViewConsolidatedEventArgs]
  }
  
  @scala.inline
  implicit class ApplicationViewConsolidatedEventArgsOps[Self <: ApplicationViewConsolidatedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIsUserInitiated(value: Boolean): Self = this.set("isUserInitiated", value.asInstanceOf[js.Any])
  }
}
