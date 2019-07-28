package typings.superagent

import typings.superagent.superagentStrings.auto
import typings.superagent.superagentStrings.basic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Auto extends js.Object {
  var `type`: basic | auto
}

object Anon_Auto {
  @scala.inline
  def apply(`type`: basic | auto): Anon_Auto = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Auto]
  }
}

