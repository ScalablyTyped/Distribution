package typings.winrtUwp.global.Windows.System

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the AppMemoryUsageLimitChanging event. */
@JSGlobal("Windows.System.AppMemoryUsageLimitChangingEventArgs")
@js.native
abstract class AppMemoryUsageLimitChangingEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.System.AppMemoryUsageLimitChangingEventArgs {
  
  /** Gets the new limit for how much total memory the app can use, in bytes. */
  /* CompleteClass */
  var newLimit: Double = js.native
  
  /** Gets the old limit for how much total memory the app can use, in bytes. */
  /* CompleteClass */
  var oldLimit: Double = js.native
}
