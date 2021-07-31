package typings.wixUiCore.anon

import typings.wixUiCore.signatureInputClearButtonClearButtonMod.ClearButtonChildrenFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<wix-ui-core.wix-ui-core/dist/standalone/src/components/signature-input/clear-button.ClearButtonProps, 'children'> */
trait PickClearButtonPropschildChildren extends StObject {
  
  var children: js.UndefOr[ClearButtonChildrenFn] = js.undefined
}
object PickClearButtonPropschildChildren {
  
  @scala.inline
  def apply(): PickClearButtonPropschildChildren = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickClearButtonPropschildChildren]
  }
  
  @scala.inline
  implicit class PickClearButtonPropschildChildrenMutableBuilder[Self <: PickClearButtonPropschildChildren] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: /* childrenFn */ `2` => typings.react.mod.global.JSX.Element): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}
