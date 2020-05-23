package typings.webgme.GmeCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pointer extends js.Object {
  var from: NodeId
  var to: NodeId
}

object Pointer {
  @scala.inline
  def apply(from: NodeId, to: NodeId): Pointer = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pointer]
  }
}

