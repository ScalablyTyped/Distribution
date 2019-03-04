package typings
package winrtLib.WindowsNs.FoundationNs.CollectionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMapChangedEventArgs[K] extends js.Object {
  var collectionChange: CollectionChange
  var key: K
}

object IMapChangedEventArgs {
  @scala.inline
  def apply[K](collectionChange: CollectionChange, key: K): IMapChangedEventArgs[K] = {
    val __obj = js.Dynamic.literal(collectionChange = collectionChange, key = key.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IMapChangedEventArgs[K]]
  }
}

