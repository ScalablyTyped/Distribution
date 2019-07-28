package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepositoryWebhook extends js.Object {
  /**
    * The friendly name of the repository.
    */
  var name: String
  /**
    * The type of the webhook.
    */
  var `type`: String
  /**
    * The URL of the repository.
    */
  var url: String
}

object RepositoryWebhook {
  @scala.inline
  def apply(name: String, `type`: String, url: String): RepositoryWebhook = {
    val __obj = js.Dynamic.literal(name = name, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RepositoryWebhook]
  }
}

