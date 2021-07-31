package typings.winrtUwp.Windows.System

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AppMemoryUsageLevel extends StObject
/** An enumeration containing 3 levels of app memory usage: low, medium, and high. */
@JSGlobal("Windows.System.AppMemoryUsageLevel")
@js.native
object AppMemoryUsageLevel extends StObject {
  
  /** High app memory usage. */
  @js.native
  sealed trait high
    extends StObject
       with AppMemoryUsageLevel
  
  /** Low app memory usage. */
  @js.native
  sealed trait low
    extends StObject
       with AppMemoryUsageLevel
  
  /** Medium app memory usage. */
  @js.native
  sealed trait medium
    extends StObject
       with AppMemoryUsageLevel
}
