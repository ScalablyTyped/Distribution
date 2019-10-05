package typings.winrt.Windows.System

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Threading {
  import typings.winrt.Windows.Foundation.IAsyncAction

  type TimerDestroyedHandler = js.Function1[/* timer */ ThreadPoolTimer, Unit]
  type TimerElapsedHandler = js.Function1[/* timer */ ThreadPoolTimer, Unit]
  type WorkItemHandler = js.Function1[/* operation */ IAsyncAction, Unit]
}
