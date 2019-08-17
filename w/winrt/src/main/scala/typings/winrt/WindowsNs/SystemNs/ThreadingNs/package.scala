package typings.winrt.WindowsNs.SystemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ThreadingNs {
  import typings.winrt.WindowsNs.FoundationNs.IAsyncAction

  type TimerDestroyedHandler = js.Function1[/* timer */ ThreadPoolTimer, Unit]
  type TimerElapsedHandler = js.Function1[/* timer */ ThreadPoolTimer, Unit]
  type WorkItemHandler = js.Function1[/* operation */ IAsyncAction, Unit]
}
