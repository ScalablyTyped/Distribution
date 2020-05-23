package typings.superagent.anon

import typings.superagent.superagentStrings.bearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `0` extends js.Object {
  var `type`: bearer
}

object `0` {
  @scala.inline
  def apply(`type`: bearer): `0` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
}

