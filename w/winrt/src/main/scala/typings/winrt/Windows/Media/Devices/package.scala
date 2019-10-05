package typings.winrt.Windows.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Devices {
  type CallControlEventHandler = js.Function1[/* sender */ CallControl, Unit]
  type DialRequestedEventHandler = js.Function2[/* sender */ CallControl, /* e */ DialRequestedEventArgs, Unit]
  type KeypadPressedEventHandler = js.Function2[/* sender */ CallControl, /* e */ KeypadPressedEventArgs, Unit]
  type RedialRequestedEventHandler = js.Function2[/* sender */ CallControl, /* e */ RedialRequestedEventArgs, Unit]
}
