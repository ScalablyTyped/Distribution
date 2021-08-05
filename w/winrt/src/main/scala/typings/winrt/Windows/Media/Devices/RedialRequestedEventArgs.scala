package typings.winrt.Windows.Media.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RedialRequestedEventArgs
  extends StObject
     with IRedialRequestedEventArgs
object RedialRequestedEventArgs {
  
  inline def apply(handled: () => Unit): RedialRequestedEventArgs = {
    val __obj = js.Dynamic.literal(handled = js.Any.fromFunction0(handled))
    __obj.asInstanceOf[RedialRequestedEventArgs]
  }
}
