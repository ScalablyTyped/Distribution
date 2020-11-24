package typings.uifabricReactHooks

import typings.react.mod.RefObject
import typings.std.Element
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.Window
import typings.uifabricUtilities.pointMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uifabric/react-hooks/lib/useTarget", JSImport.Namespace)
@js.native
object useTargetMod extends js.Object {
  
  def useTarget[TElement /* <: HTMLElement */](): js.Tuple2[RefObject[Element | MouseEvent | Point | Null], js.UndefOr[Window]] = js.native
  def useTarget[TElement /* <: HTMLElement */](target: js.UndefOr[Target], hostElement: RefObject[Null | TElement]): js.Tuple2[RefObject[Element | MouseEvent | Point | Null], js.UndefOr[Window]] = js.native
  def useTarget[TElement /* <: HTMLElement */](target: Target): js.Tuple2[RefObject[Element | MouseEvent | Point | Null], js.UndefOr[Window]] = js.native
  
  type Target = Element | String | MouseEvent | Point | Null | RefObject[Element]
}
