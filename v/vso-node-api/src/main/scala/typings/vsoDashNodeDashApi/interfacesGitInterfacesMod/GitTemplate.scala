package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitTemplate extends js.Object {
  /**
    * Name of the Template
    */
  var name: String
  /**
    * Type of the Template
    */
  var `type`: String
}

object GitTemplate {
  @scala.inline
  def apply(name: String, `type`: String): GitTemplate = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GitTemplate]
  }
}

