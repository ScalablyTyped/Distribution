package typings.winrt.Windows.Media.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeypadPressedEventArgs
  extends StObject
     with IKeypadPressedEventArgs
object KeypadPressedEventArgs {
  
  @scala.inline
  def apply(telephonyKey: TelephonyKey): KeypadPressedEventArgs = {
    val __obj = js.Dynamic.literal(telephonyKey = telephonyKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeypadPressedEventArgs]
  }
}
