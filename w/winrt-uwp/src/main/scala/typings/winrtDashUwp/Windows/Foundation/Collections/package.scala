package typings.winrtDashUwp.Windows.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Collections {
  import typings.winrtDashUwp.Windows.WinRTEvent

  /** Represents the method that handles the changed event of an observable map. */
  type MapChangedEventHandler[K, V] = js.Function1[/* ev */ IMapChangedEventArgs[K] with (WinRTEvent[IObservableMap[K, V]]), Unit]
}
