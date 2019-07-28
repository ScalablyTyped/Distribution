package typings.winrtDashUwp.WindowsNs.FoundationNs

import typings.winrtDashUwp.WindowsNs.WinRTEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CollectionsNs {
  /** Represents the method that handles the changed event of an observable map. */
  type MapChangedEventHandler[K, V] = js.Function1[/* ev */ IMapChangedEventArgs[K] with (WinRTEvent[IObservableMap[K, V]]), Unit]
}
