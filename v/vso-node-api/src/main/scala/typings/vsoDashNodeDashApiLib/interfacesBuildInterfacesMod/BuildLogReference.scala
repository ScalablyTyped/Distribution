package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildLogReference extends js.Object {
  /**
    * The ID of the log.
    */
  var id: scala.Double
  /**
    * The type of the log location.
    */
  var `type`: java.lang.String
  /**
    * A full link to the log resource.
    */
  var url: java.lang.String
}

object BuildLogReference {
  @scala.inline
  def apply(id: scala.Double, `type`: java.lang.String, url: java.lang.String): BuildLogReference = {
    val __obj = js.Dynamic.literal(id = id, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BuildLogReference]
  }
}

