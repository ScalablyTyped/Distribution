package typings
package vueLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesVnodeMod {
  type NormalizedScopedSlot = js.Function1[/* props */ js.Any, ScopedSlotChildren]
  type ScopedSlot = js.Function1[/* props */ js.Any, ScopedSlotReturnValue]
  type ScopedSlotChildren = js.UndefOr[js.Array[VNode]]
  type ScopedSlotReturnValue = js.UndefOr[VNode | java.lang.String | scala.Boolean | scala.Null | ScopedSlotReturnArray]
  type VNodeChildren = js.UndefOr[
    VNodeChildrenArrayContents | js.Array[ScopedSlot] | java.lang.String | scala.Boolean | scala.Null
  ]
}
