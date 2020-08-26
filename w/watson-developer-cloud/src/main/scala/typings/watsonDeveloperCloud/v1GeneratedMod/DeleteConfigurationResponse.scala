package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** DeleteConfigurationResponse. */
@js.native
trait DeleteConfigurationResponse extends js.Object {
  /** The unique identifier for the configuration. */
  var configuration_id: String = js.native
  /** An array of notice messages, if any. */
  var notices: js.UndefOr[js.Array[Notice]] = js.native
  /** Status of the configuration. A deleted configuration has the status deleted. */
  var status: String = js.native
}

object DeleteConfigurationResponse {
  @scala.inline
  def apply(configuration_id: String, status: String): DeleteConfigurationResponse = {
    val __obj = js.Dynamic.literal(configuration_id = configuration_id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConfigurationResponse]
  }
  @scala.inline
  implicit class DeleteConfigurationResponseOps[Self <: DeleteConfigurationResponse] (val x: Self) extends AnyVal {
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
    def setConfiguration_id(value: String): Self = this.set("configuration_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setNoticesVarargs(value: Notice*): Self = this.set("notices", js.Array(value :_*))
    @scala.inline
    def setNotices(value: js.Array[Notice]): Self = this.set("notices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotices: Self = this.set("notices", js.undefined)
  }
  
}

