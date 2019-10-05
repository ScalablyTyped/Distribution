package typings.winrt.Windows.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object WebUI {
  import typings.winrt.Windows.ApplicationModel.Activation.IActivatedEventArgs
  import typings.winrt.Windows.ApplicationModel.ISuspendingEventArgs

  type ActivatedEventHandler = js.Function2[/* sender */ js.Any, /* eventArgs */ IActivatedEventArgs, Unit]
  type NavigatedEventHandler = js.Function2[/* sender */ js.Any, /* e */ IWebUINavigatedEventArgs, Unit]
  type ResumingEventHandler = js.Function1[/* sender */ js.Any, Unit]
  type SuspendingEventHandler = js.Function2[/* sender */ js.Any, /* e */ ISuspendingEventArgs, Unit]
}
