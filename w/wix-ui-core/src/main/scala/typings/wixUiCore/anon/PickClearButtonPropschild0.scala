package typings.wixUiCore.anon

import typings.wixUiCore.componentsSignatureInputClearButtonClearButtonMod.ClearButtonChildrenFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<wix-ui-core.wix-ui-core/src/components/signature-input/clear-button.ClearButtonProps, 'children'> */
trait PickClearButtonPropschild0 extends StObject {
  
  var children: js.UndefOr[ClearButtonChildrenFn] = js.undefined
}
object PickClearButtonPropschild0 {
  
  inline def apply(): PickClearButtonPropschild0 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickClearButtonPropschild0]
  }
  
  extension [Self <: PickClearButtonPropschild0](x: Self) {
    
    inline def setChildren(value: /* childrenFn */ `5` => typings.react.mod.global.JSX.Element): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}
