package typings.urqlCore.typesMod

import typings.std.Record
import typings.urqlCore.errorMod.CombinedError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperationResult[Data] extends js.Object {
  /** The data returned from the Graphql server. */
  var data: js.UndefOr[Data] = js.native
  /** Any errors resulting from the operation. */
  var error: js.UndefOr[CombinedError] = js.native
  /** Optional extensions return by the Graphql server. */
  var extensions: js.UndefOr[Record[String, _]] = js.native
  /** The [operation]{@link Operation} which has been executed. */
  var operation: Operation = js.native
  /** Optional stale flag added by exchanges that return stale results. */
  var stale: js.UndefOr[Boolean] = js.native
}

object OperationResult {
  @scala.inline
  def apply[Data](operation: Operation): OperationResult[Data] = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationResult[Data]]
  }
  @scala.inline
  implicit class OperationResultOps[Self <: OperationResult[_], Data] (val x: Self with OperationResult[Data]) extends AnyVal {
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
    def setOperation(value: Operation): Self = this.set("operation", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: Data): Self = this.set("data", value.asInstanceOf[js.Any])
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
    def setStale(value: Boolean): Self = this.set("stale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStale: Self = this.set("stale", js.undefined)
  }
  
}

