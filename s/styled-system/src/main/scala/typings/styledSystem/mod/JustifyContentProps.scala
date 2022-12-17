package typings.styledSystem.mod

import typings.csstype.mod.Property.JustifyContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JustifyContentProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  /**
    * The CSS justify-content property defines how the browser distributes space between and around content items
    * along the main-axis of a flex container, and the inline axis of a grid container.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/justify-content)
    */
  var justifyContent: js.UndefOr[ResponsiveValue[JustifyContent, ThemeType]] = js.undefined
}
object JustifyContentProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): JustifyContentProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JustifyContentProps[ThemeType]]
  }
  
  extension [Self <: JustifyContentProps[?], ThemeType /* <: Theme[TLengthStyledSystem] */](x: Self & JustifyContentProps[ThemeType]) {
    
    inline def setJustifyContent(value: ResponsiveValue[JustifyContent, ThemeType]): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
    
    inline def setJustifyContentNull: Self = StObject.set(x, "justifyContent", null)
    
    inline def setJustifyContentUndefined: Self = StObject.set(x, "justifyContent", js.undefined)
    
    inline def setJustifyContentVarargs(value: (JustifyContent | Null)*): Self = StObject.set(x, "justifyContent", js.Array(value*))
  }
}
