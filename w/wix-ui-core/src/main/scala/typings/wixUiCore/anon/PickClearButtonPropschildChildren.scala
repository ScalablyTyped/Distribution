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
  
  inline def apply(): PickClearButtonPropschildChildren = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickClearButtonPropschildChildren]
  }
  
  extension [Self <: PickClearButtonPropschildChildren](x: Self) {
    
    inline def setChildren(value: /* childrenFn */ `2` => typings.react.mod.global.JSX.Element): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}
