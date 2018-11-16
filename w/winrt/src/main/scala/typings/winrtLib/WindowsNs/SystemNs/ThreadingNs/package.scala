package typings
package winrtLib.WindowsNs.SystemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ThreadingNs {
  type TimerDestroyedHandler = js.Function1[/* timer */ ThreadPoolTimer, scala.Unit]
  type TimerElapsedHandler = js.Function1[/* timer */ ThreadPoolTimer, scala.Unit]
  type WorkItemHandler = js.Function1[/* operation */ winrtLib.WindowsNs.FoundationNs.IAsyncAction, scala.Unit]
}
