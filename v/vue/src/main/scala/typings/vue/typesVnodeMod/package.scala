package typings.vue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesVnodeMod {
  type NormalizedScopedSlot = js.Function1[/* props */ js.Any, ScopedSlotChildren]
  type ScopedSlot = js.Function1[/* props */ js.Any, ScopedSlotReturnValue]
  type ScopedSlotChildren = js.UndefOr[js.Array[VNode]]
  /* Rewritten from type alias, can be one of: 
    - typings.vue.typesVnodeMod.VNode
    - java.lang.String
    - scala.Boolean
    - scala.Null
    - `js.undefined`
    - typings.vue.typesVnodeMod.ScopedSlotReturnArray
  */
  type ScopedSlotReturnValue = js.UndefOr[_ScopedSlotReturnValue | String | Boolean | Null]
  type VNodeChildren = js.UndefOr[VNodeChildrenArrayContents | js.Array[ScopedSlot] | String | Boolean | Null]
}
