package typings.winrtDashUwp.WindowsNs.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CollectionsNs {
  import typings.winrtDashUwp.WindowsNs.WinRTEvent

  /** Represents the method that handles the changed event of an observable map. */
  type MapChangedEventHandler[K, V] = js.Function1[/* ev */ IMapChangedEventArgs[K] with (WinRTEvent[IObservableMap[K, V]]), Unit]
}
