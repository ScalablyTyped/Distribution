package typings.winrtUwp.global.Windows.Media.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information for the KeypadPressed event. */
/* note: abstract class */ @JSGlobal("Windows.Media.Devices.KeypadPressedEventArgs")
@js.native
open class KeypadPressedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Devices.KeypadPressedEventArgs {
  
  /** Returns the value of the keypad button on the device that was pressed. */
  /* CompleteClass */
  var telephonyKey: typings.winrtUwp.Windows.Media.Devices.TelephonyKey = js.native
}
