package typings.winrtUwp.Windows.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Collections {
  
  /** Represents the method that handles the changed event of an observable map. */
  type MapChangedEventHandler[K, V] = js.Function1[
    /* ev */ typings.winrtUwp.Windows.Foundation.Collections.IMapChangedEventArgs[K] with (typings.winrtUwp.Windows.WinRTEvent[typings.winrtUwp.Windows.Foundation.Collections.IObservableMap[K, V]]), 
    scala.Unit
  ]
}
