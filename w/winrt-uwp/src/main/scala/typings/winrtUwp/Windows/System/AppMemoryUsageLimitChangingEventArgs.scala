package typings.winrtUwp.Windows.System

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the AppMemoryUsageLimitChanging event. */
trait AppMemoryUsageLimitChangingEventArgs extends StObject {
  
  /** Gets the new limit for how much total memory the app can use, in bytes. */
  var newLimit: Double
  
  /** Gets the old limit for how much total memory the app can use, in bytes. */
  var oldLimit: Double
}
object AppMemoryUsageLimitChangingEventArgs {
  
  inline def apply(newLimit: Double, oldLimit: Double): AppMemoryUsageLimitChangingEventArgs = {
    val __obj = js.Dynamic.literal(newLimit = newLimit.asInstanceOf[js.Any], oldLimit = oldLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppMemoryUsageLimitChangingEventArgs]
  }
  
  extension [Self <: AppMemoryUsageLimitChangingEventArgs](x: Self) {
    
    inline def setNewLimit(value: Double): Self = StObject.set(x, "newLimit", value.asInstanceOf[js.Any])
    
    inline def setOldLimit(value: Double): Self = StObject.set(x, "oldLimit", value.asInstanceOf[js.Any])
  }
}
