package typings.superfine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Child[TTagName /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 172 */ js.Any */] = java.lang.String | typings.superfine.mod.VNode[TTagName]
  type Children[TTagName /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 172 */ js.Any */] = typings.superfine.mod.Child[TTagName] | js.Array[typings.superfine.mod.Child[TTagName]]
}
