package typings.urqlCore.ssrMod

import typings.urqlCore.anon.GraphQLErrors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SerializedResult extends js.Object {
  var data: js.UndefOr[js.Any] = js.native
  var error: js.UndefOr[GraphQLErrors] = js.native
}

object SerializedResult {
  @scala.inline
  def apply(): SerializedResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SerializedResult]
  }
  @scala.inline
  implicit class SerializedResultOps[Self <: SerializedResult] (val x: Self) extends AnyVal {
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
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setError(value: GraphQLErrors): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
  }
  
}

