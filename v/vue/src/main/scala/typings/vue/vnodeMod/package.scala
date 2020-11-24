package typings.vue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object vnodeMod {
  
  type NormalizedScopedSlot = js.Function1[/* props */ js.Any, typings.vue.vnodeMod.ScopedSlotChildren]
  
  type ScopedSlot = js.Function1[/* props */ js.Any, typings.vue.vnodeMod.ScopedSlotReturnValue]
  
  type ScopedSlotChildren = js.UndefOr[js.Array[typings.vue.vnodeMod.VNode]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.vue.vnodeMod.VNode
    - java.lang.String
    - scala.Boolean
    - scala.Null
    - js.UndefOr[scala.Nothing]
    - typings.vue.vnodeMod.ScopedSlotReturnArray
  */
  type ScopedSlotReturnValue = js.UndefOr[
    typings.vue.vnodeMod._ScopedSlotReturnValue | java.lang.String | scala.Boolean | scala.Null
  ]
  
  type VNodeChildren = js.UndefOr[
    typings.vue.vnodeMod.VNodeChildrenArrayContents | js.Array[typings.vue.vnodeMod.ScopedSlot] | java.lang.String | scala.Boolean | scala.Null
  ]
}
