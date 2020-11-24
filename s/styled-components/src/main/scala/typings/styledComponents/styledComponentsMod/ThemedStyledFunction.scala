package typings.styledComponents.styledComponentsMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThemedStyledFunction[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any */, T /* <: js.Object */, O /* <: js.Object */, A /* <: /* keyof any */ String */] extends ThemedStyledFunctionBase[C, T, O, A] {
  
  // Fun thing: 'attrs' can also provide a polymorphic 'as' prop
  // My head already hurts enough so maybe later...
  def attrs[U, NewA /* <: (Partial[StyledComponentPropsWithRef[C] with U]) with StringDictionary[js.Any] */](attrs: Attrs[StyledComponentPropsWithRef[C] with U, NewA, T]): ThemedStyledFunction[C, T, O with NewA, A | (/* keyof NewA */ String)] = js.native
  
  def withConfig[Props /* <: O */](config: StyledConfig[StyledComponentPropsWithRef[C] with Props]): ThemedStyledFunction[C, T, Props, A] = js.native
}
