package typings.superagent

import typings.superagent.superagentStrings.auto
import typings.superagent.superagentStrings.basic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAuto extends js.Object {
  var `type`: basic | auto
}

object AnonAuto {
  @scala.inline
  def apply(`type`: basic | auto): AnonAuto = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAuto]
  }
}

