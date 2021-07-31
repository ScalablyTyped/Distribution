package typings.winrt.Windows.UI.WebUI

import typings.std.Date
import typings.winrt.Windows.ApplicationModel.ISuspendingOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuspendingOperation
  extends StObject
     with ISuspendingOperation
object SuspendingOperation {
  
  @scala.inline
  def apply(deadline: Date, getDeferral: () => typings.winrt.Windows.ApplicationModel.SuspendingDeferral): SuspendingOperation = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral))
    __obj.asInstanceOf[SuspendingOperation]
  }
}
