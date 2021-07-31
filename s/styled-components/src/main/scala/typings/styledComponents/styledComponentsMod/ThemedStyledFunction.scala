package typings.styledComponents.styledComponentsMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThemedStyledFunction[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any */, T /* <: js.Object */, O /* <: js.Object */, A /* <: /* keyof any */ String */]
  extends StObject
     with ThemedStyledFunctionBase[C, T, O, A] {
  
  // Fun thing: 'attrs' can also provide a polymorphic 'as' prop
  // My head already hurts enough so maybe later...
  def attrs[U, NewA /* <: (Partial[StyledComponentPropsWithRef[C] & U]) & StringDictionary[js.Any] */](attrs: Attrs[StyledComponentPropsWithRef[C] & U, NewA, T]): ThemedStyledFunction[C, T, O & NewA, A | (/* keyof NewA */ String)] = js.native
  
  def withConfig[Props /* <: O */](config: StyledConfig[StyledComponentPropsWithRef[C] & Props]): ThemedStyledFunction[C, T, Props, A] = js.native
}
