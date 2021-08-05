package typings.winrt.Windows.UI.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowActivatedEventArgs
  extends StObject
     with IWindowActivatedEventArgs
object WindowActivatedEventArgs {
  
  inline def apply(handled: Boolean, windowActivationState: CoreWindowActivationState): WindowActivatedEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], windowActivationState = windowActivationState.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowActivatedEventArgs]
  }
}
