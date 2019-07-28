package typings.winrt.WindowsNs.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CollectionsNs {
  type MapChangedEventHandler[K, V] = js.Function2[/* sender */ IObservableMap[K, V], /* event */ IMapChangedEventArgs[K], Unit]
  type VectorChangedEventHandler[T] = js.Function2[/* sender */ IObservableVector[T], /* event */ IVectorChangedEventArgs, Unit]
}
