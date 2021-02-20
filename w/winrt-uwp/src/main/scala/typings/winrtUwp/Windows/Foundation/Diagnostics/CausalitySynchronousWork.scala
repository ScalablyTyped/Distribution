package typings.winrtUwp.Windows.Foundation.Diagnostics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CausalitySynchronousWork extends StObject
/** Indicates the relationship between a work item and an asynchronous operation. */
@JSGlobal("Windows.Foundation.Diagnostics.CausalitySynchronousWork")
@js.native
object CausalitySynchronousWork extends StObject {
  
  /** The work item being scheduled is running due to the completion of the asynchronous operation. */
  @js.native
  sealed trait completionNotification extends CausalitySynchronousWork
  
  /** The work item being scheduled is part of the actual work of the asynchronous operation, like opening a file. */
  @js.native
  sealed trait execution extends CausalitySynchronousWork
  
  /** The work item being scheduled is running due to reaching a milestone within the asynchronous operation. */
  @js.native
  sealed trait progressNotification extends CausalitySynchronousWork
}
