package typings.wixUiCore.anon

import typings.wixUiCore.titleTitleMod.TitleChildrenFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<wix-ui-core.wix-ui-core/dist/src/components/signature-input/title.TitleProps, 'children'> */
trait PickTitlePropschildren extends StObject {
  
  var children: js.UndefOr[TitleChildrenFn] = js.undefined
}
object PickTitlePropschildren {
  
  @scala.inline
  def apply(): PickTitlePropschildren = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickTitlePropschildren]
  }
  
  @scala.inline
  implicit class PickTitlePropschildrenMutableBuilder[Self <: PickTitlePropschildren] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: /* childrenFn */ GetTitleProps => typings.react.mod.global.JSX.Element): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}
