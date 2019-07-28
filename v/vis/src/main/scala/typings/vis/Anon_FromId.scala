package typings.vis

import typings.vis.visMod.IdType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FromId extends js.Object {
  var fromId: IdType
  var toId: IdType
}

object Anon_FromId {
  @scala.inline
  def apply(fromId: IdType, toId: IdType): Anon_FromId = {
    val __obj = js.Dynamic.literal(fromId = fromId.asInstanceOf[js.Any], toId = toId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_FromId]
  }
}

