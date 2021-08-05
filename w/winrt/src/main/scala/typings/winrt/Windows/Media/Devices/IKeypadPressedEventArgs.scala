package typings.winrt.Windows.Media.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IKeypadPressedEventArgs extends StObject {
  
  var telephonyKey: TelephonyKey
}
object IKeypadPressedEventArgs {
  
  inline def apply(telephonyKey: TelephonyKey): IKeypadPressedEventArgs = {
    val __obj = js.Dynamic.literal(telephonyKey = telephonyKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeypadPressedEventArgs]
  }
  
  extension [Self <: IKeypadPressedEventArgs](x: Self) {
    
    inline def setTelephonyKey(value: TelephonyKey): Self = StObject.set(x, "telephonyKey", value.asInstanceOf[js.Any])
  }
}
