package typings.winrt.Windows.System.Threading

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Core {
  type SignalHandler = js.Function2[/* signalNotifier */ SignalNotifier, /* timedOut */ Boolean, Unit]
}
