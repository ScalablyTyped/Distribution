package typings.winrt.Windows.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Collections {
  type MapChangedEventHandler[K, V] = js.Function2[
    /* sender */ typings.winrt.Windows.Foundation.Collections.IObservableMap[K, V], 
    /* event */ typings.winrt.Windows.Foundation.Collections.IMapChangedEventArgs[K], 
    scala.Unit
  ]
  type VectorChangedEventHandler[T] = js.Function2[
    /* sender */ typings.winrt.Windows.Foundation.Collections.IObservableVector[T], 
    /* event */ typings.winrt.Windows.Foundation.Collections.IVectorChangedEventArgs, 
    scala.Unit
  ]
}
