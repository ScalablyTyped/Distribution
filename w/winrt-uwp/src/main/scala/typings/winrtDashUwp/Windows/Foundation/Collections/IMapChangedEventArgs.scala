package typings.winrtDashUwp.Windows.Foundation.Collections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the changed event of a map collection. */
trait IMapChangedEventArgs[K] extends js.Object {
  /** Gets the type of change that occurred in the map. */
  var collectionChange: CollectionChange
  /** Gets the key of the item that changed. */
  var key: K
}

object IMapChangedEventArgs {
  @scala.inline
  def apply[K](collectionChange: CollectionChange, key: K): IMapChangedEventArgs[K] = {
    val __obj = js.Dynamic.literal(collectionChange = collectionChange.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IMapChangedEventArgs[K]]
  }
}

