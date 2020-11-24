package typings.winrtUwp.Windows.System

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the AppMemoryUsageLimitChanging event. */
@js.native
trait AppMemoryUsageLimitChangingEventArgs extends js.Object {
  
  /** Gets the new limit for how much total memory the app can use, in bytes. */
  var newLimit: Double = js.native
  
  /** Gets the old limit for how much total memory the app can use, in bytes. */
  var oldLimit: Double = js.native
}
object AppMemoryUsageLimitChangingEventArgs {
  
  @scala.inline
  def apply(newLimit: Double, oldLimit: Double): AppMemoryUsageLimitChangingEventArgs = {
    val __obj = js.Dynamic.literal(newLimit = newLimit.asInstanceOf[js.Any], oldLimit = oldLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppMemoryUsageLimitChangingEventArgs]
  }
  
  @scala.inline
  implicit class AppMemoryUsageLimitChangingEventArgsOps[Self <: AppMemoryUsageLimitChangingEventArgs] (val x: Self) extends AnyVal {
    
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
    def setNewLimit(value: Double): Self = this.set("newLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldLimit(value: Double): Self = this.set("oldLimit", value.asInstanceOf[js.Any])
  }
}
