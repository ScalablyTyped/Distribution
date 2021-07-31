package typings.wixUiCore.anon

import typings.wixUiCore.componentsSignatureInputTitleTitleMod.TitleChildrenFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<wix-ui-core.wix-ui-core/src/components/signature-input/title/Title.TitleProps, 'children'> */
trait PickTitlePropschildren0 extends StObject {
  
  var children: js.UndefOr[TitleChildrenFn] = js.undefined
}
object PickTitlePropschildren0 {
  
  @scala.inline
  def apply(): PickTitlePropschildren0 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickTitlePropschildren0]
  }
  
  @scala.inline
  implicit class PickTitlePropschildren0MutableBuilder[Self <: PickTitlePropschildren0] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: /* childrenFn */ `6` => typings.react.mod.global.JSX.Element): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}
