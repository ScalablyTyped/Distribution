package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictadditionalPropsAs
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var as: /* keyof wix-style-react.anon.OmitPolyfillHTMLElementTa */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 109, starting with typings.wixStyleReact.wixStyleReactStrings.thead, typings.wixStyleReact.wixStyleReactStrings.map, typings.wixStyleReact.wixStyleReactStrings.main */ Any
  
  var onClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
}
object DictadditionalPropsAs {
  
  inline def apply(
    as: /* keyof wix-style-react.anon.OmitPolyfillHTMLElementTa */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 109, starting with typings.wixStyleReact.wixStyleReactStrings.thead, typings.wixStyleReact.wixStyleReactStrings.map, typings.wixStyleReact.wixStyleReactStrings.main */ Any
  ): DictadditionalPropsAs = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictadditionalPropsAs]
  }
  
  extension [Self <: DictadditionalPropsAs](x: Self) {
    
    inline def setAs(
      value: /* keyof wix-style-react.anon.OmitPolyfillHTMLElementTa */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 109, starting with typings.wixStyleReact.wixStyleReactStrings.thead, typings.wixStyleReact.wixStyleReactStrings.map, typings.wixStyleReact.wixStyleReactStrings.main */ Any
    ): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
  }
}
