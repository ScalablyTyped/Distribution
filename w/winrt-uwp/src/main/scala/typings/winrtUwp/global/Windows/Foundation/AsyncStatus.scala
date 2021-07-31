package typings.winrtUwp.global.Windows.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies the status of an asynchronous operation. */
@JSGlobal("Windows.Foundation.AsyncStatus")
@js.native
object AsyncStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Foundation.AsyncStatus & Double] = js.native
  
  /* 0 */ val canceled: typings.winrtUwp.Windows.Foundation.AsyncStatus.canceled & Double = js.native
  
  /* 1 */ val completed: typings.winrtUwp.Windows.Foundation.AsyncStatus.completed & Double = js.native
  
  /* 2 */ val error: typings.winrtUwp.Windows.Foundation.AsyncStatus.error & Double = js.native
  
  /* 3 */ val started: typings.winrtUwp.Windows.Foundation.AsyncStatus.started & Double = js.native
}
