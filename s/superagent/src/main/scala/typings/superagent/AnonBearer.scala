package typings.superagent

import typings.superagent.superagentStrings.bearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBearer extends js.Object {
  var `type`: bearer
}

object AnonBearer {
  @scala.inline
  def apply(`type`: bearer): AnonBearer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBearer]
  }
}

