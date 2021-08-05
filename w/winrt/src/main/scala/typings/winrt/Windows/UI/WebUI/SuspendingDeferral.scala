package typings.winrt.Windows.UI.WebUI

import typings.winrt.Windows.ApplicationModel.ISuspendingDeferral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuspendingDeferral
  extends StObject
     with ISuspendingDeferral
object SuspendingDeferral {
  
  inline def apply(complete: () => Unit): SuspendingDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[SuspendingDeferral]
  }
}
