package typings.winrtUwp.Windows.Foundation.Collections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the changed event of a map collection. */
@js.native
trait IMapChangedEventArgs[K] extends js.Object {
  /** Gets the type of change that occurred in the map. */
  var collectionChange: CollectionChange = js.native
  /** Gets the key of the item that changed. */
  var key: K = js.native
}

object IMapChangedEventArgs {
  @scala.inline
  def apply[K](collectionChange: CollectionChange, key: K): IMapChangedEventArgs[K] = {
    val __obj = js.Dynamic.literal(collectionChange = collectionChange.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMapChangedEventArgs[K]]
  }
  @scala.inline
  implicit class IMapChangedEventArgsOps[Self <: IMapChangedEventArgs[_], K] (val x: Self with IMapChangedEventArgs[K]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCollectionChange(value: CollectionChange): Self = this.set("collectionChange", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: K): Self = this.set("key", value.asInstanceOf[js.Any])
  }
  
}

