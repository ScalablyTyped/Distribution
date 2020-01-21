package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Object returned after credentials are deleted. */
trait DeleteCredentials extends js.Object {
  /** The unique identifier of the credentials that have been deleted. */
  var credential_id: js.UndefOr[String] = js.undefined
  /** The status of the deletion request. */
  var status: js.UndefOr[String] = js.undefined
}

object DeleteCredentials {
  @scala.inline
  def apply(credential_id: String = null, status: String = null): DeleteCredentials = {
    val __obj = js.Dynamic.literal()
    if (credential_id != null) __obj.updateDynamic("credential_id")(credential_id.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCredentials]
  }
}

