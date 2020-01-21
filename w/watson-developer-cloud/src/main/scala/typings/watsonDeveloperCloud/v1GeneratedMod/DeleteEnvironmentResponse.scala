package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** DeleteEnvironmentResponse. */
trait DeleteEnvironmentResponse extends js.Object {
  /** The unique identifier for the environment. */
  var environment_id: String
  /** Status of the environment. */
  var status: String
}

object DeleteEnvironmentResponse {
  @scala.inline
  def apply(environment_id: String, status: String): DeleteEnvironmentResponse = {
    val __obj = js.Dynamic.literal(environment_id = environment_id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteEnvironmentResponse]
  }
}

