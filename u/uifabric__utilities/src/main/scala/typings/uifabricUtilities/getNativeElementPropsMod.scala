package typings.uifabricUtilities

import typings.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/getNativeElementProps", JSImport.Namespace)
@js.native
object getNativeElementPropsMod extends js.Object {
  def getNativeElementProps[TAttributes /* <: HTMLAttributes[_] */](
    tagName: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any,
    props: js.Object
  ): TAttributes = js.native
  def getNativeElementProps[TAttributes /* <: HTMLAttributes[_] */](
    tagName: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any,
    props: js.Object,
    excludedPropNames: js.Array[String]
  ): TAttributes = js.native
}

