package typings.superagent.anon

import typings.superagent.superagentStrings.auto
import typings.superagent.superagentStrings.basic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
  var `type`: basic | auto
}

object Type {
  @scala.inline
  def apply(`type`: basic | auto): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}

