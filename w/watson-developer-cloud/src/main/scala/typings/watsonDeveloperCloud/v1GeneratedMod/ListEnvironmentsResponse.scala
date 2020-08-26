package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** ListEnvironmentsResponse. */
@js.native
trait ListEnvironmentsResponse extends js.Object {
  /** An array of [environments] that are available for the service instance. */
  var environments: js.UndefOr[js.Array[Environment]] = js.native
}

object ListEnvironmentsResponse {
  @scala.inline
  def apply(): ListEnvironmentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEnvironmentsResponse]
  }
  @scala.inline
  implicit class ListEnvironmentsResponseOps[Self <: ListEnvironmentsResponse] (val x: Self) extends AnyVal {
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
    def setEnvironmentsVarargs(value: Environment*): Self = this.set("environments", js.Array(value :_*))
    @scala.inline
    def setEnvironments(value: js.Array[Environment]): Self = this.set("environments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironments: Self = this.set("environments", js.undefined)
  }
  
}

