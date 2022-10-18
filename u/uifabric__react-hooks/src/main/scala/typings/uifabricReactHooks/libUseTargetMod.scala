package typings.uifabricReactHooks

import typings.react.mod.RefObject
import typings.std.Element
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.Window
import typings.uifabricUtilities.libPointMod.Point
import typings.uifabricUtilities.mod.Rectangle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUseTargetMod {
  
  @JSImport("@uifabric/react-hooks/lib/useTarget", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useTarget[TElement /* <: HTMLElement */](): js.Tuple2[RefObject[Element | MouseEvent | Point | Rectangle | Null], js.UndefOr[Window]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTarget")().asInstanceOf[js.Tuple2[RefObject[Element | MouseEvent | Point | Rectangle | Null], js.UndefOr[Window]]]
  inline def useTarget[TElement /* <: HTMLElement */](target: Unit, hostElement: RefObject[TElement | Null]): js.Tuple2[RefObject[Element | MouseEvent | Point | Rectangle | Null], js.UndefOr[Window]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useTarget")(target.asInstanceOf[js.Any], hostElement.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[RefObject[Element | MouseEvent | Point | Rectangle | Null], js.UndefOr[Window]]]
  inline def useTarget[TElement /* <: HTMLElement */](target: Target): js.Tuple2[RefObject[Element | MouseEvent | Point | Rectangle | Null], js.UndefOr[Window]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTarget")(target.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[RefObject[Element | MouseEvent | Point | Rectangle | Null], js.UndefOr[Window]]]
  inline def useTarget[TElement /* <: HTMLElement */](target: Target, hostElement: RefObject[TElement | Null]): js.Tuple2[RefObject[Element | MouseEvent | Point | Rectangle | Null], js.UndefOr[Window]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useTarget")(target.asInstanceOf[js.Any], hostElement.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[RefObject[Element | MouseEvent | Point | Rectangle | Null], js.UndefOr[Window]]]
  
  type Target = Element | String | MouseEvent | Point | Rectangle | Null | RefObject[Element]
}
