package typings.superfine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VNode[TTagName /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 172 */ js.Any */] extends js.Object {
  val name: TTagName
}

object VNode {
  @scala.inline
  def apply[/* <: / * import warning: LimitUnionLength.leaveTypeRef Was union type with length 172 * / js.Any */ TTagName](name: TTagName): VNode[TTagName] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[VNode[TTagName]]
  }
}

