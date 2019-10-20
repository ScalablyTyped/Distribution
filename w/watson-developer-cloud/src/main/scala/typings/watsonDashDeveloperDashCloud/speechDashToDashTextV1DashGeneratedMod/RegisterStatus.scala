package typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** RegisterStatus. */
trait RegisterStatus extends js.Object {
  /** The current status of the job: * `created`: The service successfully white-listed the callback URL as a result of the call. * `already created`: The URL was already white-listed. */
  var status: String
  /** The callback URL that is successfully registered. */
  var url: String
}

object RegisterStatus {
  @scala.inline
  def apply(status: String, url: String): RegisterStatus = {
    val __obj = js.Dynamic.literal(status = status, url = url)
  
    __obj.asInstanceOf[RegisterStatus]
  }
}

