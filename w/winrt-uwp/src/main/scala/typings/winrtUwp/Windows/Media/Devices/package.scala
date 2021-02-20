package typings.winrtUwp.Windows.Media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Devices {
  
  /** Handles the AnswerRequested and AudioTransferRequested events. */
  type CallControlEventHandler = js.Function1[
    /* ev */ typings.winrtUwp.Windows.WinRTEvent[typings.winrtUwp.Windows.Media.Devices.CallControl], 
    scala.Unit
  ]
  
  /** Handles the DialRequested event. */
  type DialRequestedEventHandler = js.Function1[
    /* ev */ typings.winrtUwp.Windows.Media.Devices.DialRequestedEventArgs with typings.winrtUwp.Windows.WinRTEvent[typings.winrtUwp.Windows.Media.Devices.CallControl], 
    scala.Unit
  ]
  
  /** Handles the KeypadPressed event. */
  type KeypadPressedEventHandler = js.Function1[
    /* ev */ typings.winrtUwp.Windows.Media.Devices.KeypadPressedEventArgs with typings.winrtUwp.Windows.WinRTEvent[typings.winrtUwp.Windows.Media.Devices.CallControl], 
    scala.Unit
  ]
  
  /** Handles the RedialRequested event. */
  type RedialRequestedEventHandler = js.Function1[
    /* ev */ typings.winrtUwp.Windows.Media.Devices.RedialRequestedEventArgs with typings.winrtUwp.Windows.WinRTEvent[typings.winrtUwp.Windows.Media.Devices.CallControl], 
    scala.Unit
  ]
}
