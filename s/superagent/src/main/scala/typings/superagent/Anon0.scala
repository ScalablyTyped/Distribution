package typings.superagent

import typings.superagent.superagentStrings.bearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0 extends js.Object {
  var `type`: bearer
}

object Anon0 {
  @scala.inline
  def apply(`type`: bearer): Anon0 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon0]
  }
}

