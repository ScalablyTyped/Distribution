package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitTemplate extends js.Object {
  /**
    * Name of the Template
    */
  var name: java.lang.String
  /**
    * Type of the Template
    */
  var `type`: java.lang.String
}

object GitTemplate {
  @scala.inline
  def apply(name: java.lang.String, `type`: java.lang.String): GitTemplate = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[GitTemplate]
  }
}

