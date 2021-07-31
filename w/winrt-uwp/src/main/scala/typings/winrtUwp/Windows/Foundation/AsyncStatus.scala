package typings.winrtUwp.Windows.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AsyncStatus extends StObject
/** Specifies the status of an asynchronous operation. */
@JSGlobal("Windows.Foundation.AsyncStatus")
@js.native
object AsyncStatus extends StObject {
  
  /** The operation was canceled. */
  @js.native
  sealed trait canceled
    extends StObject
       with AsyncStatus
  
  /** The operation has completed. */
  @js.native
  sealed trait completed
    extends StObject
       with AsyncStatus
  
  /** The operation has encountered an error. */
  @js.native
  sealed trait error
    extends StObject
       with AsyncStatus
  
  /** The operation has started. */
  @js.native
  sealed trait started
    extends StObject
       with AsyncStatus
}
