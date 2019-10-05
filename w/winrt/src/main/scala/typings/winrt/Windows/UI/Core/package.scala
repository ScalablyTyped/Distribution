package typings.winrt.Windows.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Core {
  type DispatchedHandler = js.Function0[Unit]
  type IdleDispatchedHandler = js.Function1[/* e */ IdleDispatchedHandlerArgs, Unit]
}
