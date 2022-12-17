package typings.styledSystem.mod

import typings.csstype.mod.Property.AlignContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlignContentProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  /**
    * The CSS align-content property sets how the browser distributes space between and around content items
    * along the cross-axis of a flexbox container, and the main-axis of a grid container.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/align-content)
    */
  var alignContent: js.UndefOr[ResponsiveValue[AlignContent, ThemeType]] = js.undefined
}
object AlignContentProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): AlignContentProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlignContentProps[ThemeType]]
  }
  
  extension [Self <: AlignContentProps[?], ThemeType /* <: Theme[TLengthStyledSystem] */](x: Self & AlignContentProps[ThemeType]) {
    
    inline def setAlignContent(value: ResponsiveValue[AlignContent, ThemeType]): Self = StObject.set(x, "alignContent", value.asInstanceOf[js.Any])
    
    inline def setAlignContentNull: Self = StObject.set(x, "alignContent", null)
    
    inline def setAlignContentUndefined: Self = StObject.set(x, "alignContent", js.undefined)
    
    inline def setAlignContentVarargs(value: (AlignContent | Null)*): Self = StObject.set(x, "alignContent", js.Array(value*))
  }
}
