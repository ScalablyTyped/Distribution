package typings
package winrtLib.WindowsNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object WebUINs {
  type ActivatedEventHandler = js.Function2[
    /* sender */ js.Any, 
    /* eventArgs */ winrtLib.WindowsNs.ApplicationModelNs.ActivationNs.IActivatedEventArgs, 
    scala.Unit
  ]
  type NavigatedEventHandler = js.Function2[/* sender */ js.Any, /* e */ IWebUINavigatedEventArgs, scala.Unit]
  type ResumingEventHandler = js.Function1[/* sender */ js.Any, scala.Unit]
  type SuspendingEventHandler = js.Function2[
    /* sender */ js.Any, 
    /* e */ winrtLib.WindowsNs.ApplicationModelNs.ISuspendingEventArgs, 
    scala.Unit
  ]
}
