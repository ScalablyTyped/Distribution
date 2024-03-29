package typings.winrt.global.Windows.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Foundation.AsyncStatus")
@js.native
object AsyncStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winrt.Windows.Foundation.AsyncStatus & Double] = js.native
  
  /* 0 */ val canceled: typings.winrt.Windows.Foundation.AsyncStatus.canceled & Double = js.native
  
  /* 1 */ val completed: typings.winrt.Windows.Foundation.AsyncStatus.completed & Double = js.native
  
  /* 2 */ val error: typings.winrt.Windows.Foundation.AsyncStatus.error & Double = js.native
  
  /* 3 */ val started: typings.winrt.Windows.Foundation.AsyncStatus.started & Double = js.native
}
