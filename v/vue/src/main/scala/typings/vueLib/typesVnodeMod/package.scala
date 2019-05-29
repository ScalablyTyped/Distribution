package typings
package vueLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesVnodeMod {
  type NormalizedScopedSlot = js.Function1[/* props */ js.Any, ScopedSlotChildren]
  type ScopedSlot = js.Function1[/* props */ js.Any, ScopedSlotReturnValue]
  type ScopedSlotChildren = js.UndefOr[js.Array[VNode]]
  /* Rewritten from type alias, can be one of: 
    - VNode
    - java.lang.String
    - scala.Boolean
    - scala.Null
    - `js.undefined`
    - scala.Nothing
    - ScopedSlotReturnArray
  */
  type ScopedSlotReturnValue = js.UndefOr[_ScopedSlotReturnValue | java.lang.String | scala.Boolean | scala.Null]
  type VNodeChildren = js.UndefOr[
    VNodeChildrenArrayContents | js.Array[ScopedSlot] | java.lang.String | scala.Boolean | scala.Null
  ]
}
