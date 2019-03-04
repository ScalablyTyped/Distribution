package typings
package superagentLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bearer extends js.Object {
  var `type`: superagentLib.superagentLibStrings.bearer
}

object Anon_Bearer {
  @scala.inline
  def apply(`type`: superagentLib.superagentLibStrings.bearer): Anon_Bearer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Bearer]
  }
}

