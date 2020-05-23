package typings.vis.anon

import typings.vis.mod.IdType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FromId extends js.Object {
  var fromId: IdType
  var toId: IdType
}

object FromId {
  @scala.inline
  def apply(fromId: IdType, toId: IdType): FromId = {
    val __obj = js.Dynamic.literal(fromId = fromId.asInstanceOf[js.Any], toId = toId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromId]
  }
}

