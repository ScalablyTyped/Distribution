package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** DeleteEnvironmentResponse. */
@js.native
trait DeleteEnvironmentResponse extends js.Object {
  /** The unique identifier for the environment. */
  var environment_id: String = js.native
  /** Status of the environment. */
  var status: String = js.native
}

object DeleteEnvironmentResponse {
  @scala.inline
  def apply(environment_id: String, status: String): DeleteEnvironmentResponse = {
    val __obj = js.Dynamic.literal(environment_id = environment_id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEnvironmentResponse]
  }
  @scala.inline
  implicit class DeleteEnvironmentResponseOps[Self <: DeleteEnvironmentResponse] (val x: Self) extends AnyVal {
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
    def setEnvironment_id(value: String): Self = this.set("environment_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

