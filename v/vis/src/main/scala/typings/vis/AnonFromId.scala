package typings.vis

import typings.vis.mod.IdType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFromId extends js.Object {
  var fromId: IdType
  var toId: IdType
}

object AnonFromId {
  @scala.inline
  def apply(fromId: IdType, toId: IdType): AnonFromId = {
    val __obj = js.Dynamic.literal(fromId = fromId.asInstanceOf[js.Any], toId = toId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFromId]
  }
}

