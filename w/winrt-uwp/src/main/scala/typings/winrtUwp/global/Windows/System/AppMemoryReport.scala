package typings.winrtUwp.global.Windows.System

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents app memory usage at a single point in time. */
/* note: abstract class */ @JSGlobal("Windows.System.AppMemoryReport")
@js.native
open class AppMemoryReport ()
  extends StObject
     with typings.winrtUwp.Windows.System.AppMemoryReport {
  
  /** Gets the app's peak usage of private commit. */
  /* CompleteClass */
  var peakPrivateCommitUsage: Double = js.native
  
  /** Gets the app's usage of private commit. */
  /* CompleteClass */
  var privateCommitUsage: Double = js.native
  
  /** Gets the app's total cap for private plus shared commit. */
  /* CompleteClass */
  var totalCommitLimit: Double = js.native
  
  /** Gets the app's total usage of private plus shared commit. */
  /* CompleteClass */
  var totalCommitUsage: Double = js.native
}
