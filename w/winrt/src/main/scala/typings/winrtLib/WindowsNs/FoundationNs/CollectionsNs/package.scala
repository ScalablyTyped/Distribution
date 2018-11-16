package typings
package winrtLib.WindowsNs.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CollectionsNs {
  type MapChangedEventHandler[K, V] = js.Function2[/* sender */ IObservableMap[K, V], /* event */ IMapChangedEventArgs[K], scala.Unit]
  type VectorChangedEventHandler[T] = js.Function2[/* sender */ IObservableVector[T], /* event */ IVectorChangedEventArgs, scala.Unit]
}
