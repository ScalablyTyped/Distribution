package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** ListConfigurationsResponse. */
@js.native
trait ListConfigurationsResponse extends js.Object {
  /** An array of Configurations that are available for the service instance. */
  var configurations: js.UndefOr[js.Array[Configuration]] = js.native
}

object ListConfigurationsResponse {
  @scala.inline
  def apply(): ListConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConfigurationsResponse]
  }
  @scala.inline
  implicit class ListConfigurationsResponseOps[Self <: ListConfigurationsResponse] (val x: Self) extends AnyVal {
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
    def setConfigurationsVarargs(value: Configuration*): Self = this.set("configurations", js.Array(value :_*))
    @scala.inline
    def setConfigurations(value: js.Array[Configuration]): Self = this.set("configurations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigurations: Self = this.set("configurations", js.undefined)
  }
  
}

