package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepositoryWebhook extends js.Object {
  /**
    * The friendly name of the repository.
    */
  var name: java.lang.String
  /**
    * The type of the webhook.
    */
  var `type`: java.lang.String
  /**
    * The URL of the repository.
    */
  var url: java.lang.String
}

object RepositoryWebhook {
  @scala.inline
  def apply(name: java.lang.String, `type`: java.lang.String, url: java.lang.String): RepositoryWebhook = {
    val __obj = js.Dynamic.literal(name = name, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RepositoryWebhook]
  }
}

