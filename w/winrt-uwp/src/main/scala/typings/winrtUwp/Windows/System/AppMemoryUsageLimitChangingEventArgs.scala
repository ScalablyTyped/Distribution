package typings.winrtUwp.Windows.System

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the AppMemoryUsageLimitChanging event. */
@js.native
trait AppMemoryUsageLimitChangingEventArgs extends StObject {
  
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
  implicit class AppMemoryUsageLimitChangingEventArgsMutableBuilder[Self <: AppMemoryUsageLimitChangingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewLimit(value: Double): Self = StObject.set(x, "newLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldLimit(value: Double): Self = StObject.set(x, "oldLimit", value.asInstanceOf[js.Any])
  }
}
