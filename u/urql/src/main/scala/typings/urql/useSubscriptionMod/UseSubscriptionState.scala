package typings.urql.useSubscriptionMod

import typings.std.Record
import typings.urqlCore.mod.CombinedError
import typings.urqlCore.typesMod.Operation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseSubscriptionState[T] extends js.Object {
  var data: js.UndefOr[T] = js.native
  var error: js.UndefOr[CombinedError] = js.native
  var extensions: js.UndefOr[Record[String, _]] = js.native
  var fetching: Boolean = js.native
  var operation: js.UndefOr[Operation] = js.native
  var stale: Boolean = js.native
}

object UseSubscriptionState {
  @scala.inline
  def apply[T](fetching: Boolean, stale: Boolean): UseSubscriptionState[T] = {
    val __obj = js.Dynamic.literal(fetching = fetching.asInstanceOf[js.Any], stale = stale.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseSubscriptionState[T]]
  }
  @scala.inline
  implicit class UseSubscriptionStateOps[Self <: UseSubscriptionState[_], T] (val x: Self with UseSubscriptionState[T]) extends AnyVal {
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
    def setFetching(value: Boolean): Self = this.set("fetching", value.asInstanceOf[js.Any])
    @scala.inline
    def setStale(value: Boolean): Self = this.set("stale", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: T): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setError(value: CombinedError): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setExtensions(value: Record[String, _]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setOperation(value: Operation): Self = this.set("operation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperation: Self = this.set("operation", js.undefined)
  }
  
}

