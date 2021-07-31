package typings.wixUiCore.anon

import typings.wixUiCore.signatureInputTitleTitleMod.TitleChildrenFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<wix-ui-core.wix-ui-core/dist/standalone/src.TitleProps, 'children'> */
trait PickTitlePropschildrenChildren extends StObject {
  
  var children: js.UndefOr[TitleChildrenFn] = js.undefined
}
object PickTitlePropschildrenChildren {
  
  @scala.inline
  def apply(): PickTitlePropschildrenChildren = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickTitlePropschildrenChildren]
  }
  
  @scala.inline
  implicit class PickTitlePropschildrenChildrenMutableBuilder[Self <: PickTitlePropschildrenChildren] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: /* childrenFn */ `3` => typings.react.mod.global.JSX.Element): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}
