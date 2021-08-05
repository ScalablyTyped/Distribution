package typings.wixUiCore.anon

import typings.wixUiCore.clearButtonClearButtonMod.ClearButtonChildrenFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<wix-ui-core.wix-ui-core/dist/src/components/signature-input/clear-button.ClearButtonProps, 'children'> */
trait PickClearButtonPropschild extends StObject {
  
  var children: js.UndefOr[ClearButtonChildrenFn] = js.undefined
}
object PickClearButtonPropschild {
  
  inline def apply(): PickClearButtonPropschild = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickClearButtonPropschild]
  }
  
  extension [Self <: PickClearButtonPropschild](x: Self) {
    
    inline def setChildren(value: /* childrenFn */ GetClearButtonProps => typings.react.mod.global.JSX.Element): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}
