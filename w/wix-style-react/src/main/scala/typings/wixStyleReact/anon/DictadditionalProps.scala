package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictadditionalProps
  extends StObject
     with /* additionalProps */ StringDictionary[js.Any] {
  
  var as: /* keyof wix-style-react.anon.OmitPolyfillHTMLElementTa */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 117 */ js.Any
  
  var onClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
}
object DictadditionalProps {
  
  @scala.inline
  def apply(
    as: /* keyof wix-style-react.anon.OmitPolyfillHTMLElementTa */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 117 */ js.Any
  ): DictadditionalProps = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictadditionalProps]
  }
  
  @scala.inline
  implicit class DictadditionalPropsMutableBuilder[Self <: DictadditionalProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAs(
      value: /* keyof wix-style-react.anon.OmitPolyfillHTMLElementTa */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 117 */ js.Any
    ): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClick(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
  }
}
