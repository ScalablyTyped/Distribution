package typings
package visLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FromId extends js.Object {
  var fromId: visLib.visMod.IdType
  var toId: visLib.visMod.IdType
}

object Anon_FromId {
  @scala.inline
  def apply(fromId: visLib.visMod.IdType, toId: visLib.visMod.IdType): Anon_FromId = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fromId")(fromId.asInstanceOf[js.Any])
    __obj.updateDynamic("toId")(toId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FromId]
  }
}

