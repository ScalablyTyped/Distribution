package typings.vsoNodeApi.gitInterfacesMod

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
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitTemplate]
  }
}

