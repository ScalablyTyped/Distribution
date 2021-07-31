package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictadditionalPropsOnClick
  extends StObject
     with /* additionalProps */ StringDictionary[js.Any] {
  
  var onClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
  
  var tagName: /* keyof wix-style-react.anon.OmitPolyfillHTMLElementTaAbbr */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 117 */ js.Any
}
object DictadditionalPropsOnClick {
  
  @scala.inline
  def apply(
    tagName: /* keyof wix-style-react.anon.OmitPolyfillHTMLElementTaAbbr */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 117 */ js.Any
  ): DictadditionalPropsOnClick = {
    val __obj = js.Dynamic.literal(tagName = tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictadditionalPropsOnClick]
  }
  
  @scala.inline
  implicit class DictadditionalPropsOnClickMutableBuilder[Self <: DictadditionalPropsOnClick] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnClick(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setTagName(
      value: /* keyof wix-style-react.anon.OmitPolyfillHTMLElementTaAbbr */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 117 */ js.Any
    ): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
  }
}
