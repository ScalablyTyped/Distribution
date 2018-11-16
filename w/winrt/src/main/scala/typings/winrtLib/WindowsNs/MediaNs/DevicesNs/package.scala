package typings
package winrtLib.WindowsNs.MediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object DevicesNs {
  type CallControlEventHandler = js.Function1[/* sender */ CallControl, scala.Unit]
  type DialRequestedEventHandler = js.Function2[/* sender */ CallControl, /* e */ DialRequestedEventArgs, scala.Unit]
  type KeypadPressedEventHandler = js.Function2[/* sender */ CallControl, /* e */ KeypadPressedEventArgs, scala.Unit]
  type RedialRequestedEventHandler = js.Function2[/* sender */ CallControl, /* e */ RedialRequestedEventArgs, scala.Unit]
}
