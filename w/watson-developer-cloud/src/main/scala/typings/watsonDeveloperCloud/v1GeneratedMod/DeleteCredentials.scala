package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Object returned after credentials are deleted. */
@js.native
trait DeleteCredentials extends js.Object {
  /** The unique identifier of the credentials that have been deleted. */
  var credential_id: js.UndefOr[String] = js.native
  /** The status of the deletion request. */
  var status: js.UndefOr[String] = js.native
}

object DeleteCredentials {
  @scala.inline
  def apply(): DeleteCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteCredentials]
  }
  @scala.inline
  implicit class DeleteCredentialsOps[Self <: DeleteCredentials] (val x: Self) extends AnyVal {
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
    def setCredential_id(value: String): Self = this.set("credential_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCredential_id: Self = this.set("credential_id", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

