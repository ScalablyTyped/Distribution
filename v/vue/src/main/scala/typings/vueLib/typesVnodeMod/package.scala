package typings
package vueLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesVnodeMod {
  type ScopedSlot = js.Function1[/* props */ js.Any, ScopedSlotChildren]
  type ScopedSlotChildren = js.UndefOr[js.Array[VNode]]
  type VNodeChildren = js.UndefOr[
    VNodeChildrenArrayContents | js.Array[ScopedSlot] | java.lang.String | scala.Boolean | scala.Null
  ]
}
