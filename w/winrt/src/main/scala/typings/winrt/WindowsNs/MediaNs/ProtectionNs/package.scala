package typings.winrt.WindowsNs.MediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ProtectionNs {
  type ComponentLoadFailedEventHandler = js.Function2[/* sender */ MediaProtectionManager, /* e */ ComponentLoadFailedEventArgs, Unit]
  type RebootNeededEventHandler = js.Function1[/* sender */ MediaProtectionManager, Unit]
  type ServiceRequestedEventHandler = js.Function2[/* sender */ MediaProtectionManager, /* e */ ServiceRequestedEventArgs, Unit]
}
