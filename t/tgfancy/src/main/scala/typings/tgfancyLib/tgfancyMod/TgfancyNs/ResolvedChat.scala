package typings
package tgfancyLib.tgfancyMod.TgfancyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedChat extends js.Object {
  var id: scala.Double | java.lang.String
  var `type`: java.lang.String
  var username: java.lang.String
  var when: java.lang.String
}

object ResolvedChat {
  @scala.inline
  def apply(
    id: scala.Double | java.lang.String,
    `type`: java.lang.String,
    username: java.lang.String,
    when: java.lang.String
  ): ResolvedChat = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], username = username, when = when)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ResolvedChat]
  }
}

