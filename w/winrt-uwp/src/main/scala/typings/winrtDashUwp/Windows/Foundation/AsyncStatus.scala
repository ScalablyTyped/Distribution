package typings.winrtDashUwp.Windows.Foundation

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Foundation.AsyncStatus.canceled
import typings.winrtDashUwp.Windows.Foundation.AsyncStatus.completed
import typings.winrtDashUwp.Windows.Foundation.AsyncStatus.error
import typings.winrtDashUwp.Windows.Foundation.AsyncStatus.started
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AsyncStatus extends js.Object

/** Specifies the status of an asynchronous operation. */
@JSGlobal("Windows.Foundation.AsyncStatus")
@js.native
object AsyncStatus extends js.Object {
  /** The operation was canceled. */
  @js.native
  sealed trait canceled extends AsyncStatus
  
  /** The operation has completed. */
  @js.native
  sealed trait completed extends AsyncStatus
  
  /** The operation has encountered an error. */
  @js.native
  sealed trait error extends AsyncStatus
  
  /** The operation has started. */
  @js.native
  sealed trait started extends AsyncStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AsyncStatus with Double] = js.native
  /* 0 */ @js.native
  object canceled extends TopLevel[canceled with Double]
  
  /* 1 */ @js.native
  object completed extends TopLevel[completed with Double]
  
  /* 2 */ @js.native
  object error extends TopLevel[error with Double]
  
  /* 3 */ @js.native
  object started extends TopLevel[started with Double]
  
}

