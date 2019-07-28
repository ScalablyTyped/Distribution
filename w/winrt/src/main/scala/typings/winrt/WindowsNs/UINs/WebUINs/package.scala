package typings.winrt.WindowsNs.UINs

import typings.winrt.WindowsNs.ApplicationModelNs.ActivationNs.IActivatedEventArgs
import typings.winrt.WindowsNs.ApplicationModelNs.ISuspendingEventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object WebUINs {
  type ActivatedEventHandler = js.Function2[/* sender */ js.Any, /* eventArgs */ IActivatedEventArgs, Unit]
  type NavigatedEventHandler = js.Function2[/* sender */ js.Any, /* e */ IWebUINavigatedEventArgs, Unit]
  type ResumingEventHandler = js.Function1[/* sender */ js.Any, Unit]
  type SuspendingEventHandler = js.Function2[/* sender */ js.Any, /* e */ ISuspendingEventArgs, Unit]
}
