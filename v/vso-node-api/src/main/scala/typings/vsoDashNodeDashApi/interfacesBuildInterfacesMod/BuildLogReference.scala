package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildLogReference extends js.Object {
  /**
    * The ID of the log.
    */
  var id: Double
  /**
    * The type of the log location.
    */
  var `type`: String
  /**
    * A full link to the log resource.
    */
  var url: String
}

object BuildLogReference {
  @scala.inline
  def apply(id: Double, `type`: String, url: String): BuildLogReference = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildLogReference]
  }
}

